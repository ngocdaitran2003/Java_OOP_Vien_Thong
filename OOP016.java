// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface Callable{
    String call();
}

interface Browsable{
    String browse();
}

class Smartphone implements Callable,Browsable{
    private List<String> number;
    private List<String> urls;

    public Smartphone(List<String> number, List<String> urls){
        this.number = number;
        this.urls = urls;
    }

    public String call(){
        String ketqua = "";
        for(String num : this.number){
            boolean check = true;
            for (int idx = 0; idx < num.length(); idx++) {
                if(num.charAt(idx) >= '0' && num.charAt(idx) <= '9'){
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true)  ketqua += "Calling... " + num + "\n";
            else ketqua += "Invalid number!\n";
        }
        return ketqua;
    }

    public String browse(){
        String ketqua = "";
        for(String url : this.urls){
            boolean check = true;
            for(int idx = 0; idx < url.length(); idx++){
                if(url.charAt(idx) >= '0' && url.charAt(idx) <= '9'){
                    check = false;
                    break;
                }
            }

            if(check == true) ketqua += "Browsing: " + url +"!\n";
            else ketqua += "Invalid URL!\n";
        }
        return ketqua;
    }
}

public class OOP016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String dong1 = sc.nextLine();
            String[] x = dong1.split(" ");
            ArrayList<String> number =  new ArrayList<String>(Arrays.asList(x));

            String dong2 = sc.nextLine();
            String[] y = dong2.split(" ");
            ArrayList<String> url = new ArrayList<String>(Arrays.asList(y));
            
            Smartphone smartphone = new Smartphone(number,url);
            System.out.print(smartphone.call());
            System.out.print(smartphone.browse());
        }
    }
}
