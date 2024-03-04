package lab1_SwTesting_Ex1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testCase1() {
		Calculator calc = new Calculator();
		
		assertEquals("testIntMax",30, calc.intMax(10, 20, 30));
		System.out.println("Done test case1 of intMax");
	}
	@Test
	public void testCase2() {
		Calculator calc = new Calculator();
		
		assertEquals("testIntMax",20, calc.intMax(-10, 20, 0));
		System.out.println("Done test case2 of intMax");
	}
	@Test
	public void testCase3() {
		Calculator calc = new Calculator();
		
		assertEquals("testIntMax",30, calc.intMax(20, 10, 30));
		System.out.println("Done test case3 of intMax");
	}
	@Test
	public void testCase4() {
		Calculator calc = new Calculator();
		
		assertEquals("testIntMax",30, calc.intMax(10, 30, 20));
		System.out.println("Done test case4 of intMax");
	}
	@Test
	public void testCase5() {
		Calculator calc = new Calculator();
		
		assertEquals("testIntMax",30, calc.intMax(30, 20, 10));
		System.out.println("Done test case5 of intMax");
	}
	@Test
	public void testCase6() {
		Calculator calc = new Calculator();
		
		assertEquals("testIntMax",10, calc.intMax(10, 10, 10));
		System.out.println("Done test case1 of intMax");
	}
	

	
}
