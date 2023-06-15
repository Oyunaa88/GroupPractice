package week4;

public class FrequencyOfChars {

    public static void main(String[] args) {

        frequencyOfEachChars("AADBBCCEEEE");
    }

    public static void frequencyOfEachChars(String str){

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of str
            int count = 0; //counter
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                if(str.charAt(i) == ch){ // if char is same as charAt(i), count will be increased
                    count++;
                }
            }
            if(result.contains(""+ch)){ // if the character is already included in the result
                continue; // skip that character
            }

            result +=  ch + "" + count; // make the count to string in order to concatenate
        }

        System.out.println(result);

    }
}
