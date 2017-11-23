//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Car {
	private String make;
	private double price;
	private int year;
	private long vinNumber;
	
	public Car(){
		
	}

	public Car(String m, double p, int y, long vN){
		make = m;
		price = p;
		year = y;
		vinNumber = vN;
	}

	public void setMake(String m){
		this.make = m;
	}

	public void setPrice(double p){
		this.price = p;
	}

	public void setYear(int y){
		this.year = y;
	}

	public void setVinNumber(long vN){
		this.vinNumber = vN;
	}

	public String getMake(){
		return make;
	}

	public double getPrice(){
		return price;
	}

	public int getYear(){
		return year;
	}

	public long getVinNumber(){
		return vinNumber;
	}

	@Override
	public String toString(){
		return make + "\t$" + String.valueOf(price) + "\t" + String.valueOf(year) + "\t" + String.valueOf(vinNumber); 
	}
}