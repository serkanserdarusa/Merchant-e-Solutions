package com.AutomatedTest.API_Test.Users;

import com.AutomatedTest.API_Test.Pojo_forUsers.info;
import com.AutomatedTest.UI_Test.Utils.ConfigurationReader;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Get_Users {

    @BeforeAll
    public static void setup() {

        baseURI = ConfigurationReader.getProperty("urlAPI");
    }

    @Test
    @DisplayName("Display all info")
    public void test1() {

        given().
                contentType(ContentType.JSON)
                .when()
                .get(baseURI + "/users")
                .then()

                .assertThat().statusCode(200).contentType(ContentType.JSON).log().all(true);

    }

    @Test
    @DisplayName("Get specific info and use 'is' for make sure info is match")
    public void test2() {

        given().
                contentType(ContentType.JSON).
                when().
                get(baseURI + "/users/8").
                then().
                body("name", is("Sam Serdar")).statusCode(200).log().all(true);

    }

    @Test
    @DisplayName("Get  info and use 'lessThan' ")
    public void test3() {
        given().
                accept(ContentType.JSON).
        when().
                get("/users").
         then().
                assertThat().statusCode(200).contentType(ContentType.JSON).
                time(lessThan(10L), TimeUnit.SECONDS).
                log().all(true);
    }

    @Test
    @DisplayName("use query param and make sure result is corrrect")
    public void test4() {
        given().
                contentType(ContentType.JSON).
                queryParam("_page", "1").
                queryParam("_limit", 8).
                when().
                get(baseURI + "/users").
                then().
                body("title", hasSize(8));
    }

    @Test
    @DisplayName("use path param and make sure result is correct")
    public void test5() {

        given().
                contentType(ContentType.JSON).
                pathParam("users", 8).
        when().
                get(baseURI + "/users/{users}").
        then().
                body("name", containsString("Sam Serdar"));

    }

    @Test
    @DisplayName("Display specific info on Array by using key and value")
    public void test6() {
        JsonPath json = given().
                contentType(ContentType.JSON).
        when().
                get(baseURI + "/users").thenReturn().jsonPath();

        Map<String, ?> sss = json.get("address[0]");
        System.out.println(sss);

        for (Map.Entry<String, ?> s : sss.entrySet()) {
            System.out.println(s);
            System.out.println("key: " + s.getKey() + " value: " + s.getValue());
        }

    }

    @Test
    @DisplayName("Display specific info on Array")
    public void test7() {

        JsonPath count = given().
                contentType(ContentType.JSON).
                when().
                get("/users").thenReturn().jsonPath();

        System.out.println(count.getString("address[0].Street"));//return as a string
        System.out.println(count.getString("address[0].City"));
        System.out.println(count.getString("address[0].Phone"));
        System.out.println(count.getString("address[0].Zip"));

    }

    @Test
    @DisplayName("Save payload into java collection")
    public void test8() {
        Response response = given().
                contentType(ContentType.JSON).
                when().
                get("/users").prettyPeek();

        List<Map<String, ?>> collection1 = response.jsonPath().get();//to get all list seperately

        for (Map<String, ?> each : collection1) {
            System.out.println(each);
        }
    }

    @Test
    @DisplayName("verify  name")
    public void test9() {
        given().
                contentType(ContentType.JSON).
                queryParam("users", "{\"Phone\":\"123-123-1234\"}").
        when().
                get("/users").
        then().

                 body("address[0].Phone", is("123-123-1234"))
                .assertThat().statusCode(200).contentType(ContentType.JSON);


    }

    @Test
    @DisplayName("Verifies that 1st city has following info:Sam Serdar, id, serkansam@gmail.com, serkanserdar61")
    public void test10() {

        given()
                .contentType(ContentType.JSON)
                .pathParam("users", 8)
        .when()
                .get("/users/{users}")
         .then()
                .assertThat()
                .statusCode(200)
                .body("name",is("Sam Serdar"))
                .body("id", is(8))
                .body("email", is("serkansam@gmail.com"))
                .body("username", is("serkanserdar61")).log().body(true);

    }

    @Test
    @DisplayName("get some info from Json to POJO")//Deserialization

    public void test11() {

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/users");

        System.out.println(response.prettyPrint());

        JsonPath jsonPath = response.jsonPath();

        info a = jsonPath.getObject("address[0]", info.class);

        System.out.println(a);
        System.out.println(a.getId());
        System.out.println(a.getBody());
        System.out.println(a.getEmail());
        System.out.println(a.getName());
        System.out.println(a.getPostId());

    }

    @Test
    @DisplayName("get some info from Pojo to Json")//serialization

    public void test12() {
        info b = new info(3,2, "serkan serdar", "serdarserkan61@gmail.com", "SDET");
        Gson gson=new Gson();
        String json=gson.toJson(b);
        System.out.println(json);
    }
}
