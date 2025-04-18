import java.util.Scanner;

class FileNameFormatExeption extends Exception{
    // Định nghĩa ngoại lệ mới
    public FileNameFormatExeption(String s){
        super(s);
    }
}

class Test {
    public static void open_file(String s){
        try {
            // Gọi phương thức f() ném ngoại lệ
            f(s);
        } catch (FileNameFormatExeption fname) {
            System.out.println(fname.getMessage());
        } catch (Exception e){
            System.out.println("Exception");
        }
    }

    public static void f(String s) throws FileNameFormatExeption{
        // Định nghĩa phương thức f()
        int ok = 0;
        if(s.contains(" ")){
            throw new FileNameFormatExeption("File name format");
        } else{
            System.err.println("File opened");
        }
    }
}

public class ELAB2310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test.open_file(s);
        sc.close();
    }
}