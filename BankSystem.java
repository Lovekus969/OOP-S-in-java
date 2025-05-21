
class BankStaff {
    private String name;
    private int id;
    private double salary;

    public BankStaff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Encapsulation: getters and setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Role description
    public String getRole() {
        return "BankStaff";
    }
}

class CleaningStaff extends BankStaff {
    public CleaningStaff(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String getRole() {
        return "Cleaning Staff";
    }
}

class SecurityStaff extends BankStaff {
    public SecurityStaff(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String getRole() {
        return "Security Staff";
    }
}

class Manager extends BankStaff {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}

class AssistantManager extends BankStaff {
    public AssistantManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String getRole() {
        return "Assistant Manager";
    }
}

class BankEmployee extends BankStaff {
    public BankEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String getRole() {
        return "Bank Employee";
    }

    // Additional method to handle user requests
    public void handleUserRequest() {
        System.out.println(getName() + " is handling a user request.");
    }
}

 public class BankSystem {
    public static void main(String[] args) {
        BankStaff[] staffMembers = {
            new CleaningStaff("John", 101, 3000),
            new SecurityStaff("Dave", 102, 3500),
            new Manager("Susan", 103, 9000),
            new AssistantManager("Kate", 104, 7000),
            new BankEmployee("Tom", 105, 5000)
        };

        for (BankStaff staff : staffMembers) {
            System.out.println(staff.getName() + " - " + staff.getRole() + " - Salary: $" + staff.getSalary());
            if (staff instanceof BankEmployee) {
                ((BankEmployee) staff).handleUserRequest();
            }
        }

        // Example of encapsulation: change salary
        staffMembers[0].setSalary(3200);
        System.out.println("Updated salary of " + staffMembers[0].getName() + ": $" + staffMembers[0].getSalary());
    }
}
