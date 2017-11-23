//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class TestDealership{

	public static void main(String [] args){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Manager m = new Manager("Rob", "Stark", "123 Winterfell Rd.", new GregorianCalendar(2000, 00, 14)); //year, month, day ...month starts at 0 and ends at 11
		
		Car c1 = new Car("Acura", 16549.45, 2008, 98469855L);
		Car c2 = new Car("Honda", 24000.00, 2014, 684984546L);
		Car c3 = new Car("Honda", 15895.78, 2010, 123548998L);
		Car c4 = new Car("Toyota", 14008.25, 2009, 787849951L);
		Car c5 = new Car("Toyota", 12881.80, 2008, 9879856461L);
		Car c6 = new Car("Nissan", 14868.58, 2009, 2354689587L);
		Car c7 = new Car("Hyundai", 15891.00, 2008, 6845446214L);
		Car c8 = new Car("Nissan", 20147.00, 2013, 56864845366L);
		Car c9 = new Car("Chevrolet", 18235.00, 2012, 4568989713L);
		Car c10 = new Car("Chevrolet", 15656.45, 2010, 4885649875L);
		Car c11 = new Car("Acura", 35647.00, 2016, 89846541232L);
		Car c12 = new Car("Volkswagen", 6145.25, 2000, 4587854554L);
		
		SalesPerson s1 = new SalesPerson("Allan", "Bus", 0, "123 Mane St.", new GregorianCalendar(2006, 00, 15));
		SalesPerson s2 = new SalesPerson("Hank", "Hill", 2000, "546 Propane Ave.", new GregorianCalendar(2008, 05, 16));
		SalesPerson s3 = new SalesPerson("John", "Redcorn", 1000, "789 Redcorn Rd.", new GregorianCalendar(2009, 06, 18));
		SalesPerson s4 = new SalesPerson("Pearl", "Meows", 5000, "178 Tomcat St.", new GregorianCalendar(2014, 02, 19));
		SalesPerson s5 = new SalesPerson("John", "Johnson", 100, "965 Normie Blvd.", new GregorianCalendar(2016, 03, 17));
		
		Dealership d = new Dealership(m);
		
		d.addCar(c1);
		d.addCar(c2);
		d.addCar(c3);
		d.addCar(c4);
		d.addCar(c5);
		d.addCar(c6);
		d.addCar(c7);
		d.addCar(c8);
		d.addCar(c9);
		d.addCar(c10);
		d.addCar(c11);
		d.addCar(c12);
		
		d.addSalesPerson(s1);
		d.addSalesPerson(s2);
		d.addSalesPerson(s3);
		d.addSalesPerson(s4);
		d.addSalesPerson(s5);
		
		System.out.println(d.toString());
		
		System.out.println("\nOne person is fired:\n" + s5);
		d.removeSalesPerson(s5);
		System.out.println("\nThe most expensive car is being removed to be moved to another dealership in the future:\n" + c11);
		d.removeCar(c11);
		System.out.println("\nAn employee has sold 3 cars! The sales person is:\n" + s1);
		System.out.println("The cars sold are:\n" + c3 + "\n" + c5 + "\n" + c10);
		d.carSold(s1, c3);
		d.carSold(s1, c5);
		d.carSold(s1, c10);
		System.out.println("\nAn employee has sold 1 car! The sales person is:\n" + s4);
		System.out.println("The cars sold are:\n" + c12);
		d.carSold(s4, c12);
		System.out.println("\nAnother person is fired! Sales person is: " + s3);
		d.removeSalesPerson(s3);
		System.out.println("\nCurrent state of the dealership:\n" + d);
		System.out.println("\nEmployee of the month based on bonus:\n" + d.getPersonOfTheMonth());
		
	}
}