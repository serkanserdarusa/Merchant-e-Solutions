package com.AutomatedTest.API_Test.Comments;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Put_Comments {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("update info")
    public void test1() {
        File file = new File(System.getProperty("user.dir") + "/src/test/resources/JsonData/comments.json");

        given()
                .contentType(ContentType.JSON)
        .when()
                .body(file)
                .put("/comments/10").
        then().
                assertThat().statusCode(200).log().all(true);
    }

    @Test
    @DisplayName("update info by using map")
    public void test2() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("postId", 2);
        map.put("id", 5);
        map.put("name", "serkan serkan");
        map.put("email", "sam61@gmail.com");
        map.put("body", "JAVA_SELENIUM_API_SQL");


        given()
                .contentType(ContentType.JSON).

        when()
                .body(map)
                .put("/comments/7").
         then().
                assertThat().statusCode(200).log().all(true);


    }

}
