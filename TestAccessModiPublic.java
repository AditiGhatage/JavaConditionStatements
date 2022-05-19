package com.accessmodifier;

import com.Examples.AccessModifier;

public class TestAccessModiPublic extends AccessModifier {

	public static void main(String[] args) 
	{
		
				AccessModifier objacessmodifierpublic = new AccessModifier();
				
				objacessmodifierpublic.stringLength();
				
				TestAccessModiPublic objtestmodify = new TestAccessModiPublic();
				
				objacessmodifierpublic.strCompanyName="Wipro"; //Accessing public variable outside the package 
				objacessmodifierpublic.printCompanyName();
				
				objtestmodify.strCompanyName="TCS"; //Accessing public variable outside the package through inheritance
				objtestmodify.printCompanyName();
				
				

	}

}
