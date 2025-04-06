import java.util.Scanner;

public class STRING009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            stringSplosion(str);
        }
    }

    public static void stringSplosion(String str){
        // String final_string;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j <= i; j++) System.out.print(str.charAt(j));
        }
        System.out.println();
    }
}
