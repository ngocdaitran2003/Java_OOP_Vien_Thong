import java.util.Scanner;

public class STRING006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.print("My initials are: ");
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
