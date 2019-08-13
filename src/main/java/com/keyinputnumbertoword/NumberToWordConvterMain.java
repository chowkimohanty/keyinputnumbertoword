package com.keyinputnumbertoword;

import java.util.Scanner;

import com.keyinputnumbertoword.service.NumberToWordService;
import com.keyinputnumbertoword.validations.NumberValidation;

public class NumberToWordConvterMain {

	// Driver code  
    public static void main(String[] args) { 
    	System.out.printf("Please enter a positive number: ");
		 Scanner scanner = new Scanner(System.in);
	        
			do {
				while (scanner.hasNext()) {
					NumberToWordService.convertToWords(NumberValidation.validate(scanner));
					System.out.printf("Please enter a positive number: ");
				}
	            scanner.next();
	        } while (scanner.hasNext());
	        scanner.close();
    }

}