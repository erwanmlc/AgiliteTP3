package test_runners;

import org.junit.Assert;
import org.junit.runner.RunWith;
import cucumber.api.*;
import io.cucumber.java.en.*;
import io.cucumber.java.lu.a;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import tp1_bluej.Livre;
import tp1_bluej.MarquePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:resources/features"}, glue = {"helpers", "stepDefinitions"}, monochrome = true)

public class TestRunner_US_001 {
    // private MarquePage mp = new MarquePage();
    // private Livre l = new Livre(mp);

    // @Given("^Un livre (.*)$")
    // public void creeLivreEtNom(String arg1) 
    // {
    //     Assert.assertTrue(this.l!=null);
    //     l.setName(arg1);
    // }

    // @Given("^qui a une note de (\\d+)$")
    // public void attribuerNote(int arg1) 
    // {
    //     l.setNote(arg1);
    // }

    // @When("^le juge attribue un prix Goncourt avec une augmentation de (\\d+) points$")
    // public void attribuerPrixGoncourt(int arg1) 
    // {
    //     l.prixGoncourt(arg1);
    // }

    // @Then("^la nouvelle (\\d+) du livre doit être mise à jour automatiquement\\.$")
    // public void nouvelleNoteApresPrixGoncourt(int arg1) 
    // {
    //     Assert.assertEquals(arg1, l.getNote());
    // }
}