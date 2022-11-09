package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;

public class StepDefsU001 {
    private MarquePage mp = new MarquePage();
    private Livre l = new Livre(mp);

    @Given("Un livre {string}")
    public void creeLivreEtNom(String arg1) 
    {
        Assert.assertTrue(this.l!=null);
        l.setName(arg1);
    }

    @Given("qui a une note de {int}")
    public void attribuerNote(int arg1) 
    {
        l.setNote(arg1);
    }

    @When("le juge attribue un prix Goncourt avec une augmentation de {int} points")
    public void attribuerPrixGoncourt(int arg1) 
    {
        l.prixGoncourt(arg1);
    }

    @Then("la nouvelle {int} du livre doit être mise à jour automatiquement.")
    public void nouvelleNoteApresPrixGoncourt(int arg1) 
    {
        Assert.assertEquals(arg1, l.getNote());
    }
}