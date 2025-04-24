
package com.mycompany.main;

/**
 *
 * @author 503
 */

abstract class Person{
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public String printPerson(){
        return String.format("%s - %s ",this.name, this.address);
    }
}

class Student extends Person{
    private int credits;
    private String studentID;

    public Student(String studentID, String name, String address) {
        super(name, address);
        this.studentID = studentID;
    }
    
    public void study(){
        this.credits = this.credits + 1;
    }

    public int getCredits() {
        return credits;
    }

    public String getStudentID() {
        return studentID;
    }
   
}


public class INHERITANCE003 {
    public static void main(String[] args) {
        Student student = new Student("90028", "Ollie", "6381 Hollywood Blvd. Los Angeles");
        System.out.println(student.printPerson());
        System.out.println(student.getStudentID());
        System.out.println("Study credits " + student.getCredits());
        student.study();
        System.out.println("Study credits " + student.getCredits());

    }
}
