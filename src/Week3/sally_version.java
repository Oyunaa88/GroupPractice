package Week3;
public class sally_version {
    public static void main(String[] args) {


        System.out.println("reverseNum= " + reverseNum(-13));
        System.out.println(primeNumber(100));
    }

//Q- Prime Number
    //      Write a method that can check if a number is prime or not


    //      Solution:
    public static boolean primeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }


    //**Reverse negative number**

    //Write a return method that can reverse negative number and
    // return it as int

    // Solution:
    public static int reverseNum(int num) {
        String str = new StringBuilder("" + num).reverse().toString();
        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }
        return Integer.valueOf(str);
    }
}