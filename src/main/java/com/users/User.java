package com.users;

public class User {
    String firstName;
    String secondName;
    int age;
    LivingCountry livingCountry;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLivingCountry(LivingCountry livingCountry) {
        this.livingCountry = livingCountry;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", livingCountry=" + livingCountry +
                '}';
    }
}
