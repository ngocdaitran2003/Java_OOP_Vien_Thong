
import java.util.Scanner;

class Product{
    private String productID;
    private String name;
    private double price;

    public Product(String productID, String name, double price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }
    
    double getPrice(){
        return this.price;
    }

    void display(){
    System.out.printf("Sản phẩm: %s (Mã: %s)\n",this.name,this.productID);
    System.out.printf("Giá: %.1f\n",this.price);
    }
}

class Order{
    private String orderID;
    private Product product;
    private int quantity;

    public Order(String orderID, Product product, int quantity){
        this.orderID = orderID;
        this.product = product;
        this.quantity = quantity;
    }
    
    double calculateTotal(){
        return this.quantity * this.product.getPrice();
    }

    void display(){
        System.out.println("--- Thông tin đơn hàng ---");
        System.out.printf("Đơn hàng: %s\n",this.orderID);
        this.product.display();
        System.out.printf("Số lượng: %d\n",this.quantity);
        System.out.printf("Tổng tiền: %.1f\n",this.calculateTotal());
    }
}

public class OOP011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productID = sc.nextLine();
        String name = sc.nextLine();
        Double price = sc.nextDouble();
        sc.nextLine(); // consume the newline character
        String orderID = sc.nextLine();
        int quantity = sc.nextInt();
        Product myProduct = new Product(productID, name, price);
        Order myOrder = new Order(orderID, myProduct, quantity);
        myOrder.display();
    }
}
