public class charmander implements evolutionIf{

    int atk = 5;
    int hp = 10;

    int xp = 0;

    pkmnMove Scratch = new pkmnMove("Scratch", 5);

    int requiredXpToLvl = 10;

    public int getXp(){
        return xp;
    }

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

        if (xp > requiredXpToLvl){
            pkmn.seteState(new charmeleon());
            pkmn.geteState().setXp(xp - requiredXpToLvl);
            System.out.println("Charmander evolved into Charmeleon!" + " New attack is " + pkmn.geteState().getAtk() + "! Charmaleon learned a new move, " + pkmn.geteState().move() + "!");
            System.out.println("Current xp is: " + pkmn.geteState().getXp());
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

    public int attack(){
        return Scratch.dmg;
    }

    public String move(){
        return Scratch.name;
    }
}


