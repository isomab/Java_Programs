package functional_programming;

import java.util.Arrays;
import java.util.List;

public class FindOddNumbers {
    public static void main(String[] args) {
        List numbers = Arrays.asList(13, 45, 24, 67, 23, 4, 7, 33, 88);
        System.out.println("Odd numbers from list");
        printOddNumbersUsingFunctional(numbers);
    }

    private static void printOddNumbersUsingFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);
    }
}
