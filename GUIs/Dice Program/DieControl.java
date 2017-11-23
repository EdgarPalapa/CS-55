//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class DieControl {
	Die[] ard1, ard2;
	
	/**
	 * Constructor for DieControl that controls different operations to be done with multiple Die
	 */
	public DieControl(){
		ard1 = new Die[100];					//die 1
		ard2 = new Die[100];					//die 2
		for(int i=0; i < ard1.length; i++){		//initialize the face values of the dice
			ard1[i] = new Die();
			ard2[i] = new Die();
		}
	}
	
	/**
	 * This method executes the program to test methods of Die
	 */
	public void run(){
		MyIO.display("Array 1 values will be displayed.");
		printArray(ard1);				//test print array on first array
		throwArrayOfDie(ard1);			//test throw array on first array
		MyIO.display("Array 1 has been thrown and its values will be displayed");
		printArray(ard1);				//output first array again
		MyIO.display("Sum of Array 1 values:\n"+ String.valueOf(sumArray(ard1)));		//display the sum of first array
		MyIO.display("Array 1 will be displayed again.");
		printArray(ard1);				//output first array
		MyIO.display("Array 2 will be displayed.");
		printArray(ard2);				//output second array
		MyIO.display("Does the value of Array 1 and Array 2 match at index 5?\n"+ String.valueOf(compareArrays(ard1, ard2, 5)));		//see if both arrays match at index 5

	}
	
	/**
	 * This method outputs an array of dice in one GUI with each value appearing on a new line
	 * @param ard is an array of Die
	 */
	public static void printArray(Die[] ard){
		String s = "";
		for(Die d : ard){
			s += d.toString() + "\n";
		}
		MyIO.display(s);
	}
	
	/**
	 * This method throws each die in an array of dice to change the values
	 * @param ard the array of dice to be changed in values
	 */
	public static void throwArrayOfDie(Die[] ard){
		for(int i=0; i < ard.length; i++){
			ard[i].rollDie();
		}
	}
	
	/**
	 * This method compares two arrays of dice at a certain index
	 * @param a1 first array of dice
	 * @param a2 second array of dice
	 * @param i is the index of the values being compared
	 * @return
	 */
	public static boolean compareArrays(Die[] a1, Die[] a2, int i){
		return a1[i].getFace() == a2[i].getFace();
	}
	
	/**
	 * This method sums up the values of dice in an array of dice
	 * @param ard is an array of dice
	 * @return sum of face values of an array of dice as an integer
	 */
	public static int sumArray(Die[] ard){
		int sum=0;
		for(Die d : ard){
			sum+= d.getFace();
		}
		return sum;
	}
}
