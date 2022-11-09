package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;

public class StepDefsU002 {
    private Livre l = new Livre();
    private MarquePage mp;

    @Given("Le livre {string}")
    public void creeLivre(String arg1) 
    {
        Assert.assertTrue(this.l!=null);
        l.setName(arg1);
        Assert.assertEquals(this.l.getName(), arg1);
    }

    @Given("qui est placé à la page {int}")
    public void placerPageInitiale(int arg1) {
        mp = new MarquePage(arg1);
        l.setMp(mp);
    }

    @When("le lecteur décide de le placer à la page {int}")
    public void deplacerMarquePage(int arg1) {
        l.deplacerMP(arg1);
    }

    @Then("la page {int} où est le marque page doit être automatiquement mise à jour.")
    public void majDuMarquePage(int arg1) {
        Assert.assertEquals(arg1, l.getMp().getPage());
    }
}