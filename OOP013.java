
import java.util.Scanner;

class Book{
    private String bookID;
    private String title;
    private String author;

    public Book(String bookID, String title, String author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    void display(){
        System.out.printf("Sách: %s (Mã: %s) - %s\n",this.title,this.bookId,this.author);
    }
}

class Borrow{
    private String borrowID;
    private Book book;
    private String borrower;
    private int days;

    public Borrow(String borrowID, Book book, String borrower, int days){
        this.borrowID = borrowID;
        this.book = book;
        this.borrower = borrower;
        this.days = days;
    }
    
    int calculateFee(){
        return this.days * 5000;
    }

    void display(){
        System.out.println("--- Phiếu mượn sách ---");
        System.out.printf("Mã phiếu: %s\n",this.borrowID);
        System.out.printf("Người mượn: %s\n",this.borrower);
        this.book.display();
        System.out.printf("Số ngày mượn: %d\n",this.days);
        System.out.printf("Phí mượn: %.1f",(double)this.calculateFee());
    }
}

public class OOP013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookID = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        String borrowID = sc.nextLine();
        String borrower = sc.nextLine();
        int days = sc.nextInt();
        Book myBook = new Book(bookID, title, author);
        Borrow myBorrow = new Borrow(borrowID, myBook, borrower, days);
        myBorrow.display();
        sc.close();
    }
}
