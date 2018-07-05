package com.zamir.hello;

public class Person {

//    instance variables, both of type String, named lastName and firstName
    private String lastName;
    private String firstName;

//    default constructor
    public  Person(){

    }

//    constructor that passes in both instance variables
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

//    getters and setters
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    toString method
    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
