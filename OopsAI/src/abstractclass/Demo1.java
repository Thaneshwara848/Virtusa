package abstractclass;
abstract class A
{
	int a; 
	A(){
		System.out.println("A()");
	}
	void abc() {
		System.out.println("With Body");
	}
	abstract void xyz() ;// hide the body/ implementation
}
class B
{
	
}
class C extends A, B
{	
}
public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
	}
}
