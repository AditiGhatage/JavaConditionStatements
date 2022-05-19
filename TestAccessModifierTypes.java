package com.Examples;

public class TestAccessModifierTypes {

	public static void main(String[] args) 
	{
		AccessModifier objaccessmodifier = new AccessModifier();
		//objaccessmodifier.intEmpNo;   ----private access modifier
		objaccessmodifier.displayDesignation();
		
		objaccessmodifier.strEmpName="Aditi Ghatage";
		objaccessmodifier.stringLength();
		objaccessmodifier.printCompanyName();
					
	}

}
