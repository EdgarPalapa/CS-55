//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class BookTitleComparator implements Comparator<Book>{
	
	public int compare(Book a, Book b){
		return a.getTitle().compareTo(b.getTitle());
	}
}	
