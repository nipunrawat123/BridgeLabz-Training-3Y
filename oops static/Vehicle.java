class Vehicle {
    private static double registrationFee = 5000.0;
    private String ownerName, vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + 
                               ", Type: " + vehicleType + 
                               ", Reg. No: " + registrationNumber + 
                               ", Fee: " + registrationFee);
        }
    }
}
