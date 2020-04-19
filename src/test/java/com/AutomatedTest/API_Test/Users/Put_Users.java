package com.AutomatedTest.API_Test.Users;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Put_Users {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("update info")
    public void test1 () {
        File file = new File(System.getProperty("user.dir") +"/src/test/resources/JsonData/users.json");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(file)
                .put("/users/8").prettyPrint();
    }
    @Test
    @DisplayName("Create posts json file and new info by using map")
    public void test2() {


        HashMap<String, Object> map = new HashMap<>();

        map.put("name","Sam serkan serdar");
        map.put("id",432);
        map.put("email", "serkan61@gmail.com");
        map.put("username","samserdar61");

Response response=
        given()
                .contentType(ContentType.JSON).

        when()
                .body(map)
                .put("/users/3");
        assertEquals(200,response.getStatusCode());

    }


    }


