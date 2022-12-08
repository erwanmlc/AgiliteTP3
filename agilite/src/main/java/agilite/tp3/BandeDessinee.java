package agilite.tp3;

public class BandeDessinee extends Livre
{

    public BandeDessinee(Sport sport) {
        super(sport);
    }

    public BandeDessinee(MarquePage mp, Sport sport) {
        super(mp, sport);
    }

    @Override
    public String ranger() {
        return "Rangée dans étagère à BD!";
    }
}