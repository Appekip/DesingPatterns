import java.util.Random;

public class customer {

    scammer s = scammer.getInstance();

    String Name;

    mysteryNumber mys;

    Random r = new Random();

    public void askToJoin(){
        mys = s.joinGame(this);
    }

    public customer(String n){
        this.Name = n;
        askToJoin();
    }

    public boolean makeAGuess(){
        return s.guess(this, mys, r.nextInt(9));
    }


}
