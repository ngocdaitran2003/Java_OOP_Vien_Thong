package com.mycompany.main;
import java.util.ArrayList;

class Item{
    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
    
    public String toString(){
        return String.format("%s $%.2f (-$%.2f)\n",this.name, this.price, this.discount);
    }
}

class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

abstract class GroceryBill{
    private Employee clerk;
    protected ArrayList<Item> receipt = new ArrayList<>();
    protected double total = 0;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }
    
    public void add(Item i){
       this.receipt.add(i);
       this.total = this.total + i.getPrice();
    }

    public Employee getClerk() {
        return clerk;
    }

    public double getTotal() {
        return total;
    }
    
    public String toString(){
        
        String ketquaBill = "items:\n";
        for(Item i: receipt){
            ketquaBill += String.format("   "+i.toString());
        }
        ketquaBill += String.format("total: $%.2f\n", this.total);
        ketquaBill += String.format("Clerk: %s\n", getClerk().getName());

        return ketquaBill;
    }

    public ArrayList<Item> getReceipt() {
        return receipt;
    }
}

class DiscountBill extends GroceryBill{
    private double discountAmount = 0;
    
    public void add(Item i){
       this.receipt.add(i);
       this.total = this.total + i.getPrice();
       this.discountAmount = this.discountAmount + i.getDiscount();
    }

    public DiscountBill(Employee clerk) {
        super(clerk);
    }
    
    public String toString(){
        
        String ketquaBill = "items:\n";
        for(Item i: getReceipt()){
            ketquaBill += String.format("   "+i.toString());
        }
        ketquaBill += String.format("sub-total: $%.2f\n", getTotal());
        ketquaBill += String.format("discount: $%.2f\n", this.discountAmount);
        ketquaBill += String.format("total: $%.2f\n", getTotal()-this.discountAmount);
        ketquaBill += String.format("Clerk: %s\n", getClerk().getName());

        return ketquaBill;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Grocery Bill");
        GroceryBill grocerybill = new GroceryBill(employee1) {
        };
        grocerybill.add(new Item("item 1", 2.3, 0));
        grocerybill.add(new Item("item 2", 3.45, 0));

        System.out.println(grocerybill.toString());
        
        Employee employee2 = new Employee("Discount Bill");
        DiscountBill discountbill = new DiscountBill(employee2);
        discountbill.add(new Item("item 3", 20, 15));
        discountbill.add(new Item("item 4", 40, 35));
        discountbill.add(new Item("item 5", 50, 35));
        
        System.out.println(discountbill.toString());
    }
}
