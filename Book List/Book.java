//Written by Anthony Rojas and Edgar Palapa
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class Book implements Comparable<Book>{
	
	private String title;
	private ArrayList<Author> author;
	private MyDate publishing;
	private double price;
	
	
	public Book(String t, ArrayList<Author> au, MyDate pub, double pr){
		title = t;
		author = au;
		publishing = pub;
		price = pr;
	}

	/*
	 * setters and getters for Book
	 */
	public void setTitle(String t){
		this.title = t;
	}
	/*
	 * not sure if this was needed
	 */
	public String getTitle(){
		return title;
	}
	
	public void setAuthor(Author au){
		this.author.add(au);
	}
	
	public ArrayList<Author> getAuthor(){
		return author;
	}
	
	public void setDate(MyDate pub){
		this.publishing = pub;
	}
	
	public MyDate getDate(){
		return publishing;
	}
	
	public void setPrice(double pr){
		this.price = pr;
	}
	
	public double getPrice(){
		return price;
	}
	
	
	public int compareTo(Book b){
		if(this.getPrice() > b.getPrice())
			return -1;
		else return 1;
	}
	
	public String authorsToString(ArrayList<Author> au){
		String output = "";
		if(au.size() > 1){
			for(int i=0; i < au.size(); i++){
				if((i+1) == au.size()){
					output = output + au.get(i).getName();
				}
				else{
					output = output + au.get(i).getName() + ", ";
				}
			}
		}
		else{
			output = output + au.get(0).getName();
		}
		return output;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Book: " + title + "\nAuthor(s): " + authorsToString(author) + "\nDate of Publication: " + publishing + "\nPrice: $" + price;
	}
}