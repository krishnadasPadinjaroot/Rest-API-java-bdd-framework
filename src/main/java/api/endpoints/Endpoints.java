package api.endpoints;

import config.ConfigReader;

public final class Endpoints {

    private static final String BASE_URL = ConfigReader.getBaseUrl();

    private Endpoints() {
    }

    // Authentication
    public static final String LOGIN = BASE_URL + "/api/login";
    public static final String REGISTER = BASE_URL + "/api/register";

    // Users
    public static final String USERS = BASE_URL + "/api/users";
    public static final String SINGLE_USER = BASE_URL + "/api/users/{id}";

    // Resources
    public static final String RESOURCES = BASE_URL + "/api/unknown";
    public static final String SINGLE_RESOURCE = BASE_URL + "/api/unknown/{id}";
}