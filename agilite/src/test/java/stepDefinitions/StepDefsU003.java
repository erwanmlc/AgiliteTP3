package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;

public class StepDefsU003 {
    private Sport sport;
    private Livre l;

    @Given("Un {string} avec un nom {string}")
    public void creeSport(String arg1, String arg2) 
    {
        if (arg1.equals("Football")){
            sport = new Football(arg2);
        } else if (arg1.equals("Tennis")) {
            sport = new Tennis(arg2);
        }
        Assert.assertTrue(this.sport!=null);
    }

    @Given("on cree un {string} portant sur ce sport")
    public void creeLivreEtAttributionSport(String arg1) 
    {
        l = new Encyclopedie(sport);
        l.setName(arg1);
    }

    @When("lorsqu'on l'ajoute a la bibliotheque")
    public void ajoutLivreBibliotheque() 
    {
        Bibliotheque.getInstance().ajoutLivre(l);
    }

    @Then("la description doit etre {string}")
    public void descriptionLivre(String arg1)
    {
        System.out.println("attendu : " + arg1);
        System.out.println("actuel : " + l.getSport().description());
        Assert.assertEquals(l.getSport().description(), arg1);
    }

}
        
