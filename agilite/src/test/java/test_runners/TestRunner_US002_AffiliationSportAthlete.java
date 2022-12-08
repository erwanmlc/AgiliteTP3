package test_runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features/US002_AffiliationAthleteSport.feature", glue="")

public class TestRunner_US002_AffiliationSportAthlete {
	
}

