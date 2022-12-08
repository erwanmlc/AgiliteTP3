package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import agilite.tp3.*;

public class StepDefs_US_ChangeSportAthlete_Affiliation {
	
	private Sport s1 = new Football("Football traditionnel"); //Musculation
	private Sport s2 = new Football("Futsal"); //MMA
	private Sport s3 = new Football("Five"); //Karate
	private Sport s4 = new Tennis("Tennis simple"); //Golf
	private Sport s5 = new Tennis("Tennis double"); //Natation
	
	private Athlete a1 = new Athlete("Rafik", s1);
	private Athlete a2 = new Athlete("Aya", null);
	private Athlete a3 = new Athlete("Hugo", s2);
	private Athlete a4 = new Athlete("Louis", s2);
	private Athlete a5 = new Athlete("Asterix", s3);
	private Athlete a6 = new Athlete("Nino", s4);
	private Athlete a7 = new Athlete("Victor", s4);
	private Athlete a8 = new Athlete("Mohammed", null);
	private Athlete a9 = new Athlete("Charles", s5);
	private Athlete a10 = new Athlete("Malcolm", s5);
	private Athlete a11 = new Athlete("Christophe", s5);
	private Athlete a12 = new Athlete("Ryflan", null);

	
	@Given("Un athlete pratiquant un sport")
	public void un_athlete_pratiquant_un_sport() {
		Assert.assertTrue(a1 != null);
		Assert.assertTrue(a1.getSportPracticed() != null);
	}

	@When("Je supprime le sport actuel de l athlete")
	public void je_supprime_le_sport_actuel_de_l_athlete() {
		a1.unsubscribeSport();
		Assert.assertFalse(a1.isPraticeSport());
	}

	@Then("L athlete ne pratiquera plus de sport")
	public void l_athlete_ne_pratiquera_plus_de_sport() {
		Assert.assertTrue(a1.getSportPracticed() == null);
	}

	@Given("Un athlete <nom> ne pratiquant aucun null")
	public void un_athlete_nom_ne_pratiquant_aucun_null() {
		Assert.assertTrue(a2.getSportPracticed() == null);
	}

	@Then("Le systeme refuse avec le This athlete does not already play any sport !")
	public void le_systeme_refuse_avec_le_This_athlete_does_not_already_play_any_sport() {
	    String expectedMessage = "This athlete does not already play any sport !";
		
		try {
			a2.unsubscribeSport();
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage().contains(expectedMessage));
		}		
	}

	@Given("Un sport Futsal compose d une liste d athletes pratiquant ce sport")
	public void un_sport_Futsal_compose_d_une_liste_d_athletes_pratiquant_ce_sport() {
		Assert.assertEquals(s2.getNameSport(), "Futsal");
		Assert.assertEquals(s2.getNbAthletes(), 2);
	}

	@When("J associe un athlete Asterix a ce sport alors qu il pratique deja un autre Five")
	public void j_associe_un_athlete_Asterix_a_ce_sport_alors_qu_il_pratique_deja_un_autre_Five() {
		Assert.assertEquals(a5.getNameAthlete(), "Asterix");
		Assert.assertEquals(a5.getSportPracticed().getNameSport(), "Five");
	}

	@Then("Le systeme refuse d ajouter l athlete a la liste du sport avec le message Athlete already associated with another sport	!")
	public void le_systeme_refuse_d_ajouter_l_athlete_a_la_liste_du_sport_avec_le_message_Athlete_already_associated_with_another_sport() {
	    String expectedMessage = "This athlete already play a sport !";
		
		try {
			a5.subscribeSport(s2);
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage().contains(expectedMessage));
		}
	}

	@Given("Un sport Tennis simple compose d une liste d athletes pratiquant ce sport")
	public void un_sport_Tennis_simple_compose_d_une_liste_d_athletes_pratiquant_ce_sport() {
		Assert.assertEquals(s4.getNameSport(), "Tennis simple");
		Assert.assertEquals(s4.getNbAthletes(), 2);		
	}

	@When("J associe l athlete Mohammed au sport Tennis simple")
	public void j_associe_l_athlete_Mohammed_au_sport_Tennis_simple() {
		Assert.assertTrue(a8.getSportPracticed() == null);
		a8.subscribeSport(s4);
		s4.addAthlete(a8);
		Assert.assertTrue(a8.isPraticeSport());
		Assert.assertEquals(a8.getSportPracticed().getNameSport(), "Tennis simple");
	}

	@Then("L athlete s appelant Mohammed fait dorenavent partis de la liste d athletes du sport Tennis simple")
	public void l_athlete_s_appelant_Mohammed_fait_dorenavent_partis_de_la_liste_d_athletes_du_sport_Tennis_simple() {
		Assert.assertTrue(s4.getListAthletes().contains(a8.getNameAthlete()));
	}


	@Given("Un sport Tennis double compose d une liste d athletes pratiquant ce sport")
	public void un_sport_Tennis_double_compose_d_une_liste_d_athletes_pratiquant_ce_sport() {
		Assert.assertEquals(s5.getNameSport(), "Tennis double");
		Assert.assertEquals(s5.getNbAthletes(), 3);
	}

	@When("J associe l athlete Ryflan au sport Tennis double")
	public void j_associe_l_athlete_Ryflan_au_sport_Tennis_double() {
		Assert.assertTrue(a12.getSportPracticed() == null);
		a12.subscribeSport(s5);
		s5.addAthlete(a12);
		Assert.assertTrue(a12.isPraticeSport());
		Assert.assertEquals(a12.getSportPracticed().getNameSport(), "Tennis double");
	}

	@Then("L athlete s appelant Ryflan fait dornavent partis de la liste d athletes du sport Tennis double")
	public void l_athlete_s_appelant_Ryflan_fait_dorenavent_partis_de_la_liste_d_athletes_du_sport_Tennis_double() {
		Assert.assertTrue(s5.getListAthletes().contains(a12.getNameAthlete()));
	}
	
}
