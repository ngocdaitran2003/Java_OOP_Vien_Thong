import java.util.Scanner;

public class STRING001 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       for(int i = 0; i < n; i++){
            String s1 = sc.next();
            int k = sc.nextInt();
            
            System.out.println("The character at position " + k + " is " + s1.charAt(k));
        }
    }
}