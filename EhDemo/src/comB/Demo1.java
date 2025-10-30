package comB;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		String name="Thanesh";
		System.out.println(name.length());
//		name= null ;							All are unChecked / Run time exception ...!
//		System.out.println(name.length());		NullPointerException
		
//		String num="100A";						NumberFormatException
//		int n1=Integer.parseInt(num);
//		System.out.println(n1);
		
//		int arr[]= {4,2,3,4,5};
//		System.out.println(arr[6]);				ArrayIndexOutOfBoundsException
		
//		int c = 100/0;
//		System.out.println(c); 						ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Numer");
		int nu= sc.nextInt();					// InputMismatchException
		System.out.println(nu);
		
												// Checked Exceptions 
												//FilenotFounfException
												// SqlException 
												//IO exceptions 
//			2 ways 
//					1 ) Try Cacth finally 
//					2 ) Throws 
//						throw 
//			Excpetion : 
//						Pre Defined Excpetion : Checked / uncheck----------------------------- Coustom Excpetion  
	}
}
