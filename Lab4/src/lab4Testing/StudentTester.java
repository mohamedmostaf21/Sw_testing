package lab4Testing;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;



import org.junit.*;
import org.junit.Test;

public class StudentTester {
	
	
	@BeforeClass
	public static void InitAll()
	{
		System.out.println("Before Init All...");
	}
	
	@Before
	public void InitEach()
	{
		System.out.println("Before Init Each...");
	}
	
	@Test
	public void StudentTest1()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren", 29);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest2()
	{
		Student s1 = new Student("Ahmed", 23);
		Student s2 = new Student("Ahmed", 23);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest3()
	{
		Student s1 = new Student("Abdullah", 23);
		Student s2 = new Student("Abdullah", 23);

		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest4()
	{
		Student s1 = new Student("Andrew", 23);
		Student s2 = new Student("Andrew", 23);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest5()
	{
		Student s1 = new Student("Mostafa", 23);
		Student s2 = new Student("Mostafa", 23);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest6()
	{
		Student s1 = new Student("Mohamed", 23);
		Student s2 = new Student("Mohamed", 23);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest7()
	{
		Student s1 = new Student("Mazen", 23);
		Student s2 = new Student("Mazen", 23);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest8()
	{
		Student s1 = new Student("Eren Yeger", 29);
		Student s2 = new Student("Eren Yeger", 29);
		
		assertEquals(s1,s2);
	}
	
	@Test
	public void StudentTest9()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren Yeger", 29);
		
		assertNotEquals(s1,s2);
	}
	
	@Test
	public void StudentTest10()
	{
		Student s1 = new Student("Eren Yeger", 30);
		Student s2 = new Student("Eren Yeger", 29);
		
		
		assertNotEquals(s1,s2);
	}
	
	@Test
	public void StudentTest11()
	{
		Student s = new Student("Eren", 29);
		assertEquals("Eren",s.GetName());
	}
	
	@Test
	public void StudentTest12()
	{
		Student s = new Student("Eren", 29);
		assertEquals(29,s.GetAge());
	}
	
	@Test
	public void StudentTest13()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren", 29);
		assertEquals(s1.GetName(),s2.GetName());
	}
	
	@Test
	public void StudentTest14()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren", 29);
		assertEquals(s1.GetAge(),s2.GetAge());
	}
	
	@Test
	public void StudentTest15()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren", 29);
		assertTrue(s1.GetName() == s2.GetName() && s1.GetAge() == s2.GetAge());
	}
	
	@Test
	public void StudentTest16()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren Yeger", 29);
		assertTrue(s1.GetName() != s2.GetName() && s1.GetAge() == s2.GetAge());
	}
	
	@Test
	public void StudentTest17()
	{
		Student s1 = new Student("Eren Yeger", 30);
		Student s2 = new Student("Eren Yeger", 29);
		
		assertTrue(s1.GetName() == s2.GetName() && s1.GetAge() != s2.GetAge());
	}
	
	@Test
	public void StudentTest18()
	{
		Student s = new Student("Eren", 29);

		assertNotNull(s);
	}
	
	@Test
	public void StudentTest19()
	{
		Student s = null;
		
		assertNull(s);
	}
	
	@Test
	public void StudentTest20()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = s1;
		
		assertSame(s1, s2);
	}
	
	@Test
	public void StudentTest21()
	{
		Student s1 = new Student("Eren", 29);
		Student s2 = new Student("Eren", 29);
		
		assertNotSame(s1, s2);
	}
}
