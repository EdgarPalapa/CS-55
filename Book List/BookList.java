//Wrritten by Anthony Rojas and Edgar Palapa
import java.util.ArrayList;
import java.util.Arrays;

public class BookList {
	
	public static void main(String[] args){
		Book[] books = new Book[10];
		books[0] = new Book("A Song of Ice and Fire", new ArrayList<Author>(){{add(new Author("George RR Martin", 55));}}, new MyDate(1999, 0, 12), 59.99);
		books[1] = new Book("Sandman Vol. 1", new ArrayList<Author>(){{add(new Author("Neil Gaiman", 42)); add(new Author("Dave McKean", 48));}}, new MyDate(1995, 2, 24), 24.99);
		books[2] = new Book("Batman: The Long Halloween", new ArrayList<Author>(){{add(new Author("Jeph Loeb", 50)); add(new Author("Tim Sale", 42));}}, new MyDate(2001, 9, 31), 28.99);
		books[3] = new Book("Old Man Logan", new ArrayList<Author>(){{add(new Author("Mark Millar", 41)); add(new Author("Steve McKniven", 39));}}, new MyDate(2006, 1, 21), 29.99);
		books[4] = new Book("Lucifer", new ArrayList<Author>(){{add(new Author("Mike Carey", 50)); add(new Author("Peter Gross", 53));}}, new MyDate(2001, 4, 25), 19.99);
		books[5] = new Book("American Vampire", new ArrayList<Author>(){{add(new Author("Scott Snyder", 32)); add(new Author("Stephen King", 38)); add(new Author("Rafeal Alburque", 34));}}, new MyDate(2001, 7, 14), 16.99);
		books[6] = new Book("Lazarus", new ArrayList<Author>(){{add(new Author("Greg Rucka", 39)); add(new Author("Michael Lark", 35));}}, new MyDate(2008, 2, 21), 32.99);
		books[7] = new Book("Watchmen", new ArrayList<Author>(){{add(new Author("Alan Moore", 52)); add(new Author("Dave Gibbons", 48));}}, new MyDate(1999, 5, 30), 23.99);
		books[8] = new Book("How to Fail at Life", new ArrayList<Author>(){{add(new Author("Edgar Megat", 22)); add(new Author("Allan Bus", 20)); add(new Author("John Johnson", 99));}}, new MyDate(2015, 1, 1), 1.99);
		books[9] = new Book("Green Eggs and Ham", new ArrayList(){{add(new Author("Dr. Seuss", 80));}}, new MyDate(1998, 0, 12), 9.99);
		Arrays.sort(books);
		System.out.println("Books have been sorted using the compareTo method\n");
		showBooksArray(books);
		System.out.println("\nThe most expensive book:\n" + max(books).toString());
		Arrays.sort(books, new BookTitleComparator());
		System.out.println("\nThe books have been sorted using the comparator class:\n");
		showBooksArray(books);
	}
	
	public static void showBooksArray(Book[] books){
		for(Book b : books){
			System.out.println(b);
		}
	}
	
	public static Book max(Book[] books){
		double maxPrice = books[0].getPrice();
		Book max = books[0];
		for(Book b : books){
			if(max.getPrice() < b.getPrice()){
				maxPrice = b.getPrice();
				max = b;
			}
		}
		return max;
	}
}
