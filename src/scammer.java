import java.util.Random;

public final class scammer {

    Random r = new Random();

    private static scammer INSTANCE;

    public static scammer getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new scammer();
        }

        return INSTANCE;
    }

    private scammer() {
    }

    public mysteryNumber joinGame(customer c){

        return new mysteryNumber(r.nextInt(9));
    }

    public boolean guess(customer c, mysteryNumber m, int g){

        if (m.getNumb() == g){
            System.out.println("Guess was correct! Corrct number was " + m.getNumb());
            return true;
        }

        else {
            System.out.println("Guess was incorrect, guessed number was " + g);
            return false;
        }

    }

}
