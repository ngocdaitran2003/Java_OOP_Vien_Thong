import java.util.Scanner;

public class BASIC001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        
        sc.close();
    }
}
