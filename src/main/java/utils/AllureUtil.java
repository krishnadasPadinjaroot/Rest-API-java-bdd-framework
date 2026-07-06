package utils;

import io.qameta.allure.Allure;

public class AllureUtil {

    public static void attachRequest(String request) {
        Allure.addAttachment("Request", "application/json", request, ".json");
    }

    public static void attachResponse(String response) {
        Allure.addAttachment("Response", "application/json", response, ".json");
    }

    public static void attachStatusCode(int statusCode) {
        Allure.addAttachment("Status Code", String.valueOf(statusCode));
    }
}