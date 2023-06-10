package com.christinatest.person;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, String partner, String address) {
        super(firstName, lastName, age, partner, address);
    }

    public boolean isRetiredMan() {
        return 65 < super.getAge();

    }
}
