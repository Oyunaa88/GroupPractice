package Task2;

public class SwapTwoNum {

        // Swap two numbers value without using third number.
        public static void main(String[] args) {
            int a = 3;
            int b = 14;

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            a = a + b; // a = 17
            b = a - b; // b= 17-14
            a = a - b; // 17-3 = 14

            System.out.println("After swapping: a = " + a + ", b = " + b);
        }

}
