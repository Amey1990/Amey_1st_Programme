package exceptionHandling;

import java.io.FileInputStream;

public class Test1 
	try{
	FileInputStream fis = new FileInputStream("D:/mno.txt");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

