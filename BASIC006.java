import java.util.Scanner;

public class BASIC006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                // System.out.print(str.charAt(j));
                if(str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
