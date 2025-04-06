import java.util.Scanner;

public class STRING003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int j = 0; j < n;j++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(s1.equalsIgnoreCase(s2));
        }
        
    }
}
