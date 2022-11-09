package tp1_bluej;

public class Main
{
    public static void main(String[] args)
    {
        MarquePage mp = new MarquePage();
        Livre livretest = new Livre(mp);
        System.out.println(livretest.getNote());
    }
}
