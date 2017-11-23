//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class PairOfDie {
	private Die d1, d2;
	
	
	/**
	 * Empty constructor for PairOfDie
	 */
	public PairOfDie(){
		d1 = new Die();
		d2 = new Die();
	}
	
	/**
	 * Setters and getters for class
	 */
	
	public void setDie1(Die d){
		this.d1 = d;
	}
	
	public void setDie2(Die d){
		this.d2 = d;
	}
	
	public Die getDie1(){
		return d1;
	}
	
	public Die getDie2(){
		return d2;
	}
	
	public void rollDice(){
		this.d1.rollDie();
		this.d2.rollDie();
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.d1) + "\t" + String.valueOf(this.d2);	//returns pair of dice values
	}
}
