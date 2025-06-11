
import java.util.Scanner;


abstract class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    abstract String getInfo();

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(double bonus, String name, double salary) {
        super(name, salary);
        this.bonus = bonus;
    }

    String getInfo(){
        return String.format("Loại: FullTime\nHọ tên: %s\nLương cơ bản: %.1f\nThưởng: %.1f\n=> Lương thực nhận: %.1f", this.getName(), this.getSalary(), this.bonus, calculateSalary());
    }

    double calculateSalary(){
        return getSalary() + this.bonus;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(double hourlyRate, int hoursWorked, String name, double salary) {
        super(name, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    String getInfo(){
        return String.format("Loại: PartTime\nHọ tên: %s\nSố giờ làm việc: %d giờ\nTiền công mỗi giờ: %.1f\n=> Lương thực nhận: %.1f", this.getName(), this.hoursWorked, this.hourlyRate, calculateSalary());
    }

    double calculateSalary(){
        return (this.hoursWorked * 1.0) * this.hourlyRate;
    }
}

public class INHERITANCE012 {
    public static void main(String[] args) {
        String ketqua = "";
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 2; i++){
            String type = sc.nextLine();
            if(type.contains("FullTime")){
                String name = sc.nextLine();
                double salary = sc.nextDouble();
                double bonus = sc.nextDouble();
                sc.nextLine();
                FullTimeEmployee employee = new FullTimeEmployee(bonus, name, salary);
                ketqua += employee.getInfo();
            } else if(type.contains("PartTime")){
                String name = sc.nextLine();
                int hoursWorked = sc.nextInt();
                double hourlyRate = sc.nextDouble();
                sc.nextLine();
                PartTimeEmployee employee = new PartTimeEmployee(hourlyRate, hoursWorked, name, hourlyRate);
                ketqua += employee.getInfo();
            }
            if(i == 1) ketqua += "\n\n";
        }
        System.out.println("--- Thông tin nhân viên ---");
        System.out.print(ketqua);
    }
}
