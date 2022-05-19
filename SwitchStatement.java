package com.Examples;

public class SwitchStatement 
{
	public void employmentEligibilityCheck()
	{
		int intage = 2;
		
		switch (intage) 
		{
        case 18:
            System.out.println("Your are eligible to work");
            break;
        case 2:
            System.out.println("You are underage to work");
            break;
        case 63:
            System.out.println("You are above age to work");
            break;
         default:
        	 System.out.println("Your are eligible to work......"); 
		}
          
	}
	
}
