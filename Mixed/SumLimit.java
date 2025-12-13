package Mixed;

public class SumLimit {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;

            if (sum > 100) {
                System.out.println("Sum exceeded 100 at number: " + i);
                System.out.println("Final Sum = " + sum);
                break;
            }

            i++;
        }
    }
}

