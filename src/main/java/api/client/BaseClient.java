package api.client;

import api.builders.RequestBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClient {

    public Response get(String endpoint) {
        return RestAssured
                .given(RequestBuilder.buildRequest())
                .when()
                .get(endpoint);
    }

    public Response post(String endpoint, Object body) {
        return RestAssured
                .given(RequestBuilder.buildRequest())
                .body(body)
                .when()
                .post(endpoint);
    }

    public Response put(String endpoint, Object body) {
        return RestAssured
                .given(RequestBuilder.buildRequest())
                .body(body)
                .when()
                .put(endpoint);
    }

    public Response delete(String endpoint) {
        return RestAssured
                .given(RequestBuilder.buildRequest())
                .when()
                .delete(endpoint);
    }
}