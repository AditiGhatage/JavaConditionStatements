package com.Examples;

public class IFElseIf 
{
	public void gameEligibility()
	{
		{ 	
			  int youth = 20, adult = 30, child = 10;
			  if(youth == 20)
			  {
			   if(adult < 50) {
			         System.out.println("Adults are eligible for game");	 
			    }
			   if(child > 5)
			   {
			         System.out.println("Children are not eligible for game");
			   }
			   else
			        System.out.println("Youth are eligible");	 
			   }
			  else {
			        System.out.println("Go Home!");	
			   }
			 }
	}
	
}
