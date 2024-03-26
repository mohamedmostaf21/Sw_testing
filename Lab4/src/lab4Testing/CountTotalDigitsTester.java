package lab4Testing;


import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountTotalDigitsTester {

	
	private ByteArrayInputStream bais;
	private ByteArrayOutputStream baos;
	private String userInput = "";
	
	
	@BeforeClass
	public static void InitAll()
	{
		System.out.println("Before Init All...");
	}
	
	@Before
	public void InitEach()
	{
		baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);
	}
	
	@After
	public void afterEach()
	{
		try {	
			baos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bais.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestCountTtoalDigitsTest1()
	{
		userInput = "123";
		bais = new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);
		 
		//run the program
		CountTotalDigits.main(null);
		
		String actual = baos.toString();
		String expected = "3";
		
		System.out.print("Actual : ");
		System.out.print(actual);
		System.out.println();
		System.out.print("Expected : ");
		System.out.print(expected);
		System.out.println();
		
		assertEquals("Error in Testing Counting Digits",actual,expected);
	}
	
	@Test
	public void TestCountTtoalDigitsTest2()
	{
		userInput = "1";
		bais = new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);
		
		//run the program
		CountTotalDigits.main(null);
		
		String actual = baos.toString();
		String expected = "1";
		
		System.out.print("Actual : ");
		System.out.print(actual);
		System.out.println();
		System.out.print("Expected : ");
		System.out.print(expected);
		System.out.println();
		
		assertEquals("Error in Testing Counting Digits",actual,expected);
	}
	@Test
	public void TestCountTtoalDigitsTest3()
	{
		userInput = "12";
		bais = new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);
		
		//run the program
		CountTotalDigits.main(null);
		
		String actual = baos.toString();
		String expected = "2";
		
		System.out.print("Actual : ");
		System.out.print(actual);
		System.out.println();
		System.out.print("Expected : ");
		System.out.print(expected);
		System.out.println();
		
		assertEquals("Error in Testing Counting Digits",actual,expected);
	}
	
	@Test
	public void TestCountTtoalDigitsTest4()
	{
		
		userInput = "-423";
		bais = new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);
		
		//run the program
		CountTotalDigits.main(null);
		
		String actual = baos.toString();
		String expected = "3";
		
		System.out.print("Actual : ");
		System.out.print(actual);
		System.out.println();
		System.out.print("Expected : ");
		System.out.print(expected);
		System.out.println();
		
		assertEquals("Error in Testing Counting Digits",actual,expected);
	}
	
	@Test
	public void TestCountTtoalDigitsTest5()
	{
		userInput = "-4";	
		bais = new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);
		
		//run the program
		CountTotalDigits.main(null);
		
		String actual = baos.toString();
		String expected = "1";
		
		System.out.print("Actual : ");
		System.out.print(actual);
		System.out.println();
		System.out.print("Expected : ");
		System.out.print(expected);
		System.out.println();
		
		assertEquals("Error in Testing Counting Digits",actual,expected);
	}
	
	@Test
	public void TestCountTtoalDigitsTest6()
	{
		userInput = "-4232";		
		bais = new ByteArrayInputStream(userInput.getBytes());		 
		System.setIn(bais);
		
		//run the program
		CountTotalDigits.main(null);
		
		String actual = baos.toString();
		String expected = "4";
		
		System.out.print("Actual : ");
		System.out.print(actual);
		System.out.println();
		System.out.print("Expected : ");
		System.out.print(expected);
		System.out.println();
		
		assertEquals("Error in Testing Counting Digits",actual,expected);
	}
}
