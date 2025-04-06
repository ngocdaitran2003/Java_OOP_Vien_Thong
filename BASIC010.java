import java.util.Scanner;

public class BASIC010 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       for(int i = 0; i < n; i++){
            String so = sc.next();
           
            int[] array = new int[so.length()];
            for(int j = 0; j < so.length(); j++){
                array[j] = so.charAt(j)-'0';
            }
            if(so.length() % 2 != 0){
                for(int j = 1; j < so.length(); j+=2){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            else{
                for(int j = 0; j < so.length(); j+=2){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            for(int j = 0; j < so.length(); j++){
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }
}
// basic010