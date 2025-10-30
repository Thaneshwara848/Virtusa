package com;

public class Demo1 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,235,6,71,12,34};
							// 71  ? 
							// sort 
							// search 
							// sort and revsers 
							// empty 
							// remove 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("============ For each==========");
		for(int x : arr) {
			System.out.println(x);
		}
		System.out.println("===========");
		int ar[]= new int[4];
		ar[0]=000;
		ar[1]=111;
		ar[2]=222;
		//ar[3]=333;	array have fixed ins size 
		//ar[3]="Thanesh"; Array is Homoginus 
		for(int x : ar) {
			System.out.println(x);
		}
	}
}
