package com.AutomatedTest.API_Test.Comments;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_Comments {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("Create new info")
    public void test1() {

        File file = new File(System.getProperty("user.dir") + "/src/test/resources/JsonData/comments.json");

       given()
                .contentType(ContentType.JSON)
        .when()
                .body(file)
                .post("/comments")
         .then()
               .assertThat().statusCode(201).log().body(true);

    }

    @Test
    @DisplayName("Create new info by using map")
    public void test2() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("userId",4);
        map.put("id",1111);
        map.put("title", "serkanserdar4661");
        map.put("Selenium and API is Fun", false);


        given()
                .contentType(ContentType.JSON).

        when()
                .body(map)
                .post("/comments")
        .then()
                 .assertThat().statusCode(201);


    }

    @Test
    @DisplayName("Use String and create new info for Post")
    public void test3() {


        String create="{\n" +
                "\"postId\": 5,\n" +
                "\"id\": \"557\",\n" +
                "\"name\": \"serkan&serdar\",\n" +
                "\"email\": \"serkan615534@gmail.com\",\n" +
                "\"body\": \"Create new info \"\n" +
                "}";

        Response response=
                given()
                        .contentType(ContentType.JSON)
                .when()
                        .body(create)
                        .post("/comments").prettyPeek();
        assertEquals(201, response.getStatusCode());

    }
}
