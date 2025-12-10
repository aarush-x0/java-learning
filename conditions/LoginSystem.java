package conditions;

import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.nextLine();
        String pass = sc.nextLine();

        if(user.equals("admin")) {
            if(pass.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("Invalid Username");
        }
    }
}

