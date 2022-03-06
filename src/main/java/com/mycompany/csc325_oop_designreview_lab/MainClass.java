/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5:[DONE] Fix the error

        //create a Freshman object using the parameterized constructor
        Student std = new Freshman("James", (short) 20, 12); // name, age, credits

        //create a Senior object using the parameterized constructor
        Student std2 = new Senior("John", (short) 30, 90);

        //calling toString
        System.out.println(std.toString());

        //calling toString
        System.out.println(std2.toString());

        // ToDo 11:[DONE} Set the gpa of the student using the scanner and user input and then print the output.
        // instantiate the student object
        Student student = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the gpa: ");
        int gpa = scan.nextInt();
        student.setGpa(gpa);
        student.setName("Joseph");
        student.setAge((short) 14);
        System.out.println("User Entered GPA: " + student.getGpa());
        System.out.println("Student: \n" + student.toString() + " GPA: " + student.getGpa());

        // ToDo 12: [DONE]add comments and explain your code
        // ToDo 13:[DONE] submit using a pull request.
    }

}
