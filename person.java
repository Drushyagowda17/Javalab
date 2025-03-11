package Java;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { // Constructor name fixed
        this.name = name;
        this.age = age;
    }

    public void displayDetails() { // Method name fixed
        System.out.println("Person details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 25); // Object creation fixed
        person1.displayDetails(); // Method call fixed
    }
}