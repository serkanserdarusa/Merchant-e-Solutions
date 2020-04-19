package com.AutomatedTest.API_Test.Users;

import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Post_Users {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("Create new info")
    public void test1() {

        File file = new File(System.getProperty("user.dir") + "/src/test/resources/JsonData/users.json");

        given()
                .contentType(ContentType.JSON)
        .when()
                .body(file)
                .post("/users").
        then().
                assertThat().statusCode(201).log().all(true);
    }

    @Test
    @DisplayName("Create posts json file and new info by using map")
    public void test2() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("State","NC");
        map.put("Phone","865-978-4987");
        map.put("Street", "2345 plantation trace dr");
        map.put("City","Duluth");
        map.put("name","Sam serkan");
        map.put("id",893);
        map.put("email", "serkan61@gmail.com");
        map.put("username","samserdar61");


        given()
                .contentType(ContentType.JSON).

        when()
                .body(map)

                .post("/users").
        then().
                assertThat().statusCode(201).log().all(true);

    }

    @Test
    @DisplayName("Create posts json file and new info by using map")
    public void test3() {

        String newinfo="{\n" +
                "\"Zip\": \"30096\",\n" +
                "\"State\": \"GA\",\n" +
                "\"Phone\": \"404-987-4567\",\n" +
                "\"Street\": \"1435 river trail st\",\n" +
                "\"City\": \"Suwanee\"\n" +
                "},\n" +
                "\"name\": \"Serkan Serdar\",\n" +
                "\"id\": 8,\n" +
                "\"email\": \"serdarsam@gmail.com\",\n" +
                "\"username\": \"serkansam4661\"\n" +
                "}";

        Response response=
                given()
                        .contentType(ContentType.JSON)
                .when()
                        .body(newinfo)

                        .post("/users").prettyPeek();

        assertEquals(201, response.getStatusCode());

    }

}
