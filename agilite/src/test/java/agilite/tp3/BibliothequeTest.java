package agilite.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BibliothequeTest
{

    protected Bibliotheque biblitest;
    protected MarquePage mp;
    protected BandeDessinee bdtest;
    protected Sport sport;

    @Before
    public void setUp()
    {
        biblitest = Bibliotheque.getInstance();
        mp = new MarquePage();
        sport = new Football("Football traditionnel");
        bdtest = new BandeDessinee(mp, sport);
    }
    
    @Test
    public void testAjoutDeLivre()
    {
        biblitest.ajoutLivre(bdtest);
        // on cherche à vérifier que la méthode ajoutLivre met bien à jour l'arraylist livres de la bibliothèque
        assertEquals(bdtest, biblitest.getLivres().get(0));
    }

    @Test
    public void testChangementDeNom() {
        biblitest.setNom("Alexandrie");
        assertEquals("Alexandrie", biblitest.getNom());
    }
}