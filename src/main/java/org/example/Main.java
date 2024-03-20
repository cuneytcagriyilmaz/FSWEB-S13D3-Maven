package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Alice", "Smith", 16, "Female", "Student", true);

        System.out.println("Person 1:");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("****************************");
        System.out.println("Person 2:");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());

        System.out.println("*****************************");
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }


}
