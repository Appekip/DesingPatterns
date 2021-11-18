import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tictactoe extends Game{

    int currentPlayer;

    boolean endCondition = false;

    int tile;

    String play;

    Random r = new Random();

    int turnCount = 0;

    List board = new ArrayList<String>();

    @Override
    void initializeGame() {
        for (int i = 0; i < 9; i++){

            board.add(i, "e");

        }
    }

    @Override
    void makePlay(int player) {

        if (!winCondition()) {

            turnCount++;

            if (turnCount > 9) {

                endCondition = true;

            }

            else {

                currentPlayer = player;

                if (currentPlayer == 1) {
                    play = "X";
                } else {
                    play = "O";
                }

                tile = r.nextInt(9);

                while (board.get(tile) != "e") {
                    tile = r.nextInt(9);
                }

                board.set(tile, play);

            }
        }

        else {

        }

    }

    @Override
    boolean endOfGame() {

        if (endCondition){

            return true;
        }

        else if (winCondition()){

            return true;
        }

        else {

            return false;

        }


    }

    @Override
    void printWinner() {

        if (endCondition == true) {
            System.out.println("" +board.get(0) + board.get(1) + board.get(2));
            System.out.println("" +board.get(3) + board.get(4) + board.get(5));
            System.out.println("" +board.get(6) + board.get(7) + board.get(8));
            System.out.println("Game ends in a draw..." + " last turn was " + turnCount);
        }

        else if (winCondition()) {
            System.out.println("" + board.get(0) + board.get(1) + board.get(2));
            System.out.println("" + board.get(3) + board.get(4) + board.get(5));
            System.out.println("" + board.get(6) + board.get(7) + board.get(8));
            System.out.println("Winner is player number " + currentPlayer + " winning turn was " + turnCount);
        }
    }

    boolean winCondition(){

        if ("XXX".equals((String) board.get(0) + board.get(1) + board.get(2)) || "OOO".equals((String) board.get(0) + board.get(1) + board.get(2))){

            return true;
        }

        else if("XXX".equals((String) board.get(3) + board.get(4) + board.get(5)) || "OOO".equals((String) board.get(3) + board.get(4) + board.get(5))){

            return true;
        }
        else if("XXX".equals((String) board.get(6) + board.get(7) + board.get(8)) || "OOO".equals((String) board.get(6) + board.get(7) + board.get(8))){

            return true;
        }
        else if("XXX".equals((String) board.get(0) + board.get(3) + board.get(6)) || "OOO".equals((String) board.get(0) + board.get(3) + board.get(6))){

            return true;
        }
        else if("XXX".equals((String) board.get(1) + board.get(4) + board.get(7)) || "OOO".equals((String) board.get(1) + board.get(4) + board.get(7))){

            return true;
        }
        else if("XXX".equals((String) board.get(2) + board.get(5) + board.get(8)) || "OOO".equals((String) board.get(2) + board.get(5) + board.get(8))){

            return true;
        }
        else if("XXX".equals((String) board.get(0) + board.get(4) + board.get(8)) || "OOO".equals((String) board.get(0) + board.get(4) + board.get(8))){

            return true;
        }
        else if("XXX".equals((String) board.get(2) + board.get(4) + board.get(6)) || "OOO".equals((String) board.get(2) + board.get(4) + board.get(6))){

            return true;
        }
        else {
            return false;
        }

    }

}
