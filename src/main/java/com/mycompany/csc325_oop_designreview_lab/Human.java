package com.mycompany.csc325_oop_designreview_lab;

/**
 * @author MoaathAlrajab
 */
public abstract class Human {
    // Class variables to track some information about the Human
    private String name;
    private String address;
    private short age;

    // constructor that takes only two params `name` and `age`
    public Human(String name, short age) {
        this.name = name;
        this.age = age;
    }

    // Gets humans name
    public String getName() {
        return name;
    }

    // Set humans name
    public void setName(String name) {
        this.name = name;
    }

    // Gets humans address
    public abstract String getAddress();

    // Sets humans address
    public abstract void setAddress(String address);

    // Gets humans age
    public short getAge() {
        return age;
    }

    // Sets humans age
    public void setAge(short age) {
        this.age = age;
    }
}
