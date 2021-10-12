package br.com.rfasioli.java9.streams;

import java.util.stream.Stream;

public class TakeWhileTester {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "", "e", "f")
            .takeWhile(s->!s.isEmpty())
            .forEach(System.out::print);
    }
}
