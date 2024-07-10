/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {

		// Create student, freshmen and senior objects
		Student student = new Student("James", 20);
		Freshmen freshmenStudent = new Freshmen("James", 20, 12); // name, age, credits
		Senior seniorStudent = new Senior("John", 30, 90);

		// Set the gpa of the student using the scanner and user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter GPA for student:");

		// Get user input
		double gpa = scanner.nextDouble();
		// Set gpa
		student.setGPA((int) gpa);

		// Print student info
		System.out.println(student.toString());
		// Print freshmen info
		System.out.println(freshmenStudent.toString());
		// Print senior info
		System.out.println(seniorStudent.toString());
	}

}

