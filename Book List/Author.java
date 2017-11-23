//Written by Anthony Rojas and Edgar Palapa
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Author {
	private String name;
	private int age;
	private ArrayList<Book> book;
	public Author(String n, int a){
		name = n;
		age = a;
		book = new ArrayList<Book>();
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setBook(Book b){
		this.book.add(b);
	}
	
	public Book getBook(String title){
		for(Book b : book){
			if(title.toLowerCase().equals(b.getTitle().toLowerCase())){
				return b;
			}
		}
		return null;
	}
	
	public String toString(){
		String output = name + "\n" + age + "yrs old";
		return output;
	}
}
