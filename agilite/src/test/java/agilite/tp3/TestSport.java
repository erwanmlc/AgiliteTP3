package agilite.tp3;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;


public class TestSport
{
    protected double fValeur1;
    protected double fValeur2;

    public TestSport(){
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
    public void testSport1(){
        Sport s = new Football("Football traditionnel");
        assertEquals(s.getNameSport(), "Football traditionnel");
    }

}
