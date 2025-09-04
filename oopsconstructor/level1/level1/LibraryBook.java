class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("OOP in Java", "E. Balagurusamy", 450, true);
        b1.borrowBook();
        b1.borrowBook();
    }
}
