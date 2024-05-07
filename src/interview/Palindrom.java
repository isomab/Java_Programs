package interview;

public class Palindrom {
    public static void main(String[] args) {
        String number = "12321";
        char[] numberArray = number.toCharArray();
        int updatedLength = number.length() - 1;

        for (int i = 0; i < number.length(); i++) {
            if (numberArray[i] != numberArray[updatedLength]) {
                System.out.println("Given Number "+number+" is not palindrom");
                break;
            }
            updatedLength--;
            if (i == (number.length()-1)) {
                System.out.println("Given Number "+number+" is palindrom");
            }
        }
    }

}
