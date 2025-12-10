import java.util.Scanner;

class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double area = Math.PI * r * r;

        System.out.printf("Area = %.2f", area);
    }
}
