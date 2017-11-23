//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Manager {
	private String firstName, lastName;
	private String address;
	private Calendar hiringDate;
	
	public Manager(){
	}
	
	public Manager(String fn, String ln, String a, Calendar hd){
		firstName = fn;
		lastName = ln;
		address = a;
		hiringDate = hd;
	}
	
	public void setFirstName(String fn){
		this.firstName = fn;
	}
	
	public void setLastName(String ln){
		this.lastName = ln;
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
	
	public String getAddress(){
		return address;
	}
	
	public Calendar getHiringDate(){
		return hiringDate;
	}
	
	@Override
	public String toString(){
		return firstName + " " + lastName + "\n" + address + "\n" + getCalendarDate(hiringDate);
	}

	public String getCalendarDate(Calendar d){
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		return df.format(hiringDate.getTime());
	}
}