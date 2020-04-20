package com.AutomatedTest.API_Test.Posts;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Get_Posts {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("Display all info")
    public void test1() {

        Response response = given().
                get(baseURI + "/posts");
        assertEquals(200, response.getStatusCode());
        System.out.println(response.prettyPrint());

    }

    @Test
    @DisplayName("Display specific info")
    public void test2() {

        Response response = given().
                header("accept", "application/json").
                get(baseURI + "/posts/101");
        assertEquals(200, response.statusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    @DisplayName("use query param for get specific info")
    public void test3() {

        Response response = given().
                contentType(ContentType.JSON).
                queryParam("id", 1).
                get(baseURI + "/posts");
        assertEquals(200, response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    @DisplayName("use query param and make sure result is corrrect")
    public void test4() {

        Response response = given().
                contentType(ContentType.JSON).
                queryParam("_page","1").
                queryParam("_limit", 4).
                get(baseURI + "/posts");
        assertEquals(200, response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    @DisplayName("use query param and make sure result is corrrect")
    public void test5() {
        given().
                contentType(ContentType.JSON).
                queryParam("_page", "1").
                queryParam("_limit", 5).
                when().
                get(baseURI + "/posts").
                then().
                body("title", hasSize(5)).log().all(true);
    }

    @Test
    @DisplayName("use path param and make sure result is correct")
    public void test6() {

        given().
                contentType(ContentType.JSON).
                pathParam("posts", "1").
        when().
                get(baseURI + "/posts/{posts}").
        then(). body("title",containsString("serkan serdar")).log().all(true);

    }

    @Test
    @DisplayName("Get specific info and use 'is' for make sure info is match")
    public void test7() {

        given().
                contentType(ContentType.JSON).
                when().
                get(baseURI + "/posts/1").
                then().
                body("title",is("serkan serdar")).statusCode(200).log().all(true);

    }

    @Test
    @DisplayName("Display all info and get headers")
    public void test8() {
        Response response = given().
                contentType(ContentType.JSON).
                get(baseURI + "/posts");

        Headers header = response.getHeaders();
        System.out.println(response.getHeaders());

        for (Header h : header) {
            System.out.println(h);
        }
    }

    @Test
    @DisplayName("Use map for getting specific Key and Value")
    public void test9() {
        JsonPath json = given().
                contentType(ContentType.JSON).
                when().
                get(baseURI + "/posts").thenReturn().jsonPath();

        Map<String, ?> sss = json.get("[4]");
        System.out.println(sss);

        for (Map.Entry<String, ?> s : sss.entrySet()) {//get specific key and value
            System.out.println(s);
            System.out.println("===================");
            System.out.println("key: " + s.getKey() + " value: " + s.getValue());
        }

    }

    @Test
    @DisplayName("Verify that JSON body has following entries")
    public void test10 () {

        given().
                contentType(ContentType.JSON).
                pathParam("posts",1).
        when().
                get("/posts/{posts}").
        then().assertThat().assertThat().statusCode(200).
                body("",hasEntry("id",1)).
                body("",hasEntry("completed",false)).
                body("",hasEntry("title","serkan serdar")).
                body("",hasEntry("userId",2)).log().all(true);



    }
}

