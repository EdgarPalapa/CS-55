/*Written by Edgar Palapa and Anthony Rojas
CS55
Section 1226
Professor Dehkhoda
Project 3: Student Average Grade
*/
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.event.*;

import java.io.*;

import java.util.*;
//standard library imports
public class StudentAverageGrade {
	
	public static void main(String[] args) {	   //main method
		final long START = System.nanoTime();	   //Program start time
		Scanner numInput = new Scanner(System.in); //numInput will obtain user inputs for: # of students, # of tests, & test scores
		Scanner nameInput = new Scanner(System.in);//nameInput will obtain user inputs for name of students
		
		System.out.print("How many students? ");	//prompts user for number of students
		int numOfStudents = numInput.nextInt();		//gets number of students
		
		while(numOfStudents < 1){					//in case user inputs invalid number of students
			System.out.print("You must enter at least one student, try again.");	//error message
			numOfStudents = numInput.nextInt();		//allows user to try again
		}
		
		String studentName;							//data type for student names
		
		int numOfTests;								//data type for number of tests
		
		for (int i = 0; i < numOfStudents; i++){	/*based on the user input for number of students, this loop
		 											  will execute number of student times*/
			System.out.print("Student name? ");		//prompts user for student names
			studentName = nameInput.nextLine();		//gets student name
			
			System.out.print("How many tests? ");	//prompts user for number of tests
			numOfTests = numInput.nextInt();		//gets number of tests
			
			while(numOfTests < 1){					//in case user inputs invalid number of tests
				System.out.print("You must enter at least one test, try again.");	//error message
				numOfTests = numInput.nextInt();	//allows user to try again
			}
			
		int sumOfTestScores = 0;					//initialized and to be used to sum test scores based on number of tests
			
			for(int j = 0; j < numOfTests; j++){							/*based on number of students, this 
																			  loop will execute number of tests times*/
				System.out.println("Enter test score " + (j + 1) + ": ");	//prompts user for individual test scores
				int testScore = numInput.nextInt();							//gets individual test scores
				
				while(testScore > 100 || testScore < 0){					//in case user inputs invalid test score
					System.out.print("Test score must be between 0 and 100, try again.");	//error message
					testScore = numInput.nextInt();							//allows user to try again
				}
				sumOfTestScores += testScore;								//gets the sum of individual test scores
			}
			
			double avgScore = (double)(sumOfTestScores / numOfTests);		//gets average score and casts integer to double
			System.out.println("Student Name: " + studentName + "\nAverage Test Score: " + avgScore + "\nLetter Grade: " + calculateLetterGrade(avgScore));	/*displays student name, average test score, and 
																																							  invokes the method to get a letter grade*/	
		}
	
	final long DURATION = System.nanoTime() - START;						//total time to execute is start minus duration
	System.out.println("Program takes " + (DURATION / 1000000000) + " seconds to execute.");	//displays time taken to excute program in seconds
	}
	
	public static String calculateLetterGrade(double avgScore){		//defines the calculateLetterGrade method for average score
		if (avgScore >= 90.0)										//test scores greater than 89 receive letter grade A
			return "A";
		else if (avgScore < 90.0 && avgScore >= 80.0)				//test scores greater than 79 but less than 90 receive letter grade B
			return "B";
		else if (avgScore < 80.0 && avgScore >= 70.0)				//test scores greater than 69 but less than 80 receive letter grade C
			return "C";
		else if (avgScore < 70.0 && avgScore >= 60.0)				//test scores greater than 59 but less than 70 receive letter grade D
			return "D";
		else														//test scores less than 60 receive an F
			return "F";
	}
	
}