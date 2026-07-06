package api.services;

import api.client.ApiClient;
import api.endpoints.Endpoints;
import io.restassured.response.Response;

public class LoginService {

    private final ApiClient apiClient = new ApiClient();

    public Response login(Object request) {
        return apiClient.post(Endpoints.LOGIN, request);
    }
}