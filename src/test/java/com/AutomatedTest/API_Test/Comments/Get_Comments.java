package com.AutomatedTest.API_Test.Comments;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Get_Comments {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("Display all info")
    public void test1() {

        Response response = given().
                get(baseURI + "/comments");
        assertEquals(200, response.getStatusCode());
        System.out.println(response.prettyPrint());

           }

    @Test
    @DisplayName("Get specific info and use 'is' for make sure info is matching")
    public void test2() {

        given().
                contentType(ContentType.JSON).

         when().
                get(baseURI + "/comments/1").
         then().
                body("name", is("serkan sam serdar")).log().all(true);

    }

    @Test
    @DisplayName("Get specific object by using map")
    public void test3() {
        JsonPath json = given().
                contentType(ContentType.JSON).
                when().
                get(baseURI + "/comments").thenReturn().jsonPath();

        Map<String, ?> sss = json.get("[3]");
        System.out.println(sss);
        System.out.println("============");
        String sss1 = json.get("[3].name");
        System.out.println(sss1);

    }

    @Test
    @DisplayName("Save payload into java collection")
    public void test4() {
        Response response = given().
                contentType(ContentType.JSON).
                when().
                get("/comments");

        List<Map<String, ?>> list = response.jsonPath().get();//to get all list seperately

        System.out.println(list);

    }

    @Test
    @DisplayName("use query param with hasSize and use assert ")
    public void test5() {
        given().
                contentType(ContentType.JSON).
                queryParam("_page", "1").
                queryParam("_limit", 3).
        when().
                get(baseURI + "/comments").
        then().
                body("title", hasSize(3)).log().all(true).assertThat().statusCode(200);

    }

    @Test
    @DisplayName("use path param and make sure result is correct")
    public void test6() {

        given().
                contentType(ContentType.JSON).
                pathParam("comments", "1").
                when().
                get(baseURI + "/comments/{comments}").
                then().body("name", containsString("serkan sam serdar")).log().all(true);

    }

    @Test
    @DisplayName("Display all info and get headers")
    public void test7() {
        Response response = given().
                contentType(ContentType.JSON).
                get(baseURI + "/comments");

        Headers header = response.getHeaders();
        System.out.println(response.getHeaders());

        for (Header h : header) {
            System.out.println(h);
        }
    }

    @Test
    @DisplayName("Use map for getting specific Key and Value")
    public void test8() {
        JsonPath json = given().
                contentType(ContentType.JSON).
                when().
                get(baseURI + "/comments").thenReturn().jsonPath();

        Map<String, ?> sss = json.get("[4]");
        System.out.println(sss);

        for (Map.Entry<String, ?> s : sss.entrySet()) {
            System.out.println("key: " + s.getKey() + " value: " + s.getValue());
        }

    }


    @Test
    @DisplayName("verify id 1 and email address is:serkanserdar@gmail.com")
    public void test9() {
        Response response = given().
                contentType(ContentType.JSON).
                pathParam("comments", 1).
        when().
                get("/comments/{comments}").prettyPeek();

        assertEquals(200, response.getStatusCode());
        String a = "serkanserdar@gmail.com";
        String actually = response.jsonPath().get("email");
        assertEquals(a, actually, "something wrong");
    }

}
