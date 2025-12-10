package conditions;

import java.util.Scanner;

class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        if(pass.equals("java123")) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}

