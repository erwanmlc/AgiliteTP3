package agilite.tp3;
 
/**
 * Write a description of class Livre here.
 *
 * @author (Sylvain THOR, Erwan MOALIC)
 * @version (02/11/2022)
 */
public abstract class Livre
{
    // instance variables - replace the example below with your own
    private int note = 10;
    private String nom = null;
    private MarquePage mp;
    private Sport sport;

    /**
     * Constructor for objects of class Livre
     */
    public Livre(Sport sport)
    {
        this.mp = new MarquePage();
        this.sport = sport;
    }

    public Livre(MarquePage mp, Sport sport)
    {
        this.mp = mp;
        this.sport = sport;
    }
    
    public String getName()
    {
        return this.nom;
    }
    
    public int getNote()
    {
        return this.note;
    }
    
    public void setName(String nom)
    {
        this.nom = nom;
    }

    public void setNote(int note)
    {
        this.note = note;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int prixGoncourt(int ajout)
    {
        ajoutNote(ajout);
        return this.note;
    }

    private void ajoutNote(int ajout)
    {
        this.note += ajout;
    }
    
    public void deplacerMP(int p)
    {
        mp.setPage(p);
    }

    public MarquePage getMp() {
        return mp;
    }
    
    public void setMp(MarquePage mp) {
        this.mp = mp;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    abstract public String ranger();
}
