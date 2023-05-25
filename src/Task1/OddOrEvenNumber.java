package Task1;

public class OddOrEvenNumber {
    public static void main(String[] args) {

       OddOrEven(100);
    }

    public static void OddOrEven(int number){
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
