public class Exercise6 {
    public static void main (String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {4,5,6};
        System.out.println(arrayStrangers(array1,array2));
    }

    public static int[] intersectionArrays(int[] array1, int[] array2){
        int sizeArray = 0;
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            if (excludeDoubleNumbers(array1, array2 , i)) {
                sizeArray = sizeArray + 1;
            }
        }

        int[] intersectionArrays = new int[sizeArray];
        for (int i = 0; i < array1.length; i++) {
            if (intersectionArrays.length == 0){
                break;
            }
            if (excludeDoubleNumbers(array1, array2 , i)) {
                intersectionArrays[counter] = array1[i];
                counter = counter + 1;
            }
            if (counter == intersectionArrays.length){
                break;
            }
        }
        return intersectionArrays;
    }



    public static boolean excludeDoubleNumbers (int[] array1 , int[] array2, int numberPlace) {
        boolean isOnly = false;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == array1[numberPlace]) {
                isOnly = true;
                break;
            }
        }
        return isOnly;
    }

    public static boolean arrayStrangers (int[] array1, int[] array2){
        boolean isStrangers = false;
        int[] arr = intersectionArrays(array1, array2);
        if (arr.length == 0) {
            isStrangers = true;
        }

        return isStrangers;
    }
}
