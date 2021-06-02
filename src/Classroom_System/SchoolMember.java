package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class SchoolMember {
  //abstract class instance variables
  private String firstName;
  private String lastName;
  private int age;

  //abstract class constructor method
  public SchoolMember(String fName, String lName, int age) {
    this.firstName = fName;
    this.lastName = lName;
    this.age = age;
  }

  //gets first name
  public String getFirstName() {
    return firstName;
  }

  //gets last name
  public String getLastName() {
    return lastName;
  }

  //gets full name
  public String getFullName() {
    return firstName + " " + lastName;
  }

  //gets age
  public int getAge() {
    return age;
  }
}