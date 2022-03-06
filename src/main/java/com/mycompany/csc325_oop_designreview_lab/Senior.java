/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * <p>
 * Title: Lab #5 - Senior</p>
 *
 * <p>
 * Description: Senior Class - a subclass of Student; </p>
 *
 * @author Simranjit
 */
// Todo 7:[DONE] Create two classes for Freshman and Senior 
public class Senior extends Student {

    /**
     * parameterized constructor -- stores user-specified values in all
     * variables
     *
     * @param name - name
     * @param age - age
     * @param credits - credits
     */
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
    }

    // ToDo 10: [DONE] Add a toString method for Senior class
    /**
     * toString method -- creates a String representing the display the current
     * state
     *
     * @return a string
     */
    @Override
    public String toString() {
        if (this.getCredits() <= 85) {
            return super.toString() + " Credits: " + this.getCredits();
        } else {
            return super.toString() + " Credits: Minimum credits should be 85!!";
        }
    }
}
