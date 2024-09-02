package com.mycompany.studentlst;

import java.util.Scanner;

public class StudentLst {

    public static void main(String[] args) {
        // Array to store Student objects
        Student[] students = new Student[2];
        Scanner inScanner = new Scanner(System.in);

        // Loop to get student names and create Student objects
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();

            // Create a new Student object with the entered name
            students[i] = new Student(name);
        }

        // Print the students' names
        System.out.println(printOutput(students));
    }

    // Method to generate a string with all students' names
    public static String printOutput(Student[] students) {
        StringBuilder str = new StringBuilder();

        // Loop through each student and append their name to the string
        for (Student student : students) {
            str.append("Student Name: ").append(student.getName()).append("\n");
        }

        return str.toString();
    }
}

