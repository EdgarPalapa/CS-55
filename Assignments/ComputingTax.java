//Written by Edgar Palapa
//CS55
//Section 1226
//Professor Dehkhoda
//Project 2: Computing Tax
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.event.*;

import java.io.*;

import java.util.*;
//standard library imports
public class ComputingTax
{
	public static void main(String[] args) 
	{
		final double TAXRATE1 = 0.10;	//marginal tax rates based on 2009 figures
		final double TAXRATE2 = 0.15;
		final double TAXRATE3 = 0.25;
		final double TAXRATE4 = 0.28;
		final double TAXRATE5 = 0.33;
		final double TAXRATE6 = 0.35;
		
		Scanner input = new Scanner(System.in); //scan user input
		
		System.out.print("Enter the filing status: ");	//prompt user to enter filing status
		
		int status = input.nextInt();
		
		
		System.out.print("Enter the taxable income: ");	//prompt user to enter income
		
		double Income = input.nextDouble();
		
		
		double Tax = 0;	//tax variable
		switch (status)
		{
			case 0:					//compute tax for single filers
				
				Tax += (Income <= 8350) ? Income * TAXRATE1: 8350 * TAXRATE1;
				
				if (Income > 8350)
					Tax += (Income <= 33950) ? (Income - 8350) * TAXRATE2: (33950 - 8350) * TAXRATE2;//
				if (Income > 33950)
					Tax += (Income <= 82250) ? (Income - 33950) * TAXRATE3: (82250 - 33950) * TAXRATE3;//
				if (Income > 82250) 
					Tax += (Income <= 171550) ? (Income - 82250) * TAXRATE4: (171550 - 82250) * TAXRATE4;//
				if (Income > 171550)
					Tax += (Income <= 372950) ? (Income - 171550) * TAXRATE5: (372951 - 171550) * TAXRATE5;
				if (Income >= 372951)
					Tax += (Income - 372950) * TAXRATE6;
				break;


			case 1: 				//compute tax for joint married filers or widowers
				
				Tax += (Income <= 16700) ? Income * TAXRATE1: 16700 * TAXRATE1;
				
				if (Income > 16700)
					Tax += (Income <= 67900) ? (Income - 16700) * TAXRATE2: (67900 - 16700) * TAXRATE2;
				
				if (Income > 67900)
					Tax += (Income <= 137050) ? (Income - 67900) * TAXRATE3: (137050 - 67900) * TAXRATE3;
					
				if (Income > 137050)
					Tax += (Income <= 208850) ? (Income - 137050) * TAXRATE4: (208850 - 137050) * TAXRATE4;
				
				if (Income > 208850)
					Tax += (Income <= 372950) ? (Income - 208850) * TAXRATE5: (372950 - 208850) * TAXRATE5;
				
				if (Income >= 372951)
					Tax += (Income - 372950) * TAXRATE6;
				break;
				
				
			case 2:					//compute tax for separate married filers
				
				Tax += (Income <= 8350) ? Income * TAXRATE1: 8350 * TAXRATE1;
				
				if (Income > 8350)
					Tax += (Income <= 33950) ? (Income - 8350) * TAXRATE2: (33950 - 8350) * TAXRATE2;
				
				if (Income > 33950)
					Tax += (Income <= 68525) ? (Income - 33950) * TAXRATE3: (68525 - 33950) * TAXRATE3;
					
				if (Income > 68525)
					Tax += (Income <= 104425) ? (Income - 68525) * TAXRATE4: (104425 - 68525) * TAXRATE4;
				
				if (Income > 104425)
					Tax += (Income <= 186475) ? (Income - 104425) * TAXRATE5: (186475 - 104425) * TAXRATE5;
				
				if (Income >= 186476)
					Tax += (Income - 186475) * TAXRATE6;
				break;
				
			
			case 3:					//compute tax for head of household
				
				Tax += (Income <= 11950) ? Income * TAXRATE1: 11950 * TAXRATE1;
				
				if (Income > 11950)
					Tax += (Income <= 45500) ? (Income - 45500) * TAXRATE2: (45500 - 11950) * TAXRATE2;
				
				if (Income > 45500)
					Tax += (Income <= 117450) ? (Income - 45500) * TAXRATE3: (117450 - 45500) * TAXRATE3;
					
				if (Income > 117450)
					Tax += (Income <= 190200) ? (Income - 117450) * TAXRATE4: (190200 - 117450) * TAXRATE4;
				
				if (Income > 190200)
					Tax += (Income <= 372950) ? (Income -190200) * TAXRATE5: (372950 - 190200) * TAXRATE5;
				
				if (Income >= 372951)
					Tax += (Income - 372950) * TAXRATE6;
				break;
			
	
			default: System.out.println("Invalid filing status");		//error message in case user input is not 0,1,2, or 3 for filing status
					 System.exit(1);
		}
		System.out.println("Tax is: " + Tax);		//displays result in dollars and cents
	}

}
