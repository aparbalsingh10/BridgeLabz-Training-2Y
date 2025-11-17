abstract class WarehouseItem { }

class Electronics extends WarehouseItem { }
class Groceries extends WarehouseItem { }
class Furniture extends WarehouseItem { }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

class DisplayUtil {
    public static void displayAll(List<? extends WarehouseItem> list) {
        for(WarehouseItem item : list)
            System.out.println(item.getClass().getSimpleName());
    }
}

public class TestWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> eStore = new Storage<>();
        eStore.addItem(new Electronics());

        DisplayUtil.displayAll(eStore.getItems());
    }
}
