# OOP-S-in-java
Java OOP Example – Encapsulation with Publicity Class  This simple Java project demonstrates the concept of **Encapsulation** in Object-Oriented Programming (OOP) using a `Publicity` class.
 Abstract Class
What: A class that can have both abstract methods (without body) and concrete methods (with body).

Purpose: To provide a base class with some common implemented functionality and some methods left for subclasses to implement.

Use when you want to share code among closely related classes and enforce that some methods are implemented.

Key points:
Can have constructors, fields, methods (both abstract and concrete).You cannot create instances of an abstract class.A subclass must implement all abstract methods (unless subclass is abstract too).

Supports single inheritance only (Java).

Example:

abstract class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }

    abstract void sound();  // abstract method (no body)
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
2. Interface
What: A pure abstract contract that defines methods without implementations (Java 7/8+ allows default and static methods too).

Purpose: To specify what a class should do but not how.

Use when: You want to define capabilities that can be shared across unrelated classes (multiple inheritance of type).

Key points:
All methods are abstract by default (unless default/static).No instance fields (only constants allowed).Supports multiple inheritance — a class can implement many interfaces.Since Java 8, interfaces can have default and static methods with body.

Example:
interface Flyable {
    void fly();  // abstract method
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying");
    }
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
