package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,features="src/test/resources/test.feature",
        plugin={"pretty","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue={"steps"})

public class TestRunner {
}
