import java.util.Scanner;

public class STRING005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(findLongestWord(str));
        }
    }

    public static String findLongestWord(String sentence){
        String[] words = sentence.split(" ");
        String LongestWord = words[0];
        for(String word : words){
            if(word.length() >= LongestWord.length()) LongestWord = word;
        }
        return LongestWord;
    }
}
