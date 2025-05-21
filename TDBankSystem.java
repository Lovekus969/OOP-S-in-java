// Interface for Person behavior
interface Person {
    String getName();
    int getId();
}

// Interface for payment-related behavior
interface Payable {
    double getSalary();
    void processSalary();
}

// Base class for all staff
abstract class BankStaff implements Person, Payable {
    private String name;
    private int id;
    private double salary;

    public BankStaff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    public void processSalary() {
        System.out.println(name + "'s salary of $" + salary + " has been processed.");
    }

    public abstract void performDuties();
}

// Additional interface for loan approval authority
interface LoanAuthorizer {
    void authorizeLoan(double amount);
}

// Manager with extra authority
class Manager extends BankStaff implements LoanAuthorizer {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void authorizeLoan(double amount) {
        System.out.println(getName() + " authorized a loan of $" + amount);
    }

    public void performDuties() {
        System.out.println(getName() + " is overseeing branch operations.");
    }
}

// Security Guard
class SecurityGuard extends BankStaff {
    public SecurityGuard(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void performDuties() {
        System.out.println(getName() + " is ensuring branch security.");
    }
}

// Cleaner
class Cleaner extends BankStaff {
    public Cleaner(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void performDuties() {
        System.out.println(getName() + " is cleaning the bank premises.");
    }
}

// Main System
public class TDBankSystem {
    public static void main(String[] args) {
        BankStaff manager = new Manager("Alice", 101, 9000);
        BankStaff security = new SecurityGuard("Bob", 102, 4000);
        BankStaff cleaner = new Cleaner("Charlie", 103, 3500);

        BankStaff[] staffList = {manager, security, cleaner};

        for (BankStaff staff : staffList) {
            System.out.println("\nID: " + staff.getId() + " | Name: " + staff.getName());
            staff.performDuties();
            staff.processSalary();

            if (staff instanceof LoanAuthorizer) {
                ((LoanAuthorizer) staff).authorizeLoan(20000);
            }
        }
    }
}
