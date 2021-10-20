package com.terence;
import java.lang.*;

public class Student implements Comparable {
    String firstName;
    String lastName;
    static int registration=0;
    int grade;
    int year;
    int id;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = 1;
        this.grade = 0;
        this.id = ++registration;

    }

    public Student(String firstName, String lastName, int grade, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.id = ++registration;
    }

    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = 1;
        this.grade = grade;
        this.id = ++registration;

    }

    public String printFullName(){
     return lastName + firstName;
    }

    public boolean isApproved(){
        //TODO implement: should return true if grade >= 60
        return grade >= 60;
    }

    public int changeYearIfApproved(){
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        if(isApproved()) {
            year += 1;
            System.out.println("Congratulations");
        }
        return 0;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Object compareStu) {
        int compareGrade=((Student)compareStu).getGrade();
        /* For Ascending order*/
        return compareGrade-this.grade;
    }

}
