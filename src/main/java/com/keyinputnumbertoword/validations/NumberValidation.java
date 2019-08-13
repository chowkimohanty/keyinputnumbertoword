package com.keyinputnumbertoword.validations;

import java.util.Scanner;

import com.keyinputnumbertoword.businessrule.ConvertionBusinessRule;

public class NumberValidation {
	
	public static String validate(Scanner scanner) {
        String input = "";
        int number = -1;
        boolean next = false;
		do {
			while (scanner.hasNext()) {
            	 input = scanner.next();
                 if(!ConvertionBusinessRule.checkNumeric(input)) {
                 	System.out.printf("\"%s\" is not a valid number.\n Please enter again: ", input);
                 	next = true;
                 }else {
                	 try {
                		 number = Integer.parseInt(input);
                		 if(!ConvertionBusinessRule.checkNumberRange(number)) {
                          	System.out.printf("\"%s\" is not within range of 999999999. \nPlease enter a number between 0 - 999999999: ", number);
                          }else {
                         	 next = false;
                         	 break;
                          }
                	 }catch(Exception ex) {
                		 System.out.printf("\"%s\" is not a valid number.\n Please enter again: ", input);
                      	next = true;
                	 }
                } 
            }
            if(next) {
            scanner.next();
            }
        } while (number < 0);
        return input;
    }

}
