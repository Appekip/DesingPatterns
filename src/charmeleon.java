public class charmeleon implements evolutionIf{

    int atk = 10;
    int hp = 25;
    int xp = 0;
    int requiredXpToLvl = 30;

    pkmnMove Ember = new pkmnMove("Ember", 10);

    public void setXp(int xp) {
        this.xp += xp;
    }

    public int getXp(){
        return xp;
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

        if (xp > requiredXpToLvl){
            pkmn.seteState(new charizard());
            pkmn.geteState().setXp(xp - requiredXpToLvl);
            System.out.println("Charmeleon evolved into Charizard!" + " New attack is " + pkmn.geteState().getAtk() + "! Charizard learned a new move, " + pkmn.geteState().move() + "!");
            System.out.println("Current xp is: " + xp);
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

    public int ember(){
        System.out.println("Ember attack!");
        return getAtk();
    }

    public int attack(){
        return Ember.dmg;
    }

    @Override
    public String move() {
        return Ember.name;
    }

}
