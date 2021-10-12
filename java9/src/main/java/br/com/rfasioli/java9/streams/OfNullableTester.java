package br.com.rfasioli.java9.streams;

import java.util.stream.Stream;

public class OfNullableTester {
    public static void main(String[] args) {
        long count = Stream.ofNullable(100).count();
        System.out.println(count);

        count = Stream.ofNullable(null).count();
        System.out.println(count);
    }
}
