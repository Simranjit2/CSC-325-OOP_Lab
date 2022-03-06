package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: [DONE} Make this class a child of Human
public class Student extends Human {

    // ToDo 3:[DONE] Add a field for GPA and create setter and getter
    // ToDo 4: [DONE} Add comments to your code
    private int gpa;
    private int credits;

    /**
     * default constructor- initializing default value
     */
    public Student() {
        super();
        this.gpa = 0;
    }

    // ToDo 6:[DONE} Fix the constructor of Student class
    /**
     * parameterized constructor-
     *
     * @param name - name
     * @param age - age
     * @param gpa - gpa
     */
    public Student(String name, short age) {
        super(name, age);
        this.gpa = gpa;
    }

    /**
     * parameterized constructor - overload parameterized constructor with
     * differ parameters
     *
     * @param name - name
     * @param age - age
     * @param credits - credits
     */
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /**
     * getGpa method -- returns the value stored in the instance variable gpa
     *
     * @return the value stored in gpa
     */
    public int getGpa() {
        return gpa;
    }

    /**
     * getCredits method -- returns the value stored in the instance variable
     * credits
     *
     * @return the value stored in credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * setGpa method - it changes the value stored in the gpa instance variable
     *
     * @param gpa - the value to store in the instance variable gpa
     */
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    /**
     * toString method -- creates a String representing the display the current
     * state
     *
     * @return a string
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
