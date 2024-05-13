package functional_programming;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class FindContainingWords {
    public static void main(String[] args) {
        List<String> Courses = Arrays.asList("Spring", "Spring Boot", "API", "MicroServices", "Azure", "Solr", "Database", "Java", "Hibernate");

        //Find words containing Spring words
        System.out.println("Words containing Spring word");
        printCoursesContainingSpring(Courses);
        System.out.println("\n");
        System.out.println("Words with having length more than 6 characters");
        printWordsWithHavingMorethanFourCharacters(Courses);

    }

    private static void printWordsWithHavingMorethanFourCharacters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 6)
                .forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }
}
