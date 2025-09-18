class Student {
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;

    private String name, grade;
    private final int rollNumber;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + 
                               ", Name: " + name + 
                               ", Roll No: " + rollNumber + 
                               ", Grade: " + grade);
        }
    }
}
