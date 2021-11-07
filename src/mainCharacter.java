import java.util.Random;

public class mainCharacter {

    Random r = new Random();

    private static mainCharacter INSTANCE;

    protected String name;

    protected int lvl;

    protected int str;

    protected int hp;

    public void lvlUp(){

        str = str + (r.nextInt(2) + 1);
        hp  = hp + (r.nextInt(2) + 1);

        lvl = lvl + 1;


        System.out.println(name + " leveled up, new level is " + lvl + ", new hp is " + hp + ", new str is " + str + ".");
    }

    private mainCharacter(String name) {
        this.name = name;
        this.lvl = 1;
        this.str = 1;
        this.hp = 10;
    }

    public static mainCharacter getInstance(String x) {
        if(INSTANCE == null) {
            INSTANCE = new mainCharacter(x);
        }
        return INSTANCE;
    }

    public void currentStats(){
        System.out.println(name + " is now level " + lvl + ", hp is " + hp + ", str is " + str + ".");
    }



}
