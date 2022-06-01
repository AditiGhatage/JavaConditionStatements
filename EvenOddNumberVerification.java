package com.Examples;

public class EvenOddNumberVerification
{
	public void evenOddVerify()
	{
    int intnumber = 24;
    if(intnumber % 2 == 0)
    {
        System.out.println(intnumber + " is even");
    }
    else
    {
        System.out.println(intnumber + " is odd");
    }
    System.out.println("==========================");
	}
	
	public void vowelConstant()
	{
		char ch = 'z';
		
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println(ch + " is vowel");
        }
        else
            System.out.println(ch + " is consonant");
	}
	
	
	
}

