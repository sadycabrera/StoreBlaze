package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(features = {"src/test/resources/features"}, glue = {"stepDefinitions"})
@RunWith(CucumberWithSerenity.class)
public class Runner {
}
