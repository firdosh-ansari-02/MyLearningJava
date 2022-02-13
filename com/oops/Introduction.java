package com.oops;

public class Introduction {
    public static void main(String[] args) {

        Student firdosh = new Student();
        //System.out.println(firdosh.marks);
        Student rahul = new Student(112,"rahul",93.5f);
        System.out.println(rahul.name);
    }
}

class Student{
    int roll;
    String name;
    float marks;

    Student(){
        this.roll = 111;
        this.name = "Firdosh Ansari";
        this.marks = 96.8f;
    }
    Student(int roll, String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
