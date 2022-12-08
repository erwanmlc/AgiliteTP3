package agilite.tp3;

import java.util.ArrayList;

/**
 * Write a description of class Livre here.
 *
 * @author (Sylvain THOR, Erwan MOALIC)
 * @version (02/11/2022)
 */

public class Bibliotheque
{

    private static Bibliotheque instance;
    private ArrayList<Livre> livres = new ArrayList<Livre>();
    private String nom = "Sainte Genevieve";

    private Bibliotheque() {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static Bibliotheque getInstance() {
        if (instance == null) {
            instance = new Bibliotheque();
        }
        return instance;
    }

    public ArrayList<Livre> getLivres() 
    {
        return livres;
    }

    public void setLivres(ArrayList<Livre> livres) 
    {
        this.livres = livres;
    }

    public void ajoutLivre(Livre l) 
    {
        livres.add(l);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
