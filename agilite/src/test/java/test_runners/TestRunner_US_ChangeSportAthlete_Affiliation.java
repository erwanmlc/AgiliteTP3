package test_runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features", glue="")

public class TestRunner_US_ChangeSportAthlete_Affiliation {

}