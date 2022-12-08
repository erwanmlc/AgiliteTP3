package agilite.tp3;

public class Encyclopedie extends Livre
{

    public Encyclopedie(Sport sport) {
        super(sport);
    }

    public Encyclopedie(MarquePage mp, Sport sport) {
        super(mp, sport);
    }

    @Override
    public String ranger() {
        return "Rangée dans étagère à encyclopédie!";
    }
}