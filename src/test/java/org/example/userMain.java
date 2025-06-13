package org.example;

import net.datafaker.Faker;

public class userMain {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String name1 = faker.name().firstName();

        user user1 = new user(name1);

        String name2 = faker.name().firstName();
        String email2 = faker.internet().emailAddress();

        user user2 = new user(name2, email2);

        System.out.println(user1);
        System.out.println(user2);
    }
}