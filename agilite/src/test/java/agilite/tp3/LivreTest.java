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
 * The test class LivreTest.
 *
 * @author (Sylvain THOR, Erwan MOALIC)
 * @version (02/11/2022)
 */
public class LivreTest
{
    /**
     * Default constructor for test class LivreTest
     */
    public LivreTest()
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
    public void testPrixGoncourt()
    {
        MarquePage mp = new MarquePage();
        Sport sport = new Football("Football traditionnel");
        BandeDessinee bd = new BandeDessinee(mp, sport);
        assertEquals(15, bd.prixGoncourt(5));
    }
}

