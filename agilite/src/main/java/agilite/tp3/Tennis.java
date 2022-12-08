package agilite.tp3;

public class Tennis extends Sport
{

    public Tennis(String nameSport) {
        super(nameSport);
    }

    @Override
    public String description() {
        return "1 contre 1 ou 2 contre 2 avec des raquettes, un filet et une balle.";
    }

}