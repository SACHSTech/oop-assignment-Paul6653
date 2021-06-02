package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Classroom {
  //instance variables
  private Teacher teacher;
  private ArrayList<Student> students;

  //constructor method
  public Classroom(Teacher teacher) {
    this.teacher = teacher;

    students = new ArrayList<Student>();
  }

  //add a student
  public void addStudent(Student newStudent) {
    students.add(newStudent);
  }

  //update student grade
  public void updateStudentGrade(String fullName, double newGrade) {
    for (int i = 0; i < students.size(); i++) {
      if (fullName.equalsIgnoreCase(students.get(i).getFullName())) {
        students.get(i).setClassGrade(newGrade);
      }
    }
  }

  //print a list of student marks
  public void printList() {
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getFullName()+ ": " +students.get(i).getClassGrade()+ "%");
    }
  }

  //gets the teacher of the classroom
  public Teacher getTeacher() {
    return teacher;
  }

  //sets the teacher of the classroom
  public void setTeacher(Teacher newTeacher) {
    this.teacher = newTeacher;
  }

  //gets # of students in classroom
  public int getSize() {
    return students.size();
  }

  //gets class average
  public double getAverage() {
    double theAverage = 0.0;

    for (int i = 0; i < students.size(); i++) {
      theAverage += students.get(i).getClassGrade();
    }

    if (students.size() != 0) {
      theAverage = theAverage/students.size();
    }

    return theAverage;
  }

  //prints information of a person in class
  public void personalInformation(String fullName) {
    if (fullName.equalsIgnoreCase(teacher.getFullName())) {
      System.out.println("Age: " +teacher.getAge());
      System.out.println("Salary: " +teacher.getSalary());
    }
    for (int i = 0; i < students.size(); i++) {
      if (fullName.equalsIgnoreCase(students.get(i).getFullName())) {
        System.out.println("Age: " +students.get(i).getAge()); 
        System.out.println("Grade: " +students.get(i).getGradeYear());
      }
    }
  }
}
