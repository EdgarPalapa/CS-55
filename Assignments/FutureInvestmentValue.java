//Written by Edgar Palapa
//CS55
//Section 1226
//Professor Dehkhoda
//Project 1: Future Investment Value
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.event.*;

import java.io.*;

import java.util.*;
//standard library imports
public class FutureInvestmentValue 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//scans for user inputs
		
		System.out.println("Enter investment amount: ");
		//prompt user input for investment amount
		double InvestmentAmount = input.nextDouble();
		//reads input investment amount
		
		System.out.println("Enter annual interest rate: ");
		//prompt user input for annual interest rate
		double AnnualInterestRate = input.nextDouble();
		//reads input annual interest rate
		
		System.out.println("Enter number of years: ");
		//prompt user input for number of years
		double NumberOfYears = input.nextDouble();
		//reads input years
		double MonthlyInterest = AnnualInterestRate / 12;
		//computes the monthly interest rate
		double FutureInvestmentValue = InvestmentAmount + Math.pow((1 + MonthlyInterest), (NumberOfYears * 12));
		//computes the accumulated value
		
		System.out.println("Accumulated value is " + FutureInvestmentValue);
		//outputs the accumulated value
	}
}
