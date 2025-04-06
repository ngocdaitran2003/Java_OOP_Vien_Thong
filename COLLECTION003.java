import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Warehouse{
    // Sử dụng HashMap để lưu trữ thông tin sản phẩm với tên sản phẩm làm khóa
   private Map<String, Integer> stockMap;
   private Map<String, Integer> priceMap;

    // Constructor để khởi tạo kho
   public Warehouse() {
       this.stockMap = new HashMap<>();
       this.priceMap = new HashMap<>();
   }

// Phương thức để thêm sản phẩm vào kho
   public void addProduct(String product, int price, int stock) {
       this.stockMap.put(product, stock);
       this.priceMap.put(product, price);
   }

   // Phương thức để lấy giá của một sản phẩm
   public int price(String product) {
       if (this.priceMap.containsKey(product)) {
           return this.priceMap.get(product);
       } else {
           return -99; // Nếu sản phẩm không tồn tại, trả về -99
       }
   }

    public int stock(String product){
        if(this.stockMap.containsKey(product)){
            return this.stockMap.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product){
        if(this.stockMap.containsKey(product)){
            int currentStock = this.stockMap.get(product);
            if(currentStock > 0){
                this.stockMap.put(product, currentStock - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return this.stockMap.keySet();
    }
}



public class COLLECTION003 {
    public static void main(String[] args){
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 20, 2);
        warehouse.addProduct("yogurt", 2, 20);
        
        warehouse.take("buttermilk");
        warehouse.take("milk");
        warehouse.take("buttermilk");
        
        //System.out.println("Products with stock > 0:");
        for (String product : warehouse.products()) {
            if (warehouse.stock(product) > 0) {
                System.out.println(product);
            }
        }
    }
}
