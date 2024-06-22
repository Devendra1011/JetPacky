package com.example.jetpacky;

public class Person {
    private String personName;
    private String personEmail;


    public Person(String personName, String personEmail) {
        this.personName = personName;
        this.personEmail = personEmail;
    }

    public Person( ) {

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }
}
