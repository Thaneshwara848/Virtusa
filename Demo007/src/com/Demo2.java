package com;

public class Demo2 {
	public static void main(String[] args) {
		String a="raHul iS a traINer";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
		a.trim();
		System.out.println(a.trim().length());
		System.out.println(a.endsWith("Z"));
		System.out.println(a.startsWith("X"));
		String name1="Thanesh";
		String name2="thanesh";
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		
		System.out.println(name1.replace("Th", "M"));
		System.out.println(name1.isEmpty());
		System.out.println(name1.isBlank());
		String words[]=a.split(" ");
		
		
		for(String wd:words) {
			System.out.println(wd);
		}
		
		System.out.println("=============");
		int arr[]= {1,4,5,6,7,909,10};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		for(int x :arr) {
			System.out.println(x);
		}
	}
}
