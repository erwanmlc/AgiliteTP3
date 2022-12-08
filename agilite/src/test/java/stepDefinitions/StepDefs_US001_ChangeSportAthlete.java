package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;

public class StepDefs_US001_ChangeSportAthlete {
	private Sport s1;
	private Athlete a1;
	private Athlete a2;
	private String expectedMessage;
	private boolean b1 = true;
	
	
	@Given("L'Athlete {string} pratique le sport {string}")
	public void inscription_athlete_sport(String arg1, String arg2) {
		a1 = new Athlete(arg1, null);
		s1 = new Football(arg2);
		a1.subscribeSport(s1);
		Assert.assertEquals(a1.getSportPracticed().getNameSport(), "Football");
	}

	@Given("L'Athlete {string} ne pratique aucun sport")
	public void athlete_pratique_aucun_sport(String arg1) {
		a2 = new Athlete(arg1, null);
		Assert.assertEquals(a2.getSportPracticed(), null);
		Assert.assertFalse(a2.isPraticeSport());
	}

	@When("Le sport actuel de l'Athlete est supprimé")
	public void sport_actuel_athlete_supprime() {
		a1.unsubscribeSport();
		try {
			a2.unsubscribeSport();
		} catch (Exception e) {
			if(e.getMessage().contains(expectedMessage))
				b1 = false;
		}
	}
	
	@Then("L'Athlete ne pratiquera plus de sport")
	public void suppression_sport_pratiquer_par_athlete() {
		Assert.assertEquals(a1.getSportPracticed(), null);
		Assert.assertFalse(a1.isPraticeSport());
	}

	@Then("L'Athlete ne pratique déjà plus de sport donc le système refuse avec un message d erreur")
	public void systeme_refuse_ajout_msg_erreur() {
	    Assert.assertFalse(b1);
	}

}
