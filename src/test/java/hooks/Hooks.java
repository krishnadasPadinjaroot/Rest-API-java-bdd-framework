package hooks;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public static final TestContext testContext = new TestContext();

    @Before
    public void beforeScenario() {
        System.out.println("========== Scenario Started ==========");
        testContext.clear();

    }

    @After
    public void afterScenario() {
        System.out.println("========== Scenario Finished ==========");
        testContext.clear();

    }
}