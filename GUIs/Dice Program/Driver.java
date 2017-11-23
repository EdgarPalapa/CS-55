//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Driver{
	public static void main(String [] args){
		MyIO.display("This is a dice program.\nFor this program, six-sided dice will be used.\nLets begin...", Color.BLACK, Color.RED);
		DieControl dc = new DieControl();
		dc.run(); 										//run project 1 in order to test methods
														//below: run and test methods from project 2
		PairOfDie p1 = new PairOfDie();
		MyIO.display("Pair of dice values:\n" + p1.toString());		//displays pair of dice values
		p1.rollDice();
		MyIO.display("Pair of dice values after being rolled:\n" + p1.toString());		//displays pair of dice values after roll
	}
}