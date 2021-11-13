import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
;
        pokemonIf starterPKMN = new pokemon();

        pokemonIf enemyPKMN = new enemyPKMN(10, 2, "Rattata");

        System.out.println("Press enter to continue to next battle!");

        while (true){

            scan.nextLine();

            starterPKMN.battle(starterPKMN, enemyPKMN);

            enemyPKMN.revive();

        }

    }
}
