public class Exercise5 {
    public static void main (String[] args) {
        int [] array = {1,3,8,12,9,6,4,2};
        System.out.println(checkArray(array));
    }

    public static int checkArray (int[] array){
        boolean isAscending = false;
        boolean isDescending = false;
        int bigNumberIndex = 0;
        int index = -1;


        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]){
                bigNumberIndex = i;
            }
        }


        for (int j = 0; j < bigNumberIndex; j++) {
            if (checkRiseAndDescend(array, j , bigNumberIndex)){
                isAscending = true;
            }else {
                isAscending = false;
                break;
            }
        }


        for (int i = (array.length - 2); i >= bigNumberIndex ; i--) {
            if (checkRiseAndDescend(array, i , bigNumberIndex)) {
                isDescending = true;
            }else {
                isDescending = false;
                break;
            }
        }

        boolean isAscendingDescendingArray = isAscending && isDescending;
        if (isAscendingDescendingArray){
            index = bigNumberIndex;
        }

        return index;
    }



    public static boolean checkRiseAndDescend(int [] array, int checkNumberIndex, int bigNumberIndex){
        boolean isRiseOrDescend = false;
        if (array[checkNumberIndex] < array[(checkNumberIndex + 1)]) {
            if (checkNumberIndex < bigNumberIndex) {
                isRiseOrDescend = true;
            }
        }else if (array[checkNumberIndex] > array[(checkNumberIndex + 1)]){
            if (checkNumberIndex >= bigNumberIndex) {
                isRiseOrDescend = true;
            }
        }
        return isRiseOrDescend;
    }

}

