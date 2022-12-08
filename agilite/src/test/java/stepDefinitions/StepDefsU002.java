package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;

public class StepDefsU002 {
    private Sport sport = new Football("Football traditionnel");
    private Livre l = new Encyclopedie(sport);
    private MarquePage mp;

    @Given("L'encyclopedie {string}")
    public void creeEncyclopedie(String arg1) 
    {
        Assert.assertTrue(this.l!=null);
        l.setName(arg1);
        Assert.assertEquals(this.l.getName(), arg1);
    }

    @Given("qui est place a la page {int}")
    public void placerPageInitiale(int arg1) {
        mp = new MarquePage(arg1);
        l.setMp(mp);
    }

    @When("le lecteur decide de le placer a la page {int}")
    public void deplacerMarquePage(int arg1) {
        l.deplacerMP(arg1);
    }

    @Then("la page {int} ou est le marque page doit etre automatiquement mise a jour.")
    public void majDuMarquePage(int arg1) {
        Assert.assertEquals(arg1, l.getMp().getPage());
    }
}