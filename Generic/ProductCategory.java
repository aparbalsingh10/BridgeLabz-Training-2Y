class ProductCategory { }

class BookCategory extends ProductCategory { }
class ClothingCategory extends ProductCategory { }
class GadgetCategory extends ProductCategory { }

class Product<T extends ProductCategory> {
    double price;
    T category;
    public Product(double price, T category) {
        this.price = price;
        this.category = category;
    }
    public double getPrice() { return price; }
}

class MarketUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        System.out.println("New Price: " + newPrice);
    }
}

public class TestMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(500, new BookCategory());
        MarketUtil.applyDiscount(book, 10);
    }
}
