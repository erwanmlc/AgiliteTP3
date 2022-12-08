package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;

public class StepDefs_US001_ChangeSportAthlete {
	private Sport s1;
	private Athlete a1;
	private Athlete a2;
	private String exceptionError = null;
	
	
	@Given("{string} pratique le sport {string}")
	public void inscription_athlete_sport(String arg1, String arg2) {
		a1 = new Athlete(arg1, null);
		s1 = new Football(arg2);
		a1.subscribeSport(s1);
		Assert.assertEquals(a1.getSportPracticed().getNameSport(), arg2);
	}

	@Given("{string} ne pratique aucun {string}")
	public void athlete_ne_pratique_aucun_sport(String arg1, String arg2) {
		if (arg2 != null && arg2.isEmpty()) {
    		arg2 = null;
		}
		a2 = new Athlete(arg1, null);
		Assert.assertEquals(a2.getSportPracticed(), arg2);
		Assert.assertFalse(a2.isPraticeSport());
	}

	@When("Le sport actuel de l'athlete est supprimé")
	public void sport_actuel_athlete_supprime() {
		a1.unsubscribeSport();
		try {
			a2.unsubscribeSport();
		} catch (Exception e) {
			exceptionError = e.getMessage();
		}
	}
	
	@Then("le sport actuel de l'athlete doit etre {string}")
	public void suppression_sport_pratiquer_par_athlete(String arg1) {
		if (arg1 != null && arg1.isEmpty()) {
    		arg1 = null;
		}
		Assert.assertEquals(a1.getSportPracticed(), arg1);
		Assert.assertFalse(a1.isPraticeSport());
	}

	@Then("L'athlete ne pratique déjà plus de sport donc le système refuse avec un {string}")
	public void systeme_refuse_ajout_msg_erreur(String arg1) {
		Assert.assertEquals(exceptionError, arg1);
	}

}
