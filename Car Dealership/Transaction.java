//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Transaction {
	private SalesPerson sp;
	private Car carSold;
	public Transaction(SalesPerson s, Car c){
		sp = s;
		carSold = c;
	}
	
	public void setSalesPerson(SalesPerson s){
		this.sp = s;
	}
	
	public void setCar(Car c){
		this.carSold = c;
	}
	
	public SalesPerson getSalesPerson(){
		return sp;
	}
	
	public Car getCar(){
		return carSold;
	}

	@Override
	public String toString(){
		return sp.toString() + "\t" + carSold.toString();
	}
}