package interview;

import java.sql.SQLOutput;

public class Palindrom {
    public static void main(String[] args) {
        String number = "12321";
        char[] numberArray = number.toCharArray();
        int maxLength = number.length() - 1;

        for (int i = 0; i < number.length(); i++) {
            if (numberArray[i] != numberArray[maxLength]) {
                System.out.println("Given Number "+number+" is not palindrom");
                break;
            }
            maxLength--;
            if (i == ((number.length() / 2) + 1)) {
                System.out.println("Given Number "+number+" is palindrom");
            }
        }
    }

}
