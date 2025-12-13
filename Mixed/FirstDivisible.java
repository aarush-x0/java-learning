package Mixed;

public class FirstDivisible {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                System.out.println("First number = " + i);
                break;
            }
        }
    }
}

