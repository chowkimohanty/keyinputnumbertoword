package com.keyinputnumbertoword.businessrule;

import com.keyinputnumbertoword.constants.Constants;

public class ConvertionBusinessRule {
	
	public static boolean checkNumberRange(int inputNum) {
		return ((inputNum >= Constants.MIN_RANGE) && (inputNum <= Constants.MAX_RANGE)) ? true : false;
	}

	public static boolean isNumeric(String strNum) {
	    return strNum.matches(Constants.PATTERN_REG);
	}
	
	public static boolean checkNumeric(String strNum) {
		try {
			return (Integer.parseInt(strNum) > 0);
		}catch(Exception ex) {
			return false;
		}
	}
}
