import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class COLLECTION006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
            String str = sc.nextLine();
            String[] list_str = str.split(" ");
            for(int i = 0; i < list_str.length; i+=2){
                int value =  Integer.parseInt(list_str[i+1]);
                freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
            }

            // Tìm giá trị xuất hiện ít nhất
            int minFrequency = Collections.min(freqMap.values());
            int minValue = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() == minFrequency) {
                    minValue = Math.min(minValue, entry.getKey());
                }
            }

            // In kết quả
            System.out.println(minValue);
        }
        sc.close();
    }
}
