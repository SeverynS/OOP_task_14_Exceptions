package com.users.input;

import com.exceptions.DataInputException;
import com.users.LivingCountry;
import com.users.User;

import java.util.Scanner;

public class ManagerInput {
    public static void setUserData() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        String country;
        String firstName;
        String lastName;
        int age;

        System.out.println("Enter user`s country: ");
        country = scanner.nextLine();
        if (!LivingCountry.isValid(country)) {
            throw new DataInputException("this country is unacceptable");
        }
        user.setLivingCountry(LivingCountry.getCountryByAlias(country));

        System.out.println("Enter user`s first name: ");
        firstName = scanner.nextLine();
        if (firstName.length() < 2) {
            throw new DataInputException("first name must contain more than 2 characters");
        }
        user.setFirstName(firstName);

        System.out.println("Enter user`s last name: ");
        lastName = scanner.nextLine();
        if (lastName.length() < 2) {
            throw new DataInputException("last name must contain more than 2 characters");
        }
        user.setSecondName(lastName);

        System.out.println("Enter user`s age: ");
        age = scanner.nextInt();
        if (age > 120 || age < 20) {
            throw new DataInputException("The age " + age + " is incorrect fro human");
        }
        user.setAge(age);

        System.out.println("New user created successful " + user);
    }
}
