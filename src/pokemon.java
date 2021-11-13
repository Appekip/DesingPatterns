public class pokemon implements pokemonIf{

    boolean fainted = false;
    int hp;
    int atk;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void fainted(boolean b) {
        fainted = b;
    }



    public String getName() {
        return name;
    }

    String name;

    private evolutionIf eState = new charmander();

    public evolutionIf geteState() {
        return eState;
    }

    public void seteState(evolutionIf eState) {
        this.eState = eState;
    }

    public pokemon(){

    }

    @Override
    public void evolve() {
        eState.evolve(this);
    }

    @Override
    public int attack() {
        System.out.println(eState.getName() + " attacks for " + eState.getAtk() + " damage!");
        return  eState.getAtk();
    }

    @Override
    public void gainXp(int xp) {
        eState.setXp(xp);
        evolve();
    }



    @Override
    public void revive() {

    }

    @Override
    public void battle(pokemonIf pkmn1, pokemonIf pkmn2) {

        System.out.println("New battle againsts " + pkmn2.getName());

        while (pkmn2.getHp() > 0){
            pkmn2.setHp(pkmn2.getHp() - pkmn1.attack());
            if (pkmn2.getHp() > 0){
                pkmn1.setHp(pkmn1.getHp() - pkmn2.attack());
            }

        }
        System.out.println(pkmn2.getName() + " fainted.");
            pkmn2.fainted(true);
            gainXp(9);


    }



}
