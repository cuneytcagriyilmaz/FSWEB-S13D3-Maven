package org.example;

public class Person {
    public String firstname;
    public String lastName;
    public int age;
    public String gender;
    public String occupation;
    public boolean isStudent;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String gender, String occupation, boolean isStudent) {
        this(firstname, lastName, age);
        this.gender = gender;
        this.occupation = occupation;
        this.isStudent = isStudent;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return (age >= 13 && age <= 19);
    }
}