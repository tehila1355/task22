public class Exercise1 {
    public static void main (String[] args) {
        System.out.println(stringContainsString("I like eating apples", "apple"));

    }

    public static boolean stringContainsString(String bigStr, String smallStr) {
        boolean isContain = false;
        for (int startWord = 0; startWord < bigStr.length()-smallStr.length() + 1; startWord++) {
            if (bigStr.charAt(startWord) == smallStr.charAt(0))
                isContain = stringsAreSame(startWord, bigStr, smallStr);
            else if (isContain){
                break;
            }
        }
        return isContain;
    }



    public static boolean stringsAreSame (int startWord, String bigStr, String smallStr) {
        boolean same = true;

        for (int i = 1; i < smallStr.length(); i++) {
            startWord++;
            if (bigStr.charAt(startWord) != smallStr.charAt(i)) {
                same = false;
                break;
            }
        }
        return same;
    }

}
