public class Car {
    String model;
    int year;

    Car() {
        this("Default Model", 2020); // calls the second constructor
        System.out.println("Default constructor called");
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }
}
