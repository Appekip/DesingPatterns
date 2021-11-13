public interface pokemonIf {
    public void evolve();
    public int attack();
    public void gainXp(int xp);
    public void battle(pokemonIf pkmn1, pokemonIf pkmn2);
    public void revive();
    public String getName();
    public int getHp();
    public void setHp(int a);
    public void fainted(boolean b);
}
