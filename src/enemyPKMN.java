public class enemyPKMN extends pokemon{

    public enemyPKMN(int a, int b, String c){
        this.hp = a;
        this.atk = b;
        this.name = c;
    }

    public boolean isFainted() {
        return fainted;
    }

    public void revive() {
        hp = 10;
        fainted = false;
    }

    boolean fainted = false;

    public int attack(){
        System.out.println(name + " attacks for " +atk+ " damage!");
        return atk;
    }

}
