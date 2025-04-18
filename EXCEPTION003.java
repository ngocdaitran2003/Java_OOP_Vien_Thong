import java.util.ArrayList;
import java.util.Scanner;

class UsedCarException extends Exception{

    public UsedCarException(String s) {
        System.out.println("Invalid UsedCar: VIN " + s);
    }
    
}

class UsedCar{
    private String VIN;
    private String make;
    private int year;
    private int mileage;
    private double price;


    public UsedCar(String VIN, String make, int year, int mileage, double price) throws UsedCarException{
        if(VIN.length() == 4 && ((make.equals("Ford")) || (make.equals("Honda")) || (make.equals("Toyota")) || (make.equals("Chrysler"))) && (year > 1990 && year < 2014) && mileage > 0 && price > 0.0){
            this.VIN = VIN;
            this.make = make;
            this.year = year;
            this.mileage = mileage;
            this.price = price;
        } else {
            throw new UsedCarException(VIN);
        }
    }

    public void printInfo(){
        System.out.printf("UsedCar{vin='%s', make='%s', year=%d, mileage=%d, price=%.1f}\n",this.VIN, this.make, this.year, this.mileage, this.price);
    }
}

public class EXCEPTION003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<UsedCar> listUsedCar = new ArrayList<UsedCar>();
        
        while(n-- > 0){
            String usedCar = sc.next();
            String[] usedCarInfo = usedCar.split(",");
            try {
                UsedCar usedcar = new UsedCar(usedCarInfo[0], usedCarInfo[1], Integer.parseInt(usedCarInfo[2]), Integer.parseInt(usedCarInfo[3]), Float.parseFloat(usedCarInfo[4]));
                listUsedCar.add(usedcar);
            } catch (Exception e) {
                // System.out.println(e);
            }
        }

        System.out.println("List of successfully constructed UsedCar objects:");
        if(listUsedCar.isEmpty()){
            System.out.println("No used cars");
        } else {
            for(UsedCar usedcar : listUsedCar){
                usedcar.printInfo();
            }
        }
        


    }
}
