import java.util.ArrayList;
import java.util.Scanner;

public class BASIC012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            if(str.trim().isEmpty()){
                System.out.println("0");
                continue;
            }

            String[] s1 = str.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();
            for(String x: s1){
                arr.add(Integer.parseInt(x));
            }

            int ans = 1, count = 1;
            for(int j = 0; j < arr.size() - 1; j++){
                if(arr.get(j) <= arr.get(j+1)){
                    count++;
                    ans = Math.max(ans, count);
                }
                else{
                    count = 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
