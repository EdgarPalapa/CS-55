//Written by Anthony Rojas and Edgar Palapa
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;
public class MyDate {
	private GregorianCalendar pubCal;
	private Date pubDate;
	private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
	public MyDate(int year, int month, int day){
		pubCal = new GregorianCalendar(year, month, day);
		pubDate = pubCal.getTime();
	}
	
	public void setDate(Date pd){
		this.pubDate = pd;
	}
	
	public void setCalendar(GregorianCalendar pc){
		this.pubCal = pc;
	}
	
	public Date getDate(){
		return pubDate;
	}
	
	public Calendar getCalendar(){
		return pubCal;
	}
	
	public String toString(){
		return df.format(pubDate);
	}
}