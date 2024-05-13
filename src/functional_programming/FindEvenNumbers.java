package functional_programming;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

    public static void main(String[] args) {
        List numbers = Arrays.asList(12, 9, 6, 8, 5, 34, 78);
        System.out.println("Find Even Numbers using Structured programming");
        printEvenNumbersStructured(numbers);
        System.out.println("Find Even Numbers using Functional programming");
        printEvenNumbersFunctional(numbers);
    }

    //Using Structured programming paradigm
    private static void printEvenNumbersStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    //Using functional programming paradigm
    private static void printEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);// Method Reference  [className::MethodName]
    }
}
