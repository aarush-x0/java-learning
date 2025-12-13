package Mixed;

public class CountDivisible {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}

