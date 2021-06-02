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
}
