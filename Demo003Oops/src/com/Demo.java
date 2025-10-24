package com;

// Aquring the proprty from parent to child 
// WE can re use agin and again ...!

// parent--------- super  ----------- base class 
class A
{
	int a =100;
	int b =200;
	void m1() {
		System.out.println(a + b);
	}
}


// child -------- sub -------------- derived 
class B extends A
{
//	int a =100; a var is in A class , we have to aquri that property ....! ? we have to extendsthe A class 
	int b =200;
	int c = 300;
	void m1() {
		System.out.println(a + c);
	}
}
public class Demo {

	public static void main(String[] args) {
		

		A a = new A();
		a.m1();
		
		B b = new B();
		b.m1();
	}

}
