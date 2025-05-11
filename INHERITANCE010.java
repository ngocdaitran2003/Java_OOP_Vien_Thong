import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Product{
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateCost(int quantity);

    void displayDetails(){
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Price: $%.1f\n", this.price);
        System.out.printf("Available Quantity: %d\n", this.quantity);

    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Book extends Product{
    private String author;
    
    public Book(String name, double price, int quantity, String author){
        super(name, price, quantity);
        this.author = author;
    }

    double calculateCost(int quantity){
        return getPrice() * quantity;
    }

    void displayDetails(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Price: $%.1f\n", getPrice());
        System.out.printf("Available Quantity: %d\n", getQuantity());
        System.out.printf("Author: %s\n", this.author);
    }
}

class Electronics extends Product{
    private String Brand;
    public Electronics(String name, double price, int quantity, String Brand){
        super(name, price, quantity);
        this.Brand = Brand;
    }

    double calculateCost(int quantity){
        return getPrice() * quantity * 1.1;
    }

    void displayDetails(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Price: $%.1f\n", getPrice());
        System.out.printf("Available Quantity: %d\n", getQuantity());
        System.out.printf("Brand: %s\n", this.Brand);
    }
}

class User{
    private String username;
    private double totalSpent;

    public User(double totalSpent, String username) {
        this.totalSpent = totalSpent;
        this.username = username;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public String getUsername() {
        return username;
    }

    void buyProduct(Product product, int quantity){
        if(quantity < product.getQuantity()){
            System.out.printf("User: %s bought %d %s for $%.1f\n", this.username, quantity, product.getName(), product.calculateCost(quantity));
            product.setQuantity(product.getQuantity() - quantity);
            this.totalSpent += product.calculateCost(quantity);
        }
        else{
            System.out.printf("Insufficient quantity of %s available.\n", product.getName());
        }
    }
}

public class INHERITANCE010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Electronics product1 = new Electronics("laptop", 20.0, 10, "Dell");
        Book product2 = new Book("Harry Potter", 10.0, 12, "camnh");
        User user1 = new User(0.00, "Alice");
        User user2 = new User(0.00, "Bob");
        User user3 = new User(0.00, "Charlie");
        while(t-- > 0){
            user1.buyProduct(product1, 3);
            user1.buyProduct(product2, 10);
            user2.buyProduct(product1, 1);
            user3.buyProduct(product2, 5);
            System.out.println("====");
            System.out.println("Users with Highest Total Spent:");
            System.out.printf("1. %s: $%.1f\n", user1.getUsername(), user1.getTotalSpent());
            System.out.printf("2. %s: $%.1f\n", user2.getUsername(), user2.getTotalSpent());
            System.out.printf("3. %s: $%.1f\n", user3.getUsername(), user3.getTotalSpent());
            System.out.println("====");
            product1.displayDetails();
            System.out.println("---");
            product2.displayDetails();
        }
    }
}
