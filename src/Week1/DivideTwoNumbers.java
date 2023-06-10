package Week1;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        divideTwo(30,4);
    }

    public static void divideTwo(int num1, int num2){

        int count =0;
        while (num1> num2){
            num1 -= num2;
            count++;
        }
        System.out.println(count + " with a remainder of " + num1);
    }
}
