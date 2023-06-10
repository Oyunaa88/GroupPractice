package Week3;

public class PrimeNum_1 {
    /*
    Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {
        System.out.println(isPrime(49));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


/*
        for(int i = 2; i < n; i++){
            the loop starts from 2 and goes until the number n
            we start from 2 because we want to check if the number n is evenly divisible by any number. We don't check for 1 or the number itself because all numbers are evenly divisible by those

            if(n % i == 0){
                this if statement is executed each iteration and checks if the number n is evenly divisible by i. If a number is prime if shouldn't be evenly divisible by any other number. divisibility means when the number is divided there is no left over

               return false;  false is returned whenever the above if statement is true meaning the number n was divisible by a number besides 1 and itself (that is what the loop checks for)

               otherwise true is returned by default at the end of the method
                 */