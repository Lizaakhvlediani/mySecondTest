package org.example;

import net.datafaker.Faker;

public class user {
    private String name;
    private String email;

    private static final Faker faker = new Faker();

    public user(String name) {
        this.name = name;
        this.email = faker.internet().emailAddress();
    }
    public user(String name, String email) {
        this.name = name;
        this.email = (email != null && !email.isEmpty()) ? email : faker.internet().emailAddress();
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email=' " + email + "'}";
    }
}