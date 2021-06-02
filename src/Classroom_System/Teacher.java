package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Teacher extends SchoolMember {
  //instance variables
  private double salary;

  //constructor method
  public Teacher(String fName, String lName, int age, double salary) {
    super(fName, lName, age);

    this.salary = salary;
  }

  //gets salary
  public double getSalary() {
    return salary;
  }
}