public class main {

    public static void main(String[] args) {
        mainCharacter a = mainCharacter.getInstance("Player 1");

        a.currentStats();

        a.lvlUp();

        a.currentStats();
    }

}
