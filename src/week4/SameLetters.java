package week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(CompareTwoStrings("abc", "cab"));

    }

    public static boolean CompareTwoStrings(String str1, String str2){
        char[] left = str1.toCharArray(); // converting to Char Array
        char[] right = str2.toCharArray();
        Arrays.sort(left); // sorting array in alphabetical order
        Arrays.sort(right);
        return Arrays.equals(left, right); // checking both array lists are equal

    }
}
