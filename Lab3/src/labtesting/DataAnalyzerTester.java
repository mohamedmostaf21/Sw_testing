package labtesting;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Vector;
import org.junit.Test;
public class DataAnalyzerTester {
	@Test
	public void DataAnalyzerTest1()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(5);
        data.add(12);
        data.add(31);
        data.add(45);
        data.add(121);
        data.add(4);
		when(fileHandler.GetData()).thenReturn(data);
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		assertEquals(4, dataAnalyzer.GetMin());
	}
	@Test
	public void DataAnalyzerTest2()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(5);
        data.add(12);
        data.add(31);
        data.add(45);
        data.add(121);
        data.add(4);	
		when(fileHandler.GetData()).thenReturn(data);
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		assertEquals(121, dataAnalyzer.GetMax());
	}
	@Test
	public void DataAnalyzerTest3()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(5);
        data.add(12);
        data.add(31);
        data.add(45);
        data.add(121);
        data.add(4);
		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		int sum = 0;
        
		int size = data.get(0);
        
        // Calculate the sum of all integers
        for(int i = 1; i <= size; i++)
        {
        	sum += data.get(i);
        }

        
		int expected = sum / size;
		
		assertEquals(expected, dataAnalyzer.GetAverage());
	}
	
	@Test
	public void DataAnalyzerTest4()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(5);
        data.add(-12);
        data.add(31);
        data.add(45);
        data.add(121);
        data.add(4);
		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		assertEquals(-12, dataAnalyzer.GetMin());
	}
	@Test
	public void DataAnalyzerTest5()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(5);
        data.add(-12);
        data.add(31);
        data.add(45);
        data.add(121);
        data.add(4);
		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		int sum = 0;
        
		int size = data.get(0);
        
        // Calculate the sum of all integers
        for(int i = 1; i <= size; i++)
        {
        	sum += data.get(i);
        }
		int expected = sum / size;
		assertEquals(expected, dataAnalyzer.GetAverage());
	}
	
	@Test
	public void DataAnalyzerTest6()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(2);
        data.add(-43);
        data.add(-42);

		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		assertEquals(-43, dataAnalyzer.GetMin());
	}
	
	@Test
	public void DataAnalyzerTest7()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(2);
        data.add(-43);
        data.add(-42);
		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		assertEquals(-42, dataAnalyzer.GetMax());
	}
	
	@Test
	public void DataAnalyzerTest8()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(2);
        data.add(-43);
        data.add(-42);
		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		int sum = 0;
        
		int size = data.get(0);
        
        // Calculate the sum of all integers
        for(int i = 1; i <= size; i++)
        {
        	sum += data.get(i);
        }

        
		int expected = sum / size;
		
		assertEquals(expected, dataAnalyzer.GetAverage());
	}
	
	@Test
	public void DataAnalyzerTest9()
	{	
		FileHandler fileHandler = mock(FileHandler.class);
		Vector<Integer> data = new Vector<Integer>();
		data.add(1);
        data.add(5);
        data.add(20);
		
		when(fileHandler.GetData()).thenReturn(data);
		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);
		
		assertEquals(Integer.MIN_VALUE, dataAnalyzer.GetMin());
		System.out.print(dataAnalyzer.GetMin());
	}
	
	@Test
	public void DataAnalyzerTest10()
	{
		
		FileHandler fileHandler = mock(FileHandler.class);	
		Vector<Integer> data = new Vector<Integer>();
		data.add(1);
        data.add(5);
        data.add(20);	
		when(fileHandler.GetData()).thenReturn(data);		
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);		
		assertEquals(Integer.MAX_VALUE, dataAnalyzer.GetMax());
		System.out.print(dataAnalyzer.GetMax());
	}
	@Test
	public void DataAnalyzerTest11()
	{
		FileHandler fileHandler = mock(FileHandler.class);
		
		Vector<Integer> data = new Vector<Integer>();
		data.add(1);
        data.add(5);
        data.add(20);
		
		when(fileHandler.GetData()).thenReturn(data);	
		DataAnalyzer dataAnalyzer = new DataAnalyzer(fileHandler);	
		assertEquals(0, dataAnalyzer.GetAverage());
		System.out.print(dataAnalyzer.GetAverage());
	}
}
