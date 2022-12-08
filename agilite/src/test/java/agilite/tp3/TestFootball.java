package agilite.tp3;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;


public class TestFootball
{
    protected double fValeur1;
    protected double fValeur2;

    public TestFootball(){
    }

    @Before
    public void setUp(){ // throws java.lang.Exception
        fValeur1= 2.0;
        fValeur2= 3.0;
    }


    @After
    public void tearDown(){ // throws java.lang.Exception
    }
    
    @Test
    public void testFootball1(){
        Sport s = new Football("Football traditionnel");
        assertEquals(s.getNameSport(), "Football traditionnel");
    }

    @Test
    public void testFootballDescription(){
        Sport s = new Football("Futsal");
        assertEquals(s.description(), "2 equipes avec un ballon, il faut marquer le plus de but pour gagner.");
    }

}
