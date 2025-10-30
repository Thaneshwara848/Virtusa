package com;

public class StringDemo {
	public static void main(String[] args) {
		
		String name1="Thanesh";
		String name2="Thanesh";
		String name3="thanesh";
		String name4 = new String("Thanesh");
		String name5 = new String("Thanesh");
		
		System.out.println(name1==name2);	//true
		System.out.println(name1==name3);	//false  : t is a lower case 
		System.out.println(name1==name4);	//false  : both refrence is difference 
		System.out.println(name4==name5);	//false  : both refrence is difference 
		System.out.println(name4.equals(name5));//true  : it will check the content 
		
		// == will check the refrence 
		// . equals will check the contentt 
		
		
		
	}
}
