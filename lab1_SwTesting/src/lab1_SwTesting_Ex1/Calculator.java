package lab1_SwTesting_Ex1;


public class Calculator {
	public int intMax(int a,int b,int c) {
		return Math.max(a,Math.max(b, c));
	}
	public static void  main(String [] args) {
		//Using Simple testing functionality of code without Junit test 
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		
//		Calculator calc = new Calculator();
//		int actualVal = calc.intMax(a, b, c);
//		int expectedVal = 30;
//		if(actualVal == expectedVal) {
//			System.out.println("Test Case Passed");
//		}else {
//			System.out.println("Test Case Failed");
//		}
	}
}
