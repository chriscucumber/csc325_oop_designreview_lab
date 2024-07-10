package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    // Tracks seniors credits
    public int credits;

    // Creates Senior object with name, age and credits
    public Senior(String name, int age, int _credits) {
        super(name, age);
        // Throw error and prevent a freshmen obj from being created if less than 85 credits
        if (_credits < 85) {
            throw new Error("Must have minimum of 85 credits");
        }
        credits = _credits;
    }

    // Gets Seniors credits
    public int getCredits() {
        return credits;
    }

    // Sets Seniors credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Prints some info about the Senior
    @Override
    public String toString() {
        return "Senior named " + getName() + " is aged " + getAge() + " with " + credits + " credits";
    }
}
