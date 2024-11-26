package control_structures;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        System.out.println("Enter third number");
        int n3 = scanner.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println("Largest number is " + n3);
        } else if (n1 < n2 && n3 < n2) {
            System.out.println("Largest number is " + n2);
        } else {
            System.out.println("Largest number is " + n1);
        }

    }
}
