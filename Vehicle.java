class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Bike extends Vehicle {
    Bike() {
        super(); // Calls the constructor of Vehicle
        System.out.println("Bike constructor");
    }
}
