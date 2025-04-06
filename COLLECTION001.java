import java.util.HashMap;
import java.util.Map;

class Warehouse{
     // Sử dụng HashMap để lưu trữ thông tin sản phẩm với tên sản phẩm làm khóa
    private Map<String, Product> products;
     // Constructor để khởi tạo kho
    public Warehouse() {
        this.products = new HashMap<>();
    }
     // Lớp Product để lưu trữ thông tin về giá và số lượng tồn kho
    private class Product {
        int price;
        int stock;

        public Product(int price, int stock) {
            this.price = price;
            this.stock = stock;
        }
    }
 // Phương thức để thêm sản phẩm vào kho
    public void addProduct(String product, int price, int stock) {
        products.put(product, new Product(price, stock));
    }

    // Phương thức để lấy giá của một sản phẩm
    public int price(String product) {
        if (products.containsKey(product)) {
            return products.get(product).price;
        } else {
            return -99; // Nếu sản phẩm không tồn tại, trả về -99
        }
    }
}

public class COLLECTION001 {
    public static void main(String[] args) {
       Warehouse warehouse = new Warehouse();
       
       warehouse.addProduct("milk",3,10);
       warehouse.addProduct("coffee",5,7);
       
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
       
    }
}