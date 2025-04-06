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

    public int stock(String product){
    if(products.containsKey(product)){
        return products.get(product).stock;
    } else {
        return 0;
    }
}

    public boolean take(String product){
        if(products.containsKey(product) && products.get(product).stock > 0){
            products.put(product, new Product(products.get(product).price , products.get(product).stock - 1));
            return true;
        } else{
            return false;
        }
    }
}
public class COLLECTION002 {
    public static void main(String[] args){
        Warehouse warehouse = new Warehouse();
        
        // Thêm sản phẩm vào kho
        warehouse.addProduct("coffee", 5, 1);
        
        // In số lượng tồn kho
        System.out.println("stock:");
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
        
        // Thử lấy sản phẩm khỏi kho và in kết quả
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));
        
        // In lại số lượng tồn kho
        System.out.println("stock:");
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
