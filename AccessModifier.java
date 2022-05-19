package com.Examples;

public class AccessModifier 
{
		private int intEmpNo;
		String strEmpName = "Aditi Ghatage"; //default access modifier
		protected long intMobileNumber = 9878654536l;
		public String strCompanyName = "Kirloskar Company"; 
		
		public void displayDesignation()
		{
			intEmpNo = 35;
			
			if(intEmpNo>35)
			{
				System.out.println("Employee is in Production department");
			}
			else if(intEmpNo>=35)
			{
				System.out.println("Employee is in Sales department");
			}
			else
			{
				System.out.println("Employee is in Marketing department");
			}
			
		}
		
		public void stringLength() 
		{	
			System.out.println("Length of the string is : "+strEmpName.length());
		}
		
		public void printCompanyName()
		{
			System.out.println("Company Name is "+strCompanyName);
		}
}
