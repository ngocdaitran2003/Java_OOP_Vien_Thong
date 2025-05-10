
import java.util.Scanner;

public class BASIC022 {
    public static boolean KiemTraSNT(int n){
        if(n<=1) return false;
        if(n==2||n==3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
        if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.printf("Primes in the range 2 to %d:", n);
        for(int i = 2; i <= n; i++){
            if(KiemTraSNT(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.printf("Total number of primes in the range: %d\n", count);
        if(KiemTraSNT(count)){
            System.out.printf("The prime count %d is a prime number.", count);
        } else {
            System.out.printf("The prime count %d is not a prime number.", count);
        }

    }
}
