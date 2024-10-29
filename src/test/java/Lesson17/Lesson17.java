package Lesson17;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lesson17 {

    // Тест для GET-запроса
    @Test
    public void testGetMethod() {
        Response response = RestAssured.get("https://postman-echo.com/get?foo1=bar1&foo2=bar2");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));
    }
// Тест Delete
    @Test
    public void testDeleteMethod() {
        Response response = RestAssured.delete("https://postman-echo.com/delete");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());


    }

    // Тест для POST-запроса

    @Test
    public void testPostMethod() {
        // JSON объект для передачи в теле запроса
        String jsonBody = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Connection", "keep-alive")
                .body(jsonBody)
                .post("https://postman-echo.com/post");

        // Проверка статуса ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        assertEquals("bar1", response.jsonPath().getString("json.foo1"));
        assertEquals("bar2", response.jsonPath().getString("json.foo2"));
    }

    // Тест для PUT-запроса
    @Test
    public void testPutMethod() {
        // JSON объект для передачи в теле запроса
        String jsonBody = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Connection", "keep-alive")
                .body(jsonBody)
                .put("https://postman-echo.com/put");

        // Проверка статуса ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        assertEquals("bar1", response.jsonPath().getString("json.foo1"));
        assertEquals("bar2", response.jsonPath().getString("json.foo2"));
    }

    // Тест для PATCH-запроса
    @Test
    public void testPatchMethod() {
        // JSON объект для передачи в теле запроса
        String jsonBody = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Connection", "keep-alive")
                .body(jsonBody)
                .patch("https://postman-echo.com/patch");

        // Проверка статуса ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        assertEquals("bar1", response.jsonPath().getString("json.foo1"));
        assertEquals("bar2", response.jsonPath().getString("json.foo2"));
    }

}

