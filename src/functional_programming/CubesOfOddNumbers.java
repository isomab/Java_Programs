package functional_programming;

import java.util.Arrays;
import java.util.List;

public class CubesOfOddNumbers {
    public static void main(String[] args) {
        List numbers = Arrays.asList(4, 6, 7, 13, 17, 3, 23);
        System.out.println("Cube of odd numbers from list");
        printCubesOfOddNumbers(numbers);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);

    }
}
