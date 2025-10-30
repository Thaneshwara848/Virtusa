package com;
abstract class A
{
	abstract void abc();// hiding the implemetaion
}
abstract class B extends A // if we extends any abstract class / interface , in wchild class we MUST have to over ride all the abstarct methods 
{
	@Override
	void abc() {
		System.out.println("Hi Abc method ");	
	}
	abstract void xyz();
	abstract void atoz();
}
class C  extends B
{
	@Override
	void xyz() {
		System.out.println("Hi XYZ method ");	
	}
	@Override
	void atoz() {
		System.out.println("Hi AToZ method ");	
	}
}
public class Demo1 {
		public static void main(String[] args) {
				//A a = new A();	 abstract class 
				//B b = new B(); no y ? bcz its a abstract 
				C c = new C();
				c.abc();
				c.xyz();
				c.atoz();
				
		}
}
