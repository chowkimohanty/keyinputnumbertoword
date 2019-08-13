package com.keyinputnumbertoword.constants;

public class Constants {
	
	public static final int MAX_RANGE = 999999999;
	
	public static final int MIN_RANGE = 0;
	
	public static final String PATTERN_REG = "-?\\d+(\\.\\d+)?";
	
	public static final String CRORE = "crore ";
	
	public static final String LAKH = "lakh ";
	
	public static final String THOUSAND = "thousand ";
	
	public static final String HUNDRED = "hundred ";
	
	public static final int ONE_CRORE = 10000000;
	
	public static final int ONE_LAKH = 100000;
	
	public static final int ONE_THOUSAND = 1000;
	
	public static final int ONE_HUNDRED = 100;
	
	
	// Strings at index 0 is not used, it is to make array  
	// indexing simple  
	public static String ONE[] = {"", "one ", "two ", "three ", "four ", 
	        "five ", "six ", "seven ", "eight ", 
	        "nine ", "ten ", "eleven ", "twelve ", 
	        "thirteen ", "fourteen ", "fifteen ", 
	        "sixteen ", "seventeen ", "eighteen ", 
	        "nineteen "
	    }; 

	// Strings at index 0 and 1 are not used, they is to  
	// make array indexing simple  
	public static String TEN[] = {"", "", "twenty ", "thirty ", "forty ", 
	        "fifty ", "sixty ", "seventy ", "eighty ", 
	        "ninety "
	    }; 



}
