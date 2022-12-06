package agilite.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BibliothequeTest
{

    protected Bibliotheque biblitest;
    protected MarquePage mp;
    protected Livre livretest;


    @Before
    public void setUp()
    {
        biblitest = new Bibliotheque();
        mp = new MarquePage();
        livretest = new Livre(mp);
    }
    
    @Test
    public void testAjoutDeLivre()
    {
        biblitest.setNom("Francois Mitterand");
        biblitest.ajoutLivre(livretest);
        // on cherche à vérifier que la méthode addLivre met bien à jour l'objet bibliothèque du livre ajouté
        assertEquals("Francois Mitterand", livretest.getBibli().getNom());
        // on cherche à vérifier que la méthode addLivre met bien à jour l'arraylist livres de la bibliothèque en question
        assertEquals(livretest, biblitest.getLivres().get(0));
    }

    @Test
    public void testChangementDeNom() {
        biblitest.setNom("Alexandrie");
        assertEquals("Alexandrie", biblitest.getNom());
    }
}