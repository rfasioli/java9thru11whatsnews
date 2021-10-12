package br.com.rfasioli.java10;

public class VersionTester {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.printf(" feature: %s%n interim: %s%n update: %s%n patch: %s%n",
            version.feature(),
            version.interim(),
            version.update(),
            version.patch());
    }
}
