import java.util.Scanner;

class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString(){
        //return "Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]";
        return "Author[name=" + this.name + "," + " " + "email=" + this.email + "," + " " + "gender=" + this.gender + "]";
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    
    public int getQty(){
        return this.qty;
    }

    public int setQty(int qty) {
        if (qty >= 0) {
            this.qty = qty;
            return qty;
        } else {
            return -1;
        }
    }
    public String toString(){
        //return "Book[name=" + this.name +", " + author.toString() + ",  price=" + this.price + ", qty=" + this.qty + "]";
        return "Book[name=" + this.name + "," + " " + author.toString() + "," + " "  + "price=" + this.price + ","+ " "  +  "qty=" + this.qty + "]";
    } 
}

public class OOP012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String check = sc.nextLine();

            String name_book = sc.nextLine();
            Double price = sc.nextDouble();
            int qty = sc.nextInt();
            sc.nextLine();
            check = sc.nextLine();
            
            String name_author = sc.nextLine();
            String email = sc.nextLine();
            char gender = sc.nextLine().charAt(0);
            check = sc.nextLine();

            Author author = new Author(name_author, email, gender);
            Book myBook = new Book(name_book, author, price, qty);
            System.out.println(myBook);

        }
    }
}


