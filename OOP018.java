import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Employee{
    private String name;
    private double salary;
    private String department;
    private String email;
    private int age;

    public Employee(String name, double salary, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public String toString(){
        return this.name + " " + String.format("%.2f",this.salary) + " " + this.email + " " + this.age;
    }

}

public class OOP018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Employee> list_employee = new ArrayList<Employee>();
        while(n-- > 0){
            String info = sc.nextLine();
            String[] arr_info = info.split(" ");

            String name = arr_info[0];
            double salary = Double.parseDouble(arr_info[1]);
            String department = arr_info[2];
            String email;
            int age;

            switch (arr_info.length) {
                case 3:{
                    Employee employee = new Employee(name, salary, department, "n/a", -1);
                    list_employee.add(employee);
                    break;
                }
                case 4:
                    boolean check = true;
                    for(int i = 0; i < arr_info[3].length(); i++){
                        if(arr_info[3].charAt(i) >= '0' && arr_info[3].charAt(i) <= '9'){
                            check = true;
                        } else {
                            check = false;
                            break;
                        }
                    }

                    if(check == false){
                        email = arr_info[3];
                        Employee employee = new Employee(name, salary, department, email, -1);
                        list_employee.add(employee);
                    }
                    else{
                        age = Integer.parseInt(arr_info[3]);
                        Employee employee = new Employee(name, salary, department, "n/a", age);
                        list_employee.add(employee);
                    }
                    break;
                case 5:
                    email = arr_info[3];
                    age = Integer.parseInt(arr_info[4]);
                    Employee employee = new Employee(name, salary, department, email, age);
                    list_employee.add(employee);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        // Map để lưu tổng lương và số lượng nhân viên theo department
        HashMap<String, Double> totalSalary = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, List<Employee>> empByDept = new HashMap<>();

        // Duyệt danh sách và cập nhật map
        for (Employee e : list_employee) {
            String dept = e.getDepartment();
            double sal = e.getSalary();

            totalSalary.put(dept, totalSalary.getOrDefault(dept, 0.0) + sal);
            count.put(dept, count.getOrDefault(dept, 0) + 1);

            if (!empByDept.containsKey(dept)) {
                empByDept.put(dept, new ArrayList<>());
            }
            empByDept.get(dept).add(e);
        }

        // Tìm phòng có lương TB cao nhất
        String bestDept = "";
        double maxAvg = -1.0;
        for (String dept : totalSalary.keySet()) {
            double avg = totalSalary.get(dept) / count.get(dept);
            if (avg > maxAvg) {
                maxAvg = avg;
                bestDept = dept;
            }
        }

        System.out.println("Highest Average Salary: " + bestDept);
        for (Employee e : empByDept.get(bestDept)) {
            System.out.println(e.toString());
        }
    }
}


// kutx 344.49 Nowhere 41
// jghp 499.97 BeerDrinking HoEF3WQPDo@gmail.com
// tbtr 375.27 Marketing
// koa 80.29 BeerDrinking R5WhHr6@gmail.com 22
// wsuv 24.30 Marketing kTlzOchX@gmail.com