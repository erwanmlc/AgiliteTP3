package agilite.tp3;

public class Football extends Sport
{

    public Football(String nameSport) {
        super(nameSport);
    }

    @Override
    public String description() {
        return "11 contre 11 avec un ballon, il faut marquer le plus de but pour gagner.";
    }

}