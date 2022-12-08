package stepDefinitions;

import org.junit.Assert;

import agilite.tp3.*;
import io.cucumber.java.en.*;


public class StepDefs_US002_AffiliationSportAthlete {
	private Sport s1;
	private Sport s2;
	private Athlete a1;
	private Athlete a3;
	private String expectedMessage = "This athlete already play a sport !";
	private boolean b1 = true;
	
	private Sport s3;
	private Athlete a4;
	private Athlete a6;
	
	@Given("Le sport {string} est composé d une liste d athlètes {string} pratiquant ce sport")
	public void sport_composer_liste_athlete_pratiquant_ce_sport(String arg1, String arg2) {
		s1 = new Football(arg1);
		a1 = new Athlete(arg2, s1);
		Assert.assertEquals(s1.getNameSport(), arg1);
		Assert.assertNotEquals(s1.getNbAthletes(), 0);
		Assert.assertEquals(s1.getListAthletes(), a1.getNameAthlete() + " ");	
		
		s3 = new Football(arg1);
		a4 = new Athlete(arg2, s3);
		Assert.assertEquals(s3.getNameSport(), arg1);
		Assert.assertNotEquals(s3.getNbAthletes(), 0);
		Assert.assertEquals(s3.getListAthletes(), arg2 + " ");
		Assert.assertEquals(a6.getSportPracticed(), null);
		Assert.assertFalse(a6.isPraticeSport());
	}

	@When("L athlète {string} veut être associé à un nouveau sport alors qu il pratique déjà le sport suivant : {string}")
	public void athlete_veut_associer_nouveau_sport_mais_pratique_deja_autre_sport(String arg1, String arg2) {
		s2 = new Football(arg2);
		a3 = new Athlete(arg1, s2);
		try {
			a3.subscribeSport(s1);
		} catch (Exception e) {
			if(e.getMessage().contains(expectedMessage))
				b1 = false;
		}
	}

	@Then("L'Athlete pratique déjà un sport donc le système refuse avec un message d erreur")
	public void systeme_refuse_ajout_msg_erreur() {
		Assert.assertFalse(b1);
	}

	@When("L'Athlete {string} est associé au sport {string}")
	public void athlete_associe_nouveau_sport(String arg1) {
		a6 = new Athlete(arg1, null);
		a6.subscribeSport(s3);
	}

	@Then("L'Athlete fait dorénavent partis de la liste d athletes du sport : {string}")
	public void athlete_fait_partis_liste_athlete_nouveau_sport(String arg1) {
		Assert.assertEquals(a6.getSportPracticed().getNameSport(), arg1);
		Assert.assertNotEquals(s3.getNbAthletes(), 1);
		Assert.assertTrue(a6.isPraticeSport());
	}
}
