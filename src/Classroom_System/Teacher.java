package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Teacher extends SchoolMember {
  private double salary;

  public Teacher(String fName, String lName, int age, double salary) {
    super(fName, lName, age);

    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }
}