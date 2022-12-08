package agilite.tp3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class TestCity {
    protected Sport sport;
    protected City city;


    public TestCity(){
    }

    @Before
    public void setUp(){ // throws java.lang.Exception
        sport = new Tennis("Tennis simple");
        city = new City("Paris", sport);
    }
    
    
    @Test
    public void testSportCity(){
        assertEquals(sport.getNameSport(), "Tennis simple");
        assertEquals(city.getName(), "Paris");
        assertEquals(city.getSport().getNameSport(), "Tennis simple");

        sport.setNameSport("Tennis double");
        assertNotEquals(city.getSport().getNameSport(), "Tennis simple");
        assertEquals(city.getSport().getNameSport(), "Tennis double");
    }
    
    
 
    @After
    public void tearDown() // throws java.lang.Exception
    {

    }
}