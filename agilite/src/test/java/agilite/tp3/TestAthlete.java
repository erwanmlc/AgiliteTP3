package agilite.tp3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestAthlete {

    protected Sport sport1;
    protected Sport sport2;
    protected Sport sport3;
    protected Sport sport4;
    protected Sport sport5;

    protected Athlete athlete1;
    protected Athlete athlete2;
    protected Athlete athlete3;
    protected Athlete athlete4;
    protected Athlete athlete5;
    protected Athlete athlete6;
    protected Athlete athlete7;
    protected Athlete athlete8;


    public TestAthlete(){
    }

    
    @Before
    public void setUp(){
    	sport1 = new Tennis("Tennis simple");
    	sport2 = new Tennis("Tennis double");
    	sport3 = new Football("Football traditionnel");
        athlete1 = new Athlete("Yanis", sport2);
        athlete2 = new Athlete("Moha", sport3);
        
    	sport4 = new Football("Futsal");
    	athlete3 = new Athlete("Charles", sport4);
    	athlete4 = new Athlete("Frank", sport4);
    	athlete5 = new Athlete("Elon", sport4);
    	athlete6 = new Athlete("Rayan", sport4);
    	
    	sport5 = new Football("Five");
    	athlete7 = new Athlete("JFK", sport4);
    	
    }
    
    
    @Test
    public void testAthlete1(){
    	assertEquals(athlete1.getNameAthlete(), "Yanis");
    	assertEquals(athlete1.getSportPracticed().getNameSport(), "Tennis double");
    	athlete1.setSportPracticed(sport1);
    	assertEquals(athlete1.getSportPracticed().getNameSport(), "Tennis simple");
    	assertEquals(athlete2.getNameAthlete(), "Moha");
    	assertEquals(athlete2.getSportPracticed().getNameSport(), "Football traditionnel");
    }
    
    
    @Test
    public void testAthleteSport(){    	
    	assertEquals(sport4.getNbAthletes(), 5);
    	assertEquals(sport4.getListAthletes(), "Charles Frank Elon Rayan JFK ");
    }
    
    
    @Test
    public void testAthlete2(){
    	assertEquals(sport4.getNbAthletes(), 5);    	
    }
    
    
    @Test
    public void testAthleteInOneSport(){
    	assertEquals(sport4.getNameSport(), "Futsal");
    	assertEquals(sport4.getNbAthletes(), 5);
    	assertEquals(athlete2.getNameAthlete(), "Moha");
    	assertEquals(athlete2.getSportPracticed().getNameSport(), "Football traditionnel");
    	assertEquals(sport4.getListAthletes(), "Charles Frank Elon Rayan JFK ");
    	sport4.addAthlete(athlete2);
    	assertNotEquals(sport4.getNbAthletes(), 5);
    	assertEquals(sport4.getNbAthletes(), 6);
    	assertNotEquals(sport4.getListAthletes(), "Charles Frank Elon Rayan Moha ");
    	assertEquals(sport4.getListAthletes(), "Charles Frank Elon Rayan JFK Moha ");
    }
    
    
    @Test
    public void testChangeSportOfAthlete(){
    	athlete8 = new Athlete("Mehdi", sport4);
    	assertEquals(athlete8.getSportPracticed().getNameSport(), "Futsal");  
    	athlete8.unsubscribeSport();
    	assertEquals(athlete8.getSportPracticed(), null);
    	athlete8.subscribeSport(sport5);
    	assertEquals(athlete8.getSportPracticed().getNameSport(), "Five");  
    }
    
}