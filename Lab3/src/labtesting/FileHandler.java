package labtesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileHandler {	
	private String filePath;

	public FileHandler(String filePath)
	{
		this.filePath = filePath;
	}
	public Vector<Integer> GetData()
	{
		Vector<Integer> data = new Vector<>();
		try
		{
	        File file = new File(filePath);
	       	
			FileReader fileReader = new FileReader(file);
           
			BufferedReader br = new BufferedReader(fileReader);
           
			String fileContent = "";
   
			String line;
			while ((line = br.readLine()) != null)
			{
				fileContent = fileContent + line + "\n";
			}
			
			System.out.println(fileContent);
			br.close();
			
			String data_string = fileContent;
	        
	        // Split the string by newline characters
	        String[] lines = data_string.split("\\r?\\n");
	        
	        // Parse each line as an integer and add it to the vector
	        for (String data_line : lines) 
	        {
	        	try
	        	{
	        		int num = Integer.parseInt(data_line);
	                data.add(num);
	        	}
	        	catch (NumberFormatException e)
	        	{
	                // Handle if the line is not a valid integer
	                System.err.println("Invalid integer format\n" + data_line);
	        	}
            }
		 }
		catch (IOException e) 
		{
			System.err.println("Exception: " + e);
			  
        }
        return data;
	}
	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}
}