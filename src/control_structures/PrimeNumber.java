package control_structures;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a prime");
        int number = scanner.nextInt();
        Boolean flag = false;

        if (number == 0 || number == 1) {
            flag = true;
        } else {
            for (int i = 2; i <= number / 2; ++i) {

                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }
        }

        if (!flag) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }


    }
}
