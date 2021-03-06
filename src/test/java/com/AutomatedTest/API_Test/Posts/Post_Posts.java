package com.AutomatedTest.API_Test.Posts;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Post_Posts {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }


    @Test
    @DisplayName("Create posts json file and new info")
    public void test1() {

        File file = new File(System.getProperty("user.dir") + "/src/test/resources/JsonData/posts.json");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(file)
                .post("/posts").prettyPrint();
    }

    @Test
    @DisplayName("Create posts json file and new info by using map")
    public void test2() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("userId",2);
        map.put("id",482);
        map.put("title", "serkanserdar61");
        map.put("completed", false);

        given()
                .contentType(ContentType.JSON).

        when()
                .body(map)
                .post("/posts").
        then().
                assertThat().statusCode(201).log().body(true);

    }
}
