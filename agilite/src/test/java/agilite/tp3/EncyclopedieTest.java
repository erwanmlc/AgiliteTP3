package agilite.tp3;

// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * The test class EncyclopedieTest.
 *
 * @author (Sylvain THOR, Erwan MOALIC)
 * @version (02/11/2022)
 */
public class EncyclopedieTest
{
    MarquePage mp;
    Sport sport;
    Encyclopedie encyclopedie;

    /**
     * Default constructor for test class EncyclopedieTest
     */
    public EncyclopedieTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        mp = new MarquePage();
        sport = new Football("Football traditionnel");
        encyclopedie = new Encyclopedie(mp, sport);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testRanger()
    {
        assertEquals("Rangée dans étagère à encyclopédie!", encyclopedie.ranger());
    }
}

