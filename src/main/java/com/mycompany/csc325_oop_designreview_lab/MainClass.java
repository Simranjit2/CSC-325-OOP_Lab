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
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of Student class
        // Todo 7:[DONE] Create two classes for Freshman and Senior 
        // ToDo 8:[DONE] The senior class should have a minimum of 85 credits  
        // ToDo 9:[DONE] Add a toString method for Freshman class
        // ToDo 10:[DONE} Add a toString method for Senior class
        
        Student s = new Student();
        Freshman std1 = new Freshman();
        Senior std2 = new Senior();
        s.setName("James");
        s.setAge((short)20);
        std2.setCredits(12);
        
        Freshman std1 = new Student("James", 20, 12); // name, age, credits

        

        System.out.println(std1);

        System.out.println(std2);

        // ToDo 11: [DONE] Set the gpa of the student using the scanner and user input and then print the output.
        String s = "James";
        short d = 20;

        Student student = new Student(s, d);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student GPA: ");
        int gpa = scan.nextInt();
        student.setGpa(gpa);
        System.out.println("User Entered: " + gpa);

        // ToDo 12:[DONE] add comments and explain your code
        // ToDo 13: submit using a pull request.
    }

}
