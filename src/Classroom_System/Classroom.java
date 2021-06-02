package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Classroom {
  private Teacher teacher;
  private ArrayList<Student> students;

  public Classroom(Teacher teacher) {
    this.teacher = teacher;

    students = new ArrayList<Student>();
  }

  public void addStudent(Student newStudent) {
    students.add(newStudent);
  }

  public void updateStudentGrade(String fullName, double newGrade) {
    for (int i = 0; i < students.size(); i++) {
      if (fullName.equalsIgnoreCase(students.get(i).getFullName())) {
        students.get(i).setClassGrade(newGrade);
      }
    }
  }

  public void printList() {
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getFullName()+ ": " +students.get(i).getClassGrade()+ "%");
    }
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher newTeacher) {
    this.teacher = newTeacher;
  }

  public int getSize() {
    return students.size();
  }

  public double getAverage() {
    double theAverage = 0.0;

    for (int i = 0; i < students.size(); i++) {
      theAverage += students.get(i).getClassGrade();
    }

    theAverage = theAverage/students.size();
    return theAverage;
  }
}
