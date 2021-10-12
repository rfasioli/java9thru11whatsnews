package br.com.rfasioli.java9.streams;

import java.util.stream.IntStream;

public class IterateTester {
    public static void main(String[] args) {
        IntStream.iterate(3, x -> x < 10, x -> x + 3)
            .forEach(System.out::println);
    }
}
