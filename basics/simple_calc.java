import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            char op = sc.next().charAt(0);

            double result = 0;

            if(op == '+') result = a + b;
            else if(op == '-') result = a - b;
            else if(op == '*') result = a * b;
            else if(op == '/') result = a / b;

            System.out.println("Result = " + result);
        }
    }
}
