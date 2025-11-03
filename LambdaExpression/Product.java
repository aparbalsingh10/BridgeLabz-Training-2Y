import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount;
    }
}
public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("A", 500, 4.3, 10),
                new Product("B", 300, 4.9, 5),
                new Product("C", 700, 4.1, 25)
        );

        System.out.println("Sort by Price:");
        products.stream()
        .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
        .forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.stream()
        .sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
        .forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.stream()
        .sorted((p1, p2) -> Double.compare(p2.discount, p1.discount))
        .forEach(System.out::println);
    }
}
