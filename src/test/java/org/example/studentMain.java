package org.example;

import net.datafaker.Faker;

public class studentMain {
    public static void main(String[] args) {
        Faker faker = new Faker();

        Student student = new Student();
        student.setName(faker.name().fullName());
        student.setAge(faker.number().numberBetween(18, 25));
        student.setGrade(faker.options().option("A", "B", "C", "D"));

        System.out.println("Student Info:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }
}