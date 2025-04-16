import java.util.Scanner;
// import java.lang.Exception;

class Amount{
    private String currency;
    private int amount;

    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount amount){
        try {
            if(this.currency.compareTo(amount.currency) == 0){
                this.amount += amount.amount;
                System.out.println(this.amount);
            }else{
                throw new IllegalArgumentException("Currency doesn't match");
            }
        } catch (Exception e) {
            System.out.println("Currency doesn't match");
        }
    }

}
public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            Amount Amount1 = new Amount(sc.next(),sc.nextInt());
            Amount Amount2 = new Amount(sc.next(),sc.nextInt());
            Amount1.add(Amount2);
        }
        sc.close();
    }
}
