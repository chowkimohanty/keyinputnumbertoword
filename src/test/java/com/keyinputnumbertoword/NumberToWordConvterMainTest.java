package com.keyinputnumbertoword;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

import com.keyinputnumbertoword.service.NumberToWordService;
import com.keyinputnumbertoword.validations.NumberValidation;



public class NumberToWordConvterMainTest{
	static Scanner scanner;
	
	@BeforeClass
	  public static void setUp(){
		String data = "10";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		//Create mock object of Scanner
		scanner = new Scanner("10");
		System.setIn(stdin);

	}

	@Test
	public void testConvertNumToWord() throws Exception {
		assertTrue("Input validated", NumberToWordService.convertToWords(NumberValidation.validate(scanner)));
	}


}
