package week4;

public class RemoveDuplicates {

    public static void main(String[] args) {
        remove_duplicates("AAABBBDSCC");
    }

    public static void remove_duplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);// each character of string

            if (!result.contains("" + each)) { // if string result doesn't contain the character
                result += each; //adding character to the string
            }

        }
        System.out.println(result);
    }
}