package br.com.rfasioli.java11.newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateTester {
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("Java", "\n", "HTML", " ");

        List<String> tutorials = tutorialsList.stream()
            .filter(Predicate.not(String::isBlank))
            .collect(Collectors.toList());

        tutorials.forEach(System.out::println);
    }
}
