package conditions;

import java.util.Scanner;

class StudentEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        double avg = (s1 + s2 + s3) / 3.0;

        if(avg > 60) {
            if(s1 > 40 && s2 > 40 && s3 > 40) {
                System.out.println("Eligible");
            } else {
                System.out.println("Subjects below 40");
            }
        } else {
            System.out.println("Average below 60");
        }
    }
}
