package com.mycompany.csc325_oop_designreview_lab;

/**
 * @author MoaathAlrajab
 */
// We make this a child of Human by extending it here
public class Student extends Human {
    public int gpa;
    // We have to add a variable to track state of address in Student since address is abstract in Human
    public String address;

    public Student(String name, int age) {
        super(name, (short) age);
    }

    // Setter and getter for address
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String _address) {
        address = _address;
    }

    public int getGPA() {
        return gpa;
    }

    public void setGPA(int _gpa) {
        gpa = _gpa;
    }

    public String toString() {
        return "Student named " + getName() + " is aged " + getAge() + " with " + getGPA() + " GPA";
    }
}
