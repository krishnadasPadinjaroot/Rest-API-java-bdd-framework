package stepdefinitions;

import api.models.response.UserResponse;
import api.services.UserService;
import assertions.ResponseValidator;
import io.cucumber.java.en.*;
import api.models.request.UserRequest;
import api.models.response.CreateUserResponse;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class UserSteps {

    private final UserService userService = new UserService();
    private UserRequest userRequest;
    private CreateUserResponse createUserResponse;

    private Response response;
    private UserResponse userResponse;

    private int userId;

    @Given("User id is {int}")
    public void user_id_is(Integer id) {

        userId = id;
    }

    @When("User sends GET request")
    public void user_sends_get_request() {

        response = userService.getUserById(userId);

        userResponse = response.as(UserResponse.class);
    }

    @Then("Response status code should be {int}")
    public void response_status_code_should_be(Integer statusCode) {

        ResponseValidator.validateStatusCode(response, statusCode);
    }

    @Then("User first name should be {string}")
    public void user_first_name_should_be(String expectedName) {

        assertEquals(
                userResponse.getData().getFirstName(),
                expectedName);
    }

    @Given("user name is {string}")
    public void user_name_is(String name) {

        userRequest = new UserRequest();
        userRequest.setName(name);
    }
    @Given("user job is {string}")
    public void user_job_is(String job) {

        userRequest.setJob(job);
    }
    @Then("response name should be {string}")
    public void response_name_should_be(String expectedName) {

        assertEquals(
                createUserResponse.getName(),
                expectedName);
    }

    @When("user sends POST request")
    public void user_sends_post_request() {

        System.out.println("POST STEP EXECUTED");

        response = userService.createUser(userRequest);

        response.prettyPrint();

        createUserResponse = response.as(CreateUserResponse.class);
    }


    @Then("response status code should be {int}")
    public void response_status_code_should_be(int statusCode) {

        ResponseValidator.validateStatusCode(response, statusCode);
    }
}