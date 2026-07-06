package tests;

import api.client.BaseClient;
import api.endpoints.Endpoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClientTest {

    @Test
    public void testGetUser() {

        BaseClient client = new BaseClient();

        Response response = client.get(Endpoints.SINGLE_USER.replace("{id}", "2"));

        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}