class Patient {
    private static String hospitalName = "Apollo Hospital";
    private static int totalPatients = 0;

    private String name, ailment;
    private int age;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + 
                               ", Name: " + name + 
                               ", Age: " + age + 
                               ", Ailment: " + ailment + 
                               ", PatientID: " + patientID);
        }
    }
}
