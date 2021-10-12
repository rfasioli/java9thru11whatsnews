package br.com.rfasioli.java10.apiImprovements;

import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) {
        var optional = Optional.of("test string");
        System.out.println(optional.orElseThrow(RuntimeException::new));

        try {
            optional = Optional.empty();
            System.out.println(optional.orElseThrow(RuntimeException::new));
        } catch (RuntimeException e) {
            System.out.println("Exception throwed " + e.getMessage());
        }
    }
}
