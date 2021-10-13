package br.com.rfasioli.java11.newfeatures;

import java.util.Optional;

public class OptionalNewMethodsTester {
    public static void main(String[] args) {
        String name = null;

        System.out.println("For name: " + name);
        System.out.println(Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        name = "Joe";
        System.out.println("For name: " + name);
        System.out.println(Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());
    }
}
