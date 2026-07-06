package api.services;

import api.client.ApiClient;
import api.endpoints.Endpoints;
import api.models.request.UserRequest;
import io.restassured.response.Response;

public class UserService {

    private final ApiClient apiClient = new ApiClient();

    public Response getAllUsers() {
        return apiClient.get(Endpoints.USERS);
    }

    public Response getUserById(int id) {
        return apiClient.get(
                Endpoints.SINGLE_USER.replace("{id}", String.valueOf(id))
        );
    }


    public Response createUser(UserRequest request) {
        return apiClient.post(Endpoints.USERS, request);
    }

    public Response updateUser(int id, UserRequest request) {
        return apiClient.put(
                Endpoints.SINGLE_USER.replace("{id}", String.valueOf(id)),
                request
        );
    }

    public Response deleteUser(int id) {
        return apiClient.delete(
                Endpoints.SINGLE_USER.replace("{id}", String.valueOf(id))
        );
    }
}