import java.util.Scanner;

abstract class Teacher{
    private String name;
    private double baseSalary;

    public Teacher(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    abstract String getInfo();
    abstract double calculateSalary();
}

class PermanentLecturer extends Teacher{
    private double researchAllowance;

    public PermanentLecturer(double researchAllowance, double baseSalary, String name) {
        super(baseSalary, name);
        this.researchAllowance = researchAllowance;
    }

    String getInfo(){
        return String.format("Loại giảng viên: Permanent\nHọ tên: %s\nLương thực nhận: %.1f", this.getName(), calculateSalary());
    }

    double calculateSalary(){
        return getBaseSalary() + this.researchAllowance;
    }
}

class VisitingLecturer extends Teacher{
    private int teachingHours;
    private double paymentPerHour;

    public VisitingLecturer(double paymentPerHour, int teachingHours, double baseSalary, String name) {
        super(baseSalary, name);
        this.paymentPerHour = paymentPerHour;
        this.teachingHours = teachingHours;
    }

    String getInfo(){
        return String.format("Loại giảng viên: Visiting\nHọ tên: %s\nLương thực nhận: %.1f", this.getName(), calculateSalary());
    }

    double calculateSalary(){
        return (this.teachingHours * 1.0) * this.paymentPerHour;
    }
}

public class INHERITANCE013 {
    public static void main(String[] args) {
        String ketqua = "";
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 2; i++){
            String type = sc.nextLine();
            if(type.contains("PermanentLecturer")){
                String name = sc.nextLine();
                double baseSalary = sc.nextDouble();
                double researchAllowance = sc.nextDouble();
                sc.nextLine();
                PermanentLecturer teacher = new PermanentLecturer(researchAllowance, baseSalary, name);
                ketqua += teacher.getInfo();
            } else if(type.contains("VisitingLecturer")){
                String name = sc.nextLine();
                int teachingHours = sc.nextInt();
                double paymentPerHour = sc.nextDouble();
                sc.nextLine();
                VisitingLecturer teacher = new VisitingLecturer(paymentPerHour, teachingHours, paymentPerHour, name);
                ketqua += teacher.getInfo();
            }
            if(i == 1) ketqua += "\n";
        }
        System.out.println("--- Thông tin giảng viên ---");
        System.out.print(ketqua);
    }
}
