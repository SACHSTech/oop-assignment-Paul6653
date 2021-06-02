package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class SchoolMember {
  private String firstName;
  private String lastName;
  private int age;

  public SchoolMember(String fName, String lName, int age) {
    this.firstName = fName;
    this.lastName = lName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}