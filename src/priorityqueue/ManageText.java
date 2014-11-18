package priorityqueue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class ManageText 
{
	
	public String[] readScript(String scriptFilePath)
	{
		String instruction;
		String info2 ="";
		String[] splitedInstruction;
		try
		{
			FileInputStream fis2 = new FileInputStream(scriptFilePath);
    		InputStreamReader isr2 = new InputStreamReader(fis2);
    		BufferedReader br2 = new BufferedReader(isr2);
    		while((instruction = br2.readLine()) != null)
    		{
    			//System.out.println(instruction);
    			info2 += instruction + " ";
    		}
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		splitedInstruction = info2.split("\n");
		return splitedInstruction;
		
	}
	public String[] readInput(String inputFilePath) 
	{
		String info = "";
		String data;
		String[] splitedData;
		File input = new File(inputFilePath);
		try
		{
			FileInputStream fis = new FileInputStream(inputFilePath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			while((data = br.readLine())!= null)
    		{
    			info += data;
    		}
			br.close();
			
			
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		
		splitedData = info.split(" ");
		return splitedData ;
	}
	
	public void determineMethod(String methodName, BTreeHeap heap,Node root)
	{//determine a method in BTreeHeap.java by a given method name as a string.
		//Node root;
		root = heap.getRoot();
		if(methodName.equalsIgnoreCase("deleteMin"))
		{
			heap.deleteMin(root);
			
		}
		else if(methodName.equalsIgnoreCase("deceseKey"))
		{
			heap.decreaseKey(root,int , int);
		}
		else if(methodName.equalsIgnoreCase("increaseKey"))
		{	
				
		}
		else if(methodName.equalsIgnoreCase("delete"))
		{//somehow get postion p.
			heap.delete(root, p)
		}
		
		
		
	}
	
		
}
