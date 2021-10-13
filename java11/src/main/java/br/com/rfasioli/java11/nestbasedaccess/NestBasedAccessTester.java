package br.com.rfasioli.java11.nestbasedaccess;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestBasedAccessTester {
    public static void main(String[] args) {
        boolean isNestMate = NestBasedAccessTester.class.isNestmateOf(NestBasedAccessTester.Inner.class);
        boolean nestHost = NestBasedAccessTester.Inner.class.getNestHost() == NestBasedAccessTester.class;

        System.out.println(isNestMate);
        System.out.println(nestHost);


        Set<String> nestedMembers = Arrays.stream(NestBasedAccessTester.Inner.class.getNestMembers())
            .map(Class::getName)
            .collect(Collectors.toSet());

        System.out.println(nestedMembers);

    }

    public class Inner {}
}
