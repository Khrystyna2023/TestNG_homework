package com.christinatest.person;

public class Women extends Person {
    public Women(String firstName, String lastName, int age, String partner, String address) {
        super(firstName, lastName, age, partner, address);
    }
    public boolean isRetiredWomen() {
        return super.getAge() > 60;

    }

}
