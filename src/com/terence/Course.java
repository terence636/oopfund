package com.terence;

import java.util.*;

public class Course {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    public Course (String courseName, String prof, int year) {
        this.courseName = courseName;
        this.professorName = prof;
        this.year = year;
        students = new ArrayList<Student>();
    }
    public void enroll(Student student){
        //TODO add the student to the collection
        students.add(student);
    }

    public void enroll(Student[] studentsList){
        //TODO add the student to the collection
        Collections.addAll(students,studentsList);

    }

    public void unEnroll(int studentId){
        //TODO remove this student from the collection
        // Hint: check if that really is this student
        for(Student student: students ) {
            if(student.id == studentId) {
                students.remove(student);
                break;
            }
        }
    }

    public int countStudents(){
        //TODO implement
        return students.size();
    }

    public Student bestGrade(){
        //TODO implement
        if(students.size() < 0)
            return null;
        Collections.sort(students);
        return students.get(0);
    }

    public int getAvgGrade() {
        int total=0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return total/countStudents();
    }
    
    public void printRanking() {
        if(students.size() < 0)
            return;
        Collections.sort(students);
        for(Student student: students) {
            String isAvg = student.getGrade() > getAvgGrade() ? "True" : "False";
            System.out.println("Student Name: " + student.printFullName() + "   Grade: " + student.getGrade() + "   AboveAvg: " + isAvg);
        }
    }

}
