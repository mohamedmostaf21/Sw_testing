package lab1_SwTesting_Ex2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TeenTest {
	//hasTeen
	@Test
	public void testCase1() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",true, teen.hasTeen(13, 13, 13));
		System.out.print("Done test case1 of hasTeen\n");
	}
	@Test
	public void testCase2() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",true, teen.hasTeen(19, 19, 19));
		System.out.print("Done test case2 of hasTeen\n");
	}
	@Test
	public void testCase3() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",true, teen.hasTeen(11, 15, 33));
		System.out.print("Done test case3 of hasTeen\n");
	}
	@Test
	public void testCase4() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",false, teen.hasTeen(10, 12, 21));
		System.out.print("Done test case4 of hasTeen\n");
	}
	@Test
	public void testCase5() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",false, teen.hasTeen(-1, 0, -3));
		System.out.print("Done test case5 of hasTeen\n");
	}
	@Test
	public void testCase6() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",true, teen.hasTeen(12, 13, 2));
		System.out.print("Done test case6 of hasTeen\n");
	}
	@Test
	public void testCase7() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",true, teen.hasTeen(13, 12, 2));
		System.out.print("Done test case7 of hasTeen\n");
	}
	@Test
	public void testCase8() {
		Teen teen = new Teen();
		assertEquals("test hasTeen",true, teen.hasTeen(12, 2, 13));
		System.out.print("Done test case8 of hasTeen\n");
	}
}