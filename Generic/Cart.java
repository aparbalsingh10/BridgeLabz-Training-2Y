class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }

    public void displayItems() {
        for(T item : items) System.out.println(item);
    }
}

class Electronics { }
class Clothing { }

public class TestCart {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());
    }
}
