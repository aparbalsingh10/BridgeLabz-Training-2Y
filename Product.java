import java.util.*;
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId + " by Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: ₹" + total);
    }
}
class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Customer places an order
    public Order placeOrder(int orderId) {
        Order o = new Order(orderId, this);
        orders.add(o);
        return o;
    }

    public void showOrders() {
        System.out.println("Customer: " + name + " has placed orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}
public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("Aman");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 1500);
        Product p3 = new Product("Keyboard", 2500);
        Order o1 = c1.placeOrder(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = c1.placeOrder(102);
        o2.addProduct(p3);
        c1.showOrders();
    }
}
