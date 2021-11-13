public class charmeleon implements evolutionIf{

    int atk = 10;
    int hp = 25;
    int xp = 0;

    public void setXp(int xp) {
        this.xp += xp;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public int setHp(int a) {
        return hp;
    }

    String name = "Charmeleon";

    @Override
    public void evolve(pokemon pkmn) {

        if (xp > 30){
            pkmn.seteState(new charizard());
            System.out.println("Charmeleon evolved into Charizard!" + " New attack is " + new charizard().getAtk() + "!");
        }
        else {
            System.out.println("Current xp is: " + xp);
        }
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public String getName() {
        return name;
    }

}
