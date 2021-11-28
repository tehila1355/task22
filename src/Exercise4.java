public class Exercise4 {
    public static void main (String[] args) {
        int [] arr = {1,5,5,5,1};
        withoutDuplicates(arr);
    }

    public static int[] withoutDuplicates (int[] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (excludeDoubleNumbers(array, i)) {
                size = size + 1;
            }
        }
        int[] newArray = new int[size];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
                if (excludeDoubleNumbers(array, i)) {
                    newArray[index] = array[i];
                    if (index < size - 1) {
                        index = index + 1;
                    }else {
                        break;
                    }
                }
        }
        return newArray;
    }




    public static boolean excludeDoubleNumbers (int[] array , int numberIndex) {
        boolean isOnly = true;
        for (int i = (numberIndex - 1); i >= 0; i--) {
            if (array[i] == array[numberIndex]) {
                isOnly = false;
                break;
            }
        }
        return isOnly;
    }

}
