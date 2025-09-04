class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary() + ", Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(501, "IT", 75000, 10);
        m1.updateSalary(80000);
        m1.display();
    }
}
