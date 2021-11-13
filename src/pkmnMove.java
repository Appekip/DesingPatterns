public class pkmnMove {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    int dmg;

    public pkmnMove (String a, int b){
        this.name = a;
        this.dmg = b;

    }

}
