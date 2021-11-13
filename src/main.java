import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
;
        pokemon starterPKMN = new pokemon();
        enemyPKMN enemyPKMN = new enemyPKMN(10, 2, "Rattata");

        System.out.println("Press enter to continue to next battle!");
        scan.nextLine();

        while (true){

            starterPKMN.battle(starterPKMN, enemyPKMN);
            enemyPKMN.revive();

            scan.nextLine();

        }

    }
}
