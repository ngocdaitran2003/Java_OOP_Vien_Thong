import java.util.Scanner;

public class STRING_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(isPangram(str));
        }
    }

    public static boolean isPangram(String sentence){
        int[] dem = new int[26];
        boolean kiemtra = true;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') dem[sentence.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(dem[i] == 0){
                kiemtra = false;
                break;
            }
        }
        return kiemtra;
    }
}
