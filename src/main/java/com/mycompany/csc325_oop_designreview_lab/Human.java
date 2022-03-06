package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {

    private String name;
    private String address;
    private short age;

    /**
     * default constructor - stores default values in all variables.
     */
    public Human() {
        name = "";
        address = "";
        age = 0;
    }

    // constructor that takes only two paras
    public Human(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    /**
     * toString- creates and returns a string.
     *
     * @return the state of the object
     */
    @Override
    public String toString() {
        return "Name: " + name + "  " + "Age: " + age;
    }

}
