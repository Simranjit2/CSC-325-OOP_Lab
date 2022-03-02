/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author simra
 */
public class Senior extends Student {

    //credits
    private int credits;

    public Senior() {
        super();
        this.credits = 85;
    }

    /**
     *
     * @param name
     * @param age
     * @param credits
     */
//    public Senior(String name, short age, int credits) {
//        super(name, age);
//        this.credits = credits;
//    }

    public int getCredits() {
        return credits;
    }

    /**
     * toString-
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Credits: " + this.credits;
    }

}
