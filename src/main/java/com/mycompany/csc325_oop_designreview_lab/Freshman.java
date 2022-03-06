/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * <p>
 * Title: Lab #5 - Freshman</p>
 *
 * <p>
 * Description: Freshman Class - a subclass of Student </p>
 *
 * @author Simranjit
 */
// Todo 7:[DONE] Create two classes for Freshman and Senior 
public class Freshman extends Student {

    /**
     * parameterized constructor -- stores user-specified values in all
     * variables
     *
     * @param name - name
     * @param age - age
     * @param credits - credits
     */
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    // ToDo 9: [DONE] Add a toString method for Freshman class
    /**
     * toString method -- creates a String representing the display the current
     * state
     *
     * @return a string
     */
    @Override
    public String toString() {
        return super.toString() + " Credits: " + this.getCredits();
    }
}
