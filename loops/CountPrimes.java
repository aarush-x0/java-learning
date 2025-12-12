package Loops;

public class CountPrimes {
    public static void main(String[] args) {
        int L = 10, R = 50;
        int count = 0;

        for (int i = L; i <= R; i++) {
            if (isPrime(i)) count++;
        }
        System.out.println(count);
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

