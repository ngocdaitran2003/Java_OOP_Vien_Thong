package com.mycompany.main;

abstract class Person{
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return String.format("%s - %s",this.name, this.address);
    } 
}


class Student extends Person{
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study(){
        this.credits = this.credits + 1;
    }

    public int credits() {
        return credits;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student.toString());
        System.out.println("Study credits " + student.credits());
        student.study();
        System.out.println("Study credits " + student.credits());
    }
}
