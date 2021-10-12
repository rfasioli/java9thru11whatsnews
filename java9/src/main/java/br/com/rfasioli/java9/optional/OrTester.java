package br.com.rfasioli.java9.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OrTester {
    public static void main(String[] args) {
        Supplier<Optional<String>> supplierString = () -> Optional.of("Not Present");

        Optional.of("Mahesh")
            .or(supplierString)
            .ifPresent(System.out::println);

        Optional.empty()
            .or(supplierString)
            .ifPresent(System.out::println);
    }
}
