package labtesting;

import java.util.Vector;

public class DataAnalyzer {
	FileHandler fileHandler;
	public DataAnalyzer(FileHandler fileHandler)
	{
		this.fileHandler = fileHandler;
	}
	public int GetMin()
	{
		Vector<Integer> data = fileHandler.GetData();
        
        // Check if data is empty
        if (data.isEmpty())
        {
            System.err.println("No data available.");
            return Integer.MIN_VALUE; // Return some default value indicating no minimum
        }
         
        int size = data.get(0); 
        
        if(size != data.size() - 1)
        {
        	System.err.println("Error in data Given");
            return Integer.MIN_VALUE; // Return some default value indicating no minimum
        }
        
        int min = Integer.MAX_VALUE; // Initialize min value
        
        // Iterate through the vector to find the minimum value
        for (int i = 1; i <= size; i++) {
            int current = data.get(i);
            if (current < min) {
                min = current; // Update min if a smaller value is found
            }
        }  
        return min;
	}
	
	public int GetMax()
	{
		Vector<Integer> data = fileHandler.GetData();
        
        // Check if data is empty
        if (data.isEmpty())
        {
            System.err.println("No data available.");
            return Integer.MAX_VALUE; // Return some default value indicating no maximum
        }
        
        
        int size = data.get(0); 
        
        if(size != data.size() - 1)
        {
        	System.err.println("Error in data Given");
            return Integer.MAX_VALUE; // Return some default value indicating no maximum
        }
        
        int max = Integer.MIN_VALUE; // Initialize max value
        
        // Iterate through the vector to find the maximum value
        for (int i = 1; i <= size; i++) {
            int current = data.get(i);
            if (current > max) {
                max = current; // Update max if a greater value is found
            }
        }
        
        return max;
	}
	
	public int GetAverage()
	{
        Vector<Integer> data = fileHandler.GetData();
        
        // Check if data is empty
        if (data.isEmpty()) {
            System.err.println("No data available.");
            return 0; // Return 0 as default average when there's no data
        }
        
        int size = data.get(0);
        
        if(size != data.size() - 1)
        {
        	System.err.println("Error in data Given");
            return 0; // Return 0
        }
        
        int sum = 0;
        
        
        // Calculate the sum of all integers
        for(int i = 1; i <= size; i++)
        {
        	sum += data.get(i);
        }
        
        
        // Calculate the average
        int average = (int) sum / size;
        
        return average;
    }
}
