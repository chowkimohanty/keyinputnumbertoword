package com.keyinputnumbertoword.service;

import static com.keyinputnumbertoword.constants.Constants.*;
import com.keyinputnumbertoword.dao.NumberToWordDao;

public class NumberToWordService {
	static StringBuffer out = new StringBuffer(); 
	// Function to convert a given number in words  
    public static boolean convertToWords(String n){
    	// stores word representation of given number n  
    	out = new StringBuffer();
    	
    	// handles digits more than ones and tens places (if any)  
    	n = getNumPlaceValue(n);

    	int input = Integer.parseInt(n);
  
        if (input > ONE_HUNDRED && input % ONE_HUNDRED > 0) { 
        	out.append("and "); 
        } 
  
        // handles digits at ones and tens places (if any)  
        out.append(numToWords((int) (input % ONE_HUNDRED), "")); 
  
        return NumberToWordDao.saveWord(out.toString()); 
    }


	private static String getNumPlaceValue(String n) {
		int input = Integer.parseInt(n);
		if(n.length() >= 8) {
			out.append(getCroreNumToWords(Integer.parseInt(n)));
			input = input % ONE_CRORE;
			n = String.valueOf(input);
		}
		// handles digits at hundred thousands and one  
        // millions places (if any)  
		if(n.length() >= 6) {
			out.append(getLakhNumToWords(Integer.parseInt(n)));
			input = input % ONE_LAKH;
			n = String.valueOf(input);
		}
		// handles digits at thousands and tens thousands  
        // places (if any) 
		if(n.length() >= 4) {
			out.append(getThousandNumToWords(Integer.parseInt(n)));
			input = input % ONE_THOUSAND;
			n = String.valueOf(input);
		}
		// handles digit at hundreds places (if any)  
		if(n.length() >= 3) {
			out.append(getHundredNumToWords(Integer.parseInt(n)));
			input = input % ONE_HUNDRED;
			n = String.valueOf(input);
		}
		
		return n;
	}


	static String getCroreNumToWords(int num) {
    	return numToWords((int) (num / ONE_CRORE), CRORE); 
  
    }
    
    static String getLakhNumToWords(int num) {
    	return numToWords((int) (num / ONE_LAKH), LAKH); 
  
    }
    
    static String getThousandNumToWords(int num) {
    	return numToWords((int) (num / ONE_THOUSAND), THOUSAND); 
  
    }
    
    static String getHundredNumToWords(int num) {
    	return numToWords((int) (num / ONE_HUNDRED), HUNDRED); 
  
    }
    
	// input is 1- or 2-digit number  
    static String numToWords(int input, String s){ 
        String str = ""; 
        // if n is more than 19, divide it  
        if (input > 19) { 
            str += TEN[input / 10] + ONE[input % 10]; 
        } else { 
            str += ONE[input]; 
        } 
  
        // if n is non-zero  
        if (input != 0) { 
            str += s; 
        } 
  
        return str; 
    }
}
