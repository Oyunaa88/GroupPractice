package Week3;

public class PrimeNumWithRange {

    public static void main(String[] args) {

        int range = 100;

        for (int j = 2; j <= range; j++) { // num = j

            boolean isPrime = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(j + ", ");
            }
        }

    }

}

