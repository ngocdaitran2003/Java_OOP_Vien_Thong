import java.util.HashMap;
import java.util.ArrayList;

class Item {
    private String product;
    private int quantity;
    private int unitPrice;
    private int originalQuantity;

    // Constructor 1: Với giá và số lượng
    public Item(String product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = price;
        this.originalQuantity = quantity;
    }

    // Constructor 2: Không có giá
    public Item(String product, int quantity) {
        this(product, quantity, 0);
    }

    // Getter methods
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public int getUnitPrice() { return unitPrice; }
    public int getOriginalQuantity() { return originalQuantity; }

    // Setter methods
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Tính tổng giá trị sản phẩm
    public int getTotalPrice() {
        return quantity * unitPrice;
    }

    // In thông tin sản phẩm
    public void printItemInfo() {
        System.out.printf("Product: %s has quantity %d with price: %d\n", this.product,this.quantity,getTotalPrice());
        
    }
}

class Warehouse {
    private HashMap<String, Item> items = new HashMap<>();

    // Nhập hàng vào kho
    public void importProduct(Item item) {
        items.put(item.getProduct(), item);
    }

    // Lấy một sản phẩm theo tên
    public Item getItem(String name) {
        return items.get(name);
    }

    // Xóa sản phẩm khỏi kho
    public void removeProduct(String name, int quantity) {
        if (items.containsKey(name)) {
            Item item = items.get(name);
            if (item.getQuantity() > quantity) {
                item.setQuantity(item.getQuantity() - quantity);
            } else {
                items.remove(name);
            }
        }
    }

    // Giảm số lượng trong kho đi 1
    public void decreaseQuantityInWarehouseByOne() {
        for (Item item : items.values()) {
            if (item.getQuantity() > 0) {
                item.setQuantity(item.getQuantity() - 1);
            }
        }
    }

    // Chuyển hàng từ kho vào danh sách đặt hàng
    public void takeFromItemToWarehouse(ArrayList<Item> orderList, String name, int quantity) {
        if (items.containsKey(name)) {
            Item item = items.get(name);
            if (item.getQuantity() >= quantity) {
                orderList.add(new Item(name, quantity, item.getUnitPrice()));
                item.setQuantity(item.getQuantity() + quantity);
            }
            else{
                orderList.add(new Item(name, quantity, item.getUnitPrice()));
                item.setQuantity(item.getQuantity()*2);
            }
        }
    }

    // In thông tin kho
    public void printWarehouseInfo() {
        for (Item item : items.values()) {
            item.printItemInfo();
        }
    }
}

public class COLLECTION004 {
    public static void main(String[] args) {
        Item item1 = new Item("milk", 4, 2);
        Item item2 = new Item("buttermilk", 10, 2);

        item1.printItemInfo();
        item2.printItemInfo();

        Warehouse warehouse = new Warehouse();
        warehouse.importProduct(item1);
        warehouse.importProduct(item2);

        warehouse.removeProduct("milk", 1);
        warehouse.removeProduct("buttermilk", 3);
        warehouse.printWarehouseInfo();

        warehouse.decreaseQuantityInWarehouseByOne();
        warehouse.printWarehouseInfo();

        ArrayList <Item> list_item = new ArrayList<Item>();
        list_item.add(item1);
        list_item.add(item2);

        warehouse.takeFromItemToWarehouse(list_item, "milk", 5);
        warehouse.takeFromItemToWarehouse(list_item, "buttermilk", 1);
        warehouse.printWarehouseInfo();
    }
}
