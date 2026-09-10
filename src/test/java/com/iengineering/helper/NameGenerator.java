package com.iengineering.helper;

import com.github.javafaker.Faker;

public class NameGenerator {
	public static String FullName()
    {
        Faker faker = new Faker();
        String name;
        return name = faker.name().fullName();
    }
    public static String FirstName()
    {
        Faker faker = new Faker();
        String firstName;
        return firstName = faker.name().firstName();
    }
    public static String LastName()
    {
        Faker faker = new Faker();
        String lastName;
        return lastName = faker.name().lastName();
    }
    public static String StreetAddress()
    {
        Faker faker = new Faker();
        String streetAddress;
        return streetAddress = faker.address().streetAddress();
    }
}
