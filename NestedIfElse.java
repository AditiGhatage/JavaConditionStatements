package com.Examples;

import java.util.Scanner;


public class NestedIfElse 
{
	@SuppressWarnings("resource")
	public void studentPercent()
	{
	Scanner scn = new Scanner(System.in);
	   
	  System.out.println("Enter the marks of Physics ");
	   int phyMarks = scn.nextInt();
	  System.out.println("Enter the marks of Chemistry ");
	   int chemMarks = scn.nextInt();
	  System.out.println("Enter the marks of Maths ");
	   int mathsMarks = scn.nextInt();
	 
	System.out.println("Enter the marks of English ");
	 int engMarks = scn.nextInt();
	System.out.println("Enter the marks of Computer ");
	 int compMarks = scn.nextInt();
	 
	float totalMarks = phyMarks + chemMarks + mathsMarks + engMarks + compMarks;
	System.out.println("Total marks in five subjects: " +totalMarks);
	float myPercent = totalMarks /5;
	System.out.println("My percentage: " +myPercent);

	if(myPercent >= 80)
	{ 
	 System.out.println("Grade A");	
	}
	else if(myPercent>=65) 
	{
	  System.out.println("Grade B");	
	}
	else if(myPercent>=55)
	{
	  System.out.println("Grade C");	
	}
	else if(myPercent>=35)
	{
	  System.out.println("Grade D");	
	}
	else
	{
	  System.out.println("Fail");	
	}
	}
}
	
	
