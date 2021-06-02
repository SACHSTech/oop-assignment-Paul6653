package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Teacher teacher1 = new Teacher("Eric", "Fabroa", 30, 50000.00);

    Student student1 = new Student("a", "b", 15, 10, 80.0);
    Student student2 = new Student("a", "b", 15, 10, 85.0);

    Classroom classroom1 = new Classroom(teacher1);

    classroom1.addStudent(student1);
    classroom1.addStudent(student2);
    System.out.println(classroom1.getSize());
    System.out.println(classroom1.getAverage());
  }
}