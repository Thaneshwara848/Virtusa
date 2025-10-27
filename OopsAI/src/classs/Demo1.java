package classs;
class A
{
	int a; // 0 
	A(){
		System.out.println("A()");
	}
	void abc() {
		System.out.println("With Body");
	}
}
class B
{
	
}
class C extends A , B 
{	
}

public class Demo1 {
	public static void main(String[] args) {
		
		A aa = new A();
		System.out.println(aa.a);
	}
}
