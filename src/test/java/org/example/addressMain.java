package org.example;

import net.datafaker.Faker;

public class addressMain {
    public static void main(String[] args) {
        Faker faker = new Faker();
        addressUser user = new addressUser(faker);
        user.printInfo();
    }
}
