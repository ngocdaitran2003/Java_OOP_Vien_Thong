package com.mycompany.main;

/**
 *
 * @author 503
 */

import java.util.ArrayList;

class Item{
    private String name;
    private int weight;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    public Item(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

abstract class Box{
    public abstract void add(Item item);
    public abstract boolean IsInBox(Item item);
}

class BoxWithMaxWeight extends Box{
    private ArrayList<Item> ListItemInBox = new ArrayList<Item>();
    private int maxWeight;
    private int currentWeight = 0;
    public BoxWithMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void add(Item item){
        this.currentWeight += item.getWeight();
        if(this.currentWeight <= this.maxWeight){
            this.ListItemInBox.add(item);
        }
    }
    
    public boolean IsInBox(Item item){
        for(Item currentItem : this.ListItemInBox){
            if(currentItem.getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
}


public class Main {
    public static void main(String[] args) {
        BoxWithMaxWeight MyBox = new BoxWithMaxWeight(10);
        MyBox.add(new Item("Saludo", 5));
        MyBox.add(new Item("Pirkka", 5));
        MyBox.add(new Item("Kopi Luwak", 5));

        System.out.println(MyBox.IsInBox(new Item("Saludo", 5)));
        System.out.println(MyBox.IsInBox(new Item("Pirkka", 5)));
        System.out.println(MyBox.IsInBox(new Item("Kopi Luwak", 5)));

    }
}
