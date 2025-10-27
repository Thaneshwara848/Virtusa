package interfacesss;
interface I{
	//int a; // no constrcute to initilize
	int aa=100;
	public static final int speed=250;
//	I(){}
	void abc(); // by default abstract and public
	abstract void xyz();
	public abstract void atoz();
//	void display() {
//		System.out.println("withbody not allowed");
//	}
}
interface J 
{
	
}
interface K extends J , I
{
	// multiple inheritance 
}


public class Demo1 {
	public static void main(String[] args) {
		//I i = new I();
		System.out.println(I.speed);
		System.out.println(I.aa);
	}
}
