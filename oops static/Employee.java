class Employee {
    private static String companyName = "Tech Solutions Pvt Ltd";
    private static int totalEmployees = 0;

    private String name, designation;
    private final int id;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + 
                               ", Name: " + name + 
                               ", ID: " + id + 
                               ", Designation: " + designation);
        }
    }
}
