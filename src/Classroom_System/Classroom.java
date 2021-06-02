package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Classroom {
  private Teacher theTeacher;
  private ArrayList<Student> students;

  public Classroom(Teacher teacher) {
    this.theTeacher = teacher;

    students = new ArrayList<Student>();
  }

  public void addStudent(Student newStudent) {
    students.add(newStudent);
  }

  public void setTeacher(Teacher newTeacher) {
    this.theTeacher = newTeacher;
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
