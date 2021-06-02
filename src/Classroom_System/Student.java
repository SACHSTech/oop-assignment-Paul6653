package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Student extends SchoolMember {
  //instance variables
  private int gradeYear;
  private double classGrade;

  //constructor method
  public Student(String fName, String lName, int age, int gradeYear, double classGrade) {
    super(fName, lName, age);

    this.gradeYear = gradeYear;
    this.classGrade = classGrade;
  }

  //gets grade level of student
  public int getGradeYear() {
    return gradeYear;
  }

  //gets course grade of student
  public double getClassGrade() {
    return classGrade;
  }

  //sets course grade of student
  public void setClassGrade(double classGrade) {
    this.classGrade = classGrade;
  }
}