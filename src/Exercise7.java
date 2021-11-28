import java.util.Scanner;

public class Exercise7 {
    public static final int ARRAY_SIZE = 10;
    public static void main (String[] args) {
        char[] gameBoard = new char[ARRAY_SIZE];
        boolean isWin;


        do {
            System.out.println("player 1");
            int index1 = getPositionFromUser(gameBoard);
            isWin = placeSymbolOnBoard(gameBoard, index1 , 'X');
            if (isWin) {
                break;
            }

            System.out.println("player 2");
            int index2 = getPositionFromUser(gameBoard);
            isWin = placeSymbolOnBoard(gameBoard, index2 , '0');

        }while (!isWin);

    }



    public static void printBoard (char[] charArray) {
        for (int i = 1; i < 10; i++) {
            if (i == 3|| i ==6){
                System.out.println (charArray[i] + "  ");
            } else{
                System.out.print(charArray[i] + "  ");
            }
        }
        System.out.println();
    }



    public static boolean isAvailable(char[] gameBoard , int index) {
        boolean isAvailable = true;
        if (gameBoard[index] == 'X' || gameBoard[index] == '0') {
            isAvailable = false;
        }
        return isAvailable;
    }




    public static int getPositionFromUser (char[] gameBoard){
        Scanner scanner = new Scanner(System.in);
        int numberLocation;
        boolean invalid = true;

        do {
            System.out.println("What is the location where you want to draw your logo");
            numberLocation = scanner.nextInt();

            if (numberLocation < 1 || numberLocation > 9) {
                System.out.println("This number is out of range");
            }


            if (numberLocation >= 1 && numberLocation <= 9) {
                if (!isAvailable(gameBoard, numberLocation)) {
                    System.out.println("This location is already occupied");
                } else {
                    invalid = false;
                }
            }
        }while (invalid) ;


            return numberLocation;
        }


        public static char checkWinner (char[] gameBoard) {
        char result = '-';


        if (gameBoard[1] != 0){
            if (gameBoard[1] == gameBoard[2] && gameBoard[1]== gameBoard[3]) {
                result = gameBoard[1];
            }

            if (gameBoard[1] == gameBoard[4] && gameBoard[1] == gameBoard[7]) {
                result = gameBoard[1];
            }

            if (gameBoard[1] == gameBoard[5] && gameBoard[1] == gameBoard[9]) {
                result = gameBoard[1];
            }

        }

        if (gameBoard[3] != 0){
            if (gameBoard[3] == gameBoard[6] && gameBoard[3] == gameBoard[9]) {
                result = gameBoard[3];
            }
            if (gameBoard[3] == gameBoard[5] && gameBoard[3] == gameBoard[7]) {
                result = gameBoard[3];
            }

        }


         if (gameBoard[4] == gameBoard[5] && gameBoard[4] == gameBoard[6]) {
             if (gameBoard[4] != 0){
                 result = gameBoard[4];
             }
         }


         if (gameBoard[7] == gameBoard[8]  && gameBoard[7] == gameBoard[9]) {
             if (gameBoard[7] != 0){
                 result = gameBoard[7];
             }
         }

         if (gameBoard[2] == gameBoard[5] && gameBoard[2] == gameBoard[8]) {
             if (gameBoard[2] != 0){
                 result = gameBoard[2];
             }
         }

        return result;
        }


        public static boolean placeSymbolOnBoard (char[] gameBoard, int index, char player) {
        boolean isWinner = false;
        gameBoard[index] = player;
        printBoard(gameBoard);
        char winner = checkWinner(gameBoard);
        if (winner == 'X') {
            System.out.println("X you win");
            isWinner = true;
        }
        if (winner == '0'){
            System.out.println("0 you win");
            isWinner = true;
        }

        return isWinner;
        }

}
