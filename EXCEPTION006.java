import java.util.Scanner;

class NotContainVowelException extends Exception{

    public NotContainVowelException() {
        System.out.println("String not contain vowels");
    }
    
}

public class EXCEPTION006 {
    public static void CheckVowel(String s) throws NotContainVowelException{
        if(s.contains("a") || s.contains("e")|| s.contains("i") || s.contains("o") || s.contains("u") ||
            s.contains("A") || s.contains("E") || s.contains("I") || s.contains("O") || s.contains("U")){
                System.out.println("String has vowels");
        }
        else{
            throw new NotContainVowelException();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String input = sc.nextLine();
            try {
                CheckVowel(input);
            } catch (Exception e) {
                
            }
        }
    }
}
