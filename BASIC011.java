import java.util.Scanner;

public class BASIC011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] words = s.split(" ");
            if(words.length >= 2){
                int khoang_cach = Integer.MAX_VALUE;
                for(int j = 0; j < words.length - 1; j++){
                    int a = Integer.parseInt(words[j]);
                    int b = Integer.parseInt(words[j+1]);
                    if(b - a < khoang_cach) khoang_cach = b - a;
                }
                System.out.println(khoang_cach);
            }else System.out.println("0");
        }
    }
}
// basic011