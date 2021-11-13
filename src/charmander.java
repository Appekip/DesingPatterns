public class charmander implements evolutionIf{

    int atk = 5;
    int hp = 10;

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

    String name = "Charmander";

    @Override
    public void evolve(pokemon pkmn) {

        if (xp > 10){
            pkmn.seteState(new charmeleon());
            System.out.println("Charmander evolved into Charmeleon!" + " New attack is " + new charmeleon().getAtk() + "!");
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
