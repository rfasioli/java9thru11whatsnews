package br.com.rfasioli.java11.newfeatures;

import java.util.Arrays;
import java.util.List;

public class CollectionsToArrayTester {
    public static void main(String[] args) {
        var namesList = Arrays.asList("Joe", "Julie");

        // New way
        var names = namesList.toArray(String[]::new);
        System.out.println(names.length);

        Arrays.stream(names).forEach(System.out::println);
    }
}
