class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Not enough quantity to remove!");
        }
    }

    double totalCost() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName + " | Price: " + price + " | Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Headphones", 1500, 2);
        item1.addItem(1);
        item1.removeItem(1);
        item1.displayCart();
    }
}
