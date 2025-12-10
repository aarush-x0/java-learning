import java.util.Scanner;

class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();  // removes leftover newline
        String str = sc.nextLine();

        System.out.println("Number = " + num);
        System.out.println("String = " + str);
    }
}
