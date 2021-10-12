package br.com.rfasioli.java9.optional;

import java.util.Optional;

public class IfPresentOrElseTester {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(1);

        optional.ifPresentOrElse(
            x -> System.out.println("Value: " + x),
            () -> System.out.println("Not Present."));

        optional = Optional.empty();

        optional.ifPresentOrElse(
            x -> System.out.println("Value: " + x),
            () -> System.out.println("Not Present."));
    }
}
