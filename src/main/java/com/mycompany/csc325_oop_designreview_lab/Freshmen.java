package com.mycompany.csc325_oop_designreview_lab;

public class Freshmen extends Student {
    // Track freshmens credits
    public int credits;

    // Creates a freshman obj with its name, age, and credits
    public Freshmen(String name, int age, int _credits) {
        super(name, age);
        credits = _credits;
    }

    // Gets Freshmens credits
    public int getCredits() {
        return credits;
    }

    // Sets freshmens credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Prints some info about the Freshmen
    @Override
    public String toString() {
        return "Freshman named " + getName() + " is age " + getAge() + " with " + credits + " credits";
    }

}
