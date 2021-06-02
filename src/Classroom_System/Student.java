package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Student extends SchoolMember {
  private int gradeYear;
  private double classGrade;

  public Student(String fName, String lName, int age, int gradeYear, double classGrade) {
    super(fName, lName, age);

    this.gradeYear = gradeYear;
    this.classGrade = classGrade;
  }

  public double getClassGrade() {
    return classGrade;
  }

  public void setClassGrade(double classGrade) {
    this.classGrade = classGrade;
  }
}