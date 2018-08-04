package com.java;

public class A {

	 static String s = "AAA";
	 
	    static
	    {
	        s = s + "BBB";
	    }
	 
	    {
	        s = "AAABBB";
	    }

}
