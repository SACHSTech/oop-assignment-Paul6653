package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException{
    //Initialize teacher and classroom
    Teacher teacher1 = new Teacher("Dave", "Krtzy", 30, 50000.00);
    Classroom classroom = new Classroom(teacher1);

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Main Menu
    while (true) {
      //Basic Classroom Information
      System.out.println("Classroom Teacher: " +classroom.getTeacher().getFullName());
      System.out.println("# of Students: " +classroom.getSize());
      System.out.println("Class Average: " +classroom.getAverage()+ "%");

      //Classroom Modification Options
      System.out.println();
      System.out.println("Choose an option:");
      System.out.println("1 - Add a new student");
      System.out.println("2 - Update a student's grade");
      System.out.println("3 - Replace teacher");
      System.out.println("4 - Print a list of student marks");
      System.out.println("5 - See Personal Information");
      System.out.println("6 - Quit");
      
      String choice = key.readLine();

      System.out.println();

      //According to option picked, modify and/or list classroom information
      if (choice.equals("1")) {

        System.out.print("Enter the student's first name: ");
        String fName = key.readLine();

        System.out.print("Enter the student's last name: ");
        String lName = key.readLine();

        System.out.print("Enter the student's age: ");
        int age = Integer.parseInt(key.readLine());

        System.out.print("Enter the student's grade year: ");
        int gradeYear = Integer.parseInt(key.readLine());

        System.out.print("Enter the student's course mark: ");
        double courseMark = Double.parseDouble(key.readLine());

        classroom.addStudent(new Student(fName, lName, age, gradeYear, courseMark));

        System.out.println();
        System.out.println("Added " +fName+ " " +lName+ " to the classroom.");

      } else if (choice.equals("2")) {

        System.out.print("Enter the full name of the student whose grade is being updated: ");
        String fullName = key.readLine();

        System.out.print("Enter the updated grade: ");
        double grade = Double.parseDouble(key.readLine());

        classroom.updateStudentGrade(fullName, grade);
        
        System.out.println();
        System.out.println(fullName+ "'s grade is now " +grade+ "%");

      } else if (choice.equals("3")) {

        System.out.print("Enter the new teacher's first name: ");
        String fName = key.readLine();

        System.out.print("Enter the new teacher's last name: ");
        String lName = key.readLine();

        System.out.print("Enter the new teacher's age: ");
        int age = Integer.parseInt(key.readLine());

        System.out.print("Enter the new teacher's salary: ");
        double salary = Double.parseDouble(key.readLine());

        classroom.setTeacher(new Teacher(fName, lName, age, salary));
        
      } else if (choice.equals("4")) {

        System.out.println("List of Student Marks:");
        classroom.printList();

      } else if (choice.equals("5")) {

        System.out.print("Enter the full name of the person whose personal information should be printed: ");
        String fullName = key.readLine();

        classroom.personalInformation(fullName);

      } else {
        System.exit(0);
      }

      System.out.println();
      System.out.println();
    }
  }
}