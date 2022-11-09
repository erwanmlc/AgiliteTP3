package agilite.tp3;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * The test class MarquePageTest.
 *
 * @author (Sylvain THOR, Erwan MOALIC)
 * @version (02/11/2022)
 */
public class MarquePageTest
{
    private MarquePage mp1;
    private Livre livre1;

    /**
     * Default constructor for test class MarquePageTest
     */
    public MarquePageTest()
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
        mp1 = new MarquePage();
        livre1 = new Livre(mp1);
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
    public void testDeplacerMP()
    {
        livre1.deplacerMP(50);
        assertEquals(50, mp1.getPage());
    }
}

