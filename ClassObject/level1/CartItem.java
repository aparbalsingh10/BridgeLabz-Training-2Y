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
        System.out.println(qty + " item(s) added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Headphones", 1500, 1);
        c.displayTotalCost();
        c.addItem(2);
        c.displayTotalCost();
        c.removeItem(1);
        c.displayTotalCost();
    }
}
