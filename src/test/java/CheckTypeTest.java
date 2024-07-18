import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CheckTypeTest {
    @Test
    void testCheckGetType() {
        Response response = RestAssured
                .given()
                .queryParam("type", "check")
                .get("https://playground.learnqa.ru/api/check_type")
                .andReturn();
        response.print();
    }

    @Test
    void testCheckPostType() {

        Map<String, Object> body = new HashMap<>();
        body.put("type", "check");


        Response response = RestAssured
                .given()
                .body(body)
//                .queryParam("type", "check")
                .post("https://playground.learnqa.ru/api/check_type")
                .andReturn();
        response.print();
    }
}
