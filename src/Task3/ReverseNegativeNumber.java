package Task3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(getReverse(-1234));
    }

    public static int getReverse(int n){

        int reverse = 0; //
        while(n !=0){//
            int lastDigit = n %10;//4 3 2 1
            reverse = reverse * 10 + lastDigit; //-4  43  432  4321
            n/= 10; //123 12 1 0
        }

        return reverse;

    }

}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */