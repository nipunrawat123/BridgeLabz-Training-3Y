class Product {
    private static double discount = 10.0; // shared by all products
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + 
                               ", Price: " + price + 
                               ", Quantity: " + quantity + 
                               ", ProductID: " + productID + 
                               ", Discount: " + discount + "%");
        }
    }
}
