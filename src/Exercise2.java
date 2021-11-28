import java.util.Scanner;

public class Exercise2 {
    public static final int ARRAY_SIZE = 10;
    public static void main (String[] args){
        largerThanAverage();
    }

    public static void largerThanAverage () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        int[] arrayNumbers = new int[ARRAY_SIZE];
        int sum = 0;


        for (int j = 0; j < arrayNumbers.length; j++) {
                arrayNumbers[j] = scanner.nextInt();
                sum = sum + arrayNumbers[j];
        }

        int average = sum / ARRAY_SIZE;

        for (int j = 0; j < arrayNumbers.length; j++) {
            if (arrayNumbers[j] > average) {
                if (excludeDoubleNumbers(arrayNumbers, j)) {
                    System.out.print(arrayNumbers[j] + ", ");
                }
            }

        }
    }


    public static boolean excludeDoubleNumbers (int[] array , int numberPlace) {
        boolean isOnly = true;
        for (int i = (numberPlace - 1); i >= 0; i--) {
            if (array[i] == array[numberPlace]) {
                isOnly = false;
                break;
            }
        }
        return isOnly;
    }

}
