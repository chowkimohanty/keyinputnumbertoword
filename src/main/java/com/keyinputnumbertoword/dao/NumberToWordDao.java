package com.keyinputnumbertoword.dao;

public class NumberToWordDao {
	// Function to print a given number in words  
    public static boolean saveWord(String output){
    	System.out.println(output);
		return (output!=null && output.length() > 0) ? true : false;
    }
}
