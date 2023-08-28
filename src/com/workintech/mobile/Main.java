package com.workintech.mobile;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("131313131132");
        Contact ahmet = new Contact("Ahmet","64654454");
        phone.addNewContact(new Contact("Ayşe", "131313131132"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Ahmet", "131313131132"));
        phone.addNewContact(new Contact("Cem", "1231232"));
        phone.addNewContact(new Contact("Ali", "1231232"));
        phone.addNewContact(new Contact("Cem", "12312333"));
        phone.printContact();

        System.out.println("index: " + phone.findContact(ahmet));
        System.out.println("index with String: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Ayşe"));
        phone.removeContact(ahmet);
        phone.printContact();
    }
}
