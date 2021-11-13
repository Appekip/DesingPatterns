public class charizard implements evolutionIf{

    int atk = 20;
    int hp = 50;

    public int getHp() {
        return hp;
    }

    @Override
    public int setHp(int a) {
        return hp;
    }

    int xp = 0;
    public void setXp(int xp) {
        this.xp += xp;
    }

    String name = "Charizard";

    @Override
    public void evolve(pokemon pkmn) {
        System.out.println("Charizard's current xp is " + xp);
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
