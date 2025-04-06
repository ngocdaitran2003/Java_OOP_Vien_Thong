import java.util.Scanner;

public class BASIC009 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 0; i < n; i++){
           int x = sc.nextInt();
           int y = sc.nextInt();
            if(x > 0 && y > 0) System.out.println("1");
            else if(x < 0 && y > 0) System.out.println("2");
            else if(x < 0 && y < 0) System.out.println("3");
            else if(x > 0 && y < 0) System.out.println("4");
            else System.out.println("0");
       }
    }
}
// basic 009