package test_runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/US001_ChangeSportAthlete.feature", glue="")

public class TestRunner_US001_ChangeSportAthlete {

}

