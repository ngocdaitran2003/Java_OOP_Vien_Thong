import java.util.Scanner;

public class BASIC005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < 5; j++){
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
