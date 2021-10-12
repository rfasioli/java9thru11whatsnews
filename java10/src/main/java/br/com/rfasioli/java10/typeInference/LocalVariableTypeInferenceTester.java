package br.com.rfasioli.java10.typeInference;

import java.util.List;

public class LocalVariableTypeInferenceTester {
    public static void main(String[] args) {
        var names = List.of("Julie", "Robert", "Chris", "Joseph");
        names.forEach(System.out::println);
    }
}
