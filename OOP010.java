class Product{
    private String name;
    private String location;
    private int weight;

    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    public void PrintString(){
        System.out.println(this.name + " (" + this.weight + "kg) can be found from the " + this.location);
    }
}

public class OOP010 {
    public static void main(String[] args) {
        Product p1 = new Product("Tape measure");
        Product p2 = new Product("Plaster","home improvement section");
        Product p3 = new Product("Tyre",5);
        p1.PrintString();
        p2.PrintString();
        p3.PrintString();

    }
}
