package assertions;

import io.restassured.response.Response;
import org.testng.Assert;

public class ResponseValidator {

    private ResponseValidator() {
    }

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        Assert.assertEquals(
                response.getStatusCode(),
                expectedStatusCode,
                "Status Code Mismatch");
    }

    public static void validateResponseTime(Response response, long maxResponseTime) {
        Assert.assertTrue(
                response.getTime() <= maxResponseTime,
                "Response time exceeded " + maxResponseTime + " ms");
    }

    public static void validateContentType(Response response, String expectedContentType) {
        Assert.assertTrue(
                response.getContentType().contains(expectedContentType),
                "Invalid Content-Type");
    }

    public static void validateHeader(Response response,
                                      String headerName,
                                      String expectedValue) {

        Assert.assertEquals(
                response.getHeader(headerName),
                expectedValue,
                "Header validation failed");
    }
}