package com.terence;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //6. Verify implementation works
	    Course javaCourse = new Course("java","Dr Teo",1);
        javaCourse.enroll(new Student("foo","bar",70));
        javaCourse.enroll(new Student("Dan","Lim",80));
        javaCourse.enroll(new Student("Bob","Tan",50));
        javaCourse.enroll(new Student("Candy","Chan",75));
        javaCourse.enroll(new Student("Mike","Wong",90));
        javaCourse.enroll(new Student("Lily","Su",85));

        // 7. Method overload
        Student[] listOfStudents = new Student[3];
        listOfStudents[0] = new Student("ss","yeo",10);
        listOfStudents[1] = new Student("hs","cai",15);
        listOfStudents[2] = new Student("eh","ng",20);
        javaCourse.enroll(listOfStudents);

        // Total Students
        System.out.println("Total Students is: " + javaCourse.countStudents());

        // Average Grade
        System.out.println("Average grade is: " + javaCourse.getAvgGrade());

        // Print Ranking and Whether above Avg
        //Student bestStudent = javaCourse.bestGrade();
        javaCourse.printRanking();

        System.out.println("Test");
    }
}
