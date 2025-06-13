package org.example;

import net.datafaker.Faker;

public class bookMain {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String title = faker.book().title();
        String author = faker.book().author();
        int pages = faker.number().numberBetween(10, 1500);

        Book book = new Book(title, author, pages);

        System.out.println(book);

    }
}