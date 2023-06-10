package com.christinatest.person;

public class Main {
    public static void main(String[] args) {

        Person women = new Person("Mary", "Bom", 70, "Bob Smith", "TestStreet1");
        Man men = new Man("Bob", "Smith", 40, "Mary Bom", "TestStreet1");
        Women women1 = new Women("Anna", "Flower",24, "Tom Cook", "TestStreet2");

        System.out.println(women instanceof Person);
        System.out.println(men instanceof Man);
        System.out.println(women1 instanceof Women);


        System.out.println("Retired or Worker: " + women1.isRetiredWomen());
        System.out.println("Retired or Worker: " + men.isRetiredMan());
        women1.printAddress(": 152");
        women1.printAge();
        System.out.println("Partner:" + women1.getPartner());

    }
}
