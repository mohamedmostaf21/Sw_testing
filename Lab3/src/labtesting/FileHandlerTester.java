package labtesting;


import static org.junit.Assert.assertEquals;

import java.util.Vector;

import org.junit.Test;


public class FileHandlerTester {

	@Test
	public void FileHandlerTest1()
	{
		String path = "test1.txt";
		
		FileHandler fileHandler = new FileHandler(path);
		
		Vector<Integer> expected = new Vector<>();
        expected.add(5);
        expected.add(12);
        expected.add(31);
        expected.add(45);
        expected.add(121);
        expected.add(4);
        
        Vector<Integer> actual = fileHandler.GetData();
        
        assertEquals(expected, actual);
	}
	
	@Test
	public void FileHandlerTest2()
	{
		String path = "";
		
		FileHandler fileHandler = new FileHandler(path);
		
		fileHandler.setFilePath("test1.txt");
		
		Vector<Integer> expected = new Vector<>();
        expected.add(5);
        expected.add(12);
        expected.add(31);
        expected.add(45);
        expected.add(121);
        expected.add(4);
        
        Vector<Integer> actual = fileHandler.GetData();
        
        assertEquals(expected, actual);
	}
	
	@Test
	public void FileHandlerTest3()
	{
		String path = "test2.txt";
		FileHandler fileHandler = new FileHandler(path);
		Vector<Integer> expected = new Vector<>();
        expected.add(29);
        
        Vector<Integer> actual = fileHandler.GetData();
        
        assertEquals(expected, actual);
	}
	
	@Test
	public void FileHandlerTest4()
	{
		String path = "test3.txt";
		
		FileHandler fileHandler = new FileHandler(path);
		Vector<Integer> expected = new Vector<>();
        
        Vector<Integer> actual = fileHandler.GetData();
        
        assertEquals(expected, actual);
	}
	
	
	@Test
	public void FileHandlerTest5()
	{
		String path = "";
		
		FileHandler fileHandler = new FileHandler(path);
		
		
		Vector<Integer> expected = new Vector<>();
        
        Vector<Integer> actual = fileHandler.GetData();
        
        assertEquals(expected, actual);
        
	}
	
}
