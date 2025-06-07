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
    //see
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



FAANG-Favorite OOP Questions
1️⃣ Design a Parking Lot System
Type: OOP Design

Asked By: Google, Amazon, Uber

Key Concepts:

Classes like ParkingLot, Vehicle, Ticket, ParkingSpot

Inheritance for Car, Bike, Truck

Enums for vehicle types, spot sizes

Design Patterns: Singleton (parking manager), Strategy

2️⃣ Design a Library Management System
Type: System Design (OOP)

Asked By: Amazon, Microsoft

Key Concepts:

Classes: Library, Book, Member, Librarian, Reservation

Relationships: Aggregation, Composition

Methods: searchBook(), borrowBook(), returnBook()

3️⃣ Difference Between Composition vs Inheritance
Type: Conceptual

Expected Answer:

Inheritance is "is-a" relationship

Composition is "has-a" relationship

Prefer composition to reduce tight coupling and increase flexibility

4️⃣ SOLID Principles Explanation
Type: Deep Theoretical + Design

Expected Questions:

What is Liskov Substitution Principle?

What happens if you violate the Open/Closed principle?

🎓 These principles guide good class design. They are asked heavily during design round.

5️⃣ Design Elevator System
Type: OOP System Design

Asked By: Facebook, Amazon

Classes: Elevator, Floor, ElevatorRequest, ElevatorController

Key OOP: Abstraction, Polymorphism, Encapsulation, State Machines

⚒️ Other OOP Design Questions:
Design ATM Machine

Design Online Shopping Cart

Design Splitwise (expense sharing app)

Design Chess / Tic Tac Toe using OOP

Design Ride Sharing App (Uber-like)
