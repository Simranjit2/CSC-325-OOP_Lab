package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human
public class Student extends Human {

    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
    private int gpa;

    /**
     * default constructor-
     */
    public Student() {
        super();
        this.gpa = 0;
    }

    /**
     * parameterized constructor-
     *
     * @param name
     * @param age
     */
//    public Student(String name, short age) {
//        super(name, age);
//    }

    /**
     * getter-
     *
     * @return return GPA
     */
    public int getGpa() {
        return gpa;
    }

    /**
     * setter -
     *
     * @param gpa
     */
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "GPA: " + gpa;
    }
}
