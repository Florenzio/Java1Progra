package com.una.models;

public class Person {
    private String name;
    private String id;
    private String lastName;
    private String email;

    public Person(String name, String id, String lastName, String email) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.email = email;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "Name " + getName() + "\nLast Name: " + getLastName() + "\niD: " + getId() + "\nEmail: " + getEmail();
    }
}
