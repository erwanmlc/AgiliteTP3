package agilite.tp3;

/**
 * Write a description of class MarquePage here.
 *
 * @author (Sylvain THOR, Erwan MOALIC)
 * @version (02/11/2022)
 */
public class MarquePage
{
    // instance variables - replace the example below with your own
    private int currentPage = 0;

    /**
     * Constructor for objects of class MarquePage
     */
    public MarquePage()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setPage(int p)
    {
        this.currentPage = p;
    }
    
    public int getPage()
    {
        return this.currentPage;
    }
}
