import java.util.Scanner;

class NotJavaFileException extends Exception {
    NotJavaFileException(String s) {
        super(s);
    }
}

public class EXCEPTION002 {
    public static int CheckFileExtension(String fileName) throws NotJavaFileException{
            if(fileName == null || fileName.trim().isEmpty()){
                throw new NotJavaFileException("-1");
            } else if (fileName.length() <= 5) {
                return 0;
            } else {
                String sub = fileName.substring(fileName.length() - 5, fileName.length());
                if (sub.equals(".java")) {
                    return 1;
                }
            }
            return 0;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String fileName = sc.nextLine();
            try {
                int diem = CheckFileExtension(fileName);
                System.out.println(diem);
            
            } catch (Exception e) {
                System.out.println("Not java file exception.Mark is -1");
            }
        }
    }
}
