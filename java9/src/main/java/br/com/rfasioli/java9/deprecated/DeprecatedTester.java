package br.com.rfasioli.java9.deprecated;

public class DeprecatedTester {
    // No impact for runtime, only info for docs, intellisence, linters...

    @Deprecated
    public void method() {
        System.out.println("Deprecated method");
    }

    @Deprecated(forRemoval = true)
    public void method2() {
        System.out.println("Deprecated method2");
    }

    @Deprecated(since = "1.0")
    public void method3() {
        System.out.println("Deprecated method3");
    }

}
