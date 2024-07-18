package interview;

//Reverse a given String MUMBAI -> IABMUM
public class ReverseString {
    public static void main(String[] args) {
        String originalString = "MUMBAI";
        StringBuilder reverseString = new StringBuilder();

        char[] array = originalString.toCharArray();
        for (int i = (array.length - 1); i >= 0; i--) {
            reverseString.append(array[i]);

        }
        System.out.println("ReverseString -> " + reverseString);
    }
}
