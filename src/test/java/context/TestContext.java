package context;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class TestContext {

    private Response response;

    private final Map<String, Object> scenarioData = new HashMap<>();

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public void set(String key, Object value) {
        scenarioData.put(key, value);
    }

    public Object get(String key) {
        return scenarioData.get(key);
    }

    public void clear() {
        scenarioData.clear();
        response = null;
    }
}