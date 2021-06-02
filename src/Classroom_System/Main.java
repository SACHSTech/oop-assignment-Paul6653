package Classroom_System;

import java.io.*;
import Classroom_System.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException{
    Teacher teacher1 = new Teacher("Eric", "Fabroa", 30, 50000.00);

    Student student1 = new Student("a", "b", 15, 10, 80);
    Student student2 = new Student("a", "c", 15, 10, 85);

    Classroom classroom = new Classroom(teacher1);

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    classroom.addStudent(student1);
    classroom.addStudent(student2);

    while (true) {
      System.out.println("Classroom Teacher: " +classroom.getTeacher().getFullName());
      System.out.println("# of Students: " +classroom.getSize());
      System.out.println("Class Average: " +classroom.getAverage()+ "%");

      System.out.println();
      System.out.println("Choose an option:");
      System.out.println("1 - Add a new student");
      System.out.println("2 - Update a student's grade");
      System.out.println("3 - Print a list of student marks");
      System.out.println("4 - Replace teacher");
      System.out.println("5 - Quit");
      
      String choice = key.readLine();

      System.out.println();

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

      } else if (choice.equals("3")) {
        
        System.out.println("List of Student Marks:")
        classroom.printList();
        
      } else if (choice.equals("4")) {
        
        System.out.print("Enter the new teacher's first name: ")
        String fName = key.readLine();

      } else {
        System.exit(0);
      }

      System.out.println();
      System.out.println();
    }
  }
}