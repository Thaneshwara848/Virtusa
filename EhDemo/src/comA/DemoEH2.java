package comA;

import java.io.*;
class DemoEH2{
	public static void main(String args[])  throws FileNotFoundException
	{	
		m1();	
	}
	static void m1()  throws FileNotFoundException
	{
		m2();
		System.out.println("Hi M1 method");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("Hi M2 method");
	}
	static void m3()  throws FileNotFoundException
	{
	
		System.out.println("Hi M3 Method ...!");
		File f= new File("Thanesh.txt");
		FileReader fr = new FileReader(f);				
	}
	//4 
	// 1000 methods ? 	
	// throws : it is also used to handle the check exception
	// we musthave to propagate to the caller method 
	// better we can use the try and catch 
}