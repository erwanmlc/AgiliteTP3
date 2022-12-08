package agilite.tp3;

public class Football extends Sport
{

    public Football(String nameSport) {
        super(nameSport);
    }

    @Override
    public String description() {
        return "2 equipes avec un ballon, il faut marquer le plus de but pour gagner.";
    }

}