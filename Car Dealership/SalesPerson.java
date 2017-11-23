//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class SalesPerson {
	private String firstName, lastName;
	private double bonus;
	private String address;
	private Calendar hiringDate;
	
	public SalesPerson(){
		
	}

	public SalesPerson(String fn, String ln, double b, String a, Calendar hd){
		firstName = fn;
		lastName = ln;
		bonus = b;
		address = a;
		hiringDate = hd;
	}

	public void setFirstName(String fn){
		this.firstName = fn;
	}

	public void setLastName(String ln){
		this.lastName = ln;
	}

	public void setBonus(double b){
		this.bonus = b;
	}

	public void setAddress(String a){
		this.address = a;
	}

	public void setHiringDate(Calendar hd){
		this.hiringDate = hd;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public double getBonus(){
		return bonus;
	}

	public String getAddress(){
		return address;
	}

	public Calendar getHiringDate(){
		return hiringDate;
	}

	public String getCalendarDate(Calendar d){
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		return df.format(hiringDate.getTime());
	}

	@Override
	public String toString(){
		return firstName + " " + lastName + "\n" + address + "\n$" + bonus + "\n" + getCalendarDate(hiringDate);
	}
}