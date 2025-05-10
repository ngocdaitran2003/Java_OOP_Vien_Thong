
abstract class Product{
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateCost(int quantity){

    }

    void displayDetails(){
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Price: $%f\n", this.price);
        System.out.printf("Available Quantity: %d\n", this.quantity);

    }
}

class Book extends Product{
    private String author;
    
    public Book(String name, double price, int quantity, String author){
        super(name, price, quantity);
        this.author = author;
    }
}

public class INHERITANCE010 {
    
}
