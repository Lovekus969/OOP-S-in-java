// Base class: M8 (the car)
class M8 {
    void start() {
        System.out.println("BMW M8 is starting.");
    }
}

// Subclass 1: Horn extends M8
class Horn extends M8 {
    void honk() {
        System.out.println("Horn is honking: Beep beep!");
    }
}

// Subclass 2: EngineDemonMode extends M8
class EngineDemonMode extends M8 {
    void activateDemonMode() {
        System.out.println("Demon mode activated: 900 HP unleashed!");
    }
}

// Subclass 3: ManualShift extends M8
class ManualShift extends M8 {
    void shiftGear() {
        System.out.println("Manual gear shifted.");
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        Horn horn = new Horn();
        horn.start();   // inherited from M8
        horn.honk();    // own method

        EngineDemonMode demon = new EngineDemonMode();
        demon.start();
        demon.activateDemonMode();

        ManualShift manual = new ManualShift();
        manual.start();
        manual.shiftGear();
    }
}
