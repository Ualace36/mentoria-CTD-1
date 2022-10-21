package com.mentoria.ctd.apibancaria.controller;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TitularControllerTest {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest() {
        System.out.println(randomPort);
        RestAssured.port = randomPort;
    }

    @Test
    void whengetAllThenCheckResult() {
        RestAssured.given()
                .when()
                .get("/titula")
                .then()
                .statusCode(404);
               // .extract().response().body().prettyPrint();
    }

    @Test
    void inserir() {
        RestAssured.given()
        .when().get("/titular").then()
                .statusCode(200)
                .body("cep[9]", Matchers.equalTo(null));
    }


}