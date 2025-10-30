package comA;
interface Bank{
		public abstract void roi1();
		public abstract void  Atm1();
//		void abc() {
//			System.out.println("With body NOT allowd : yes ");
//		}
}
abstract class X{
	abstract void aaa();
}
//class Sbi extends Bank
class Sbi extends X implements Bank{
	@Override
	
	public void roi1() {
		System.out.println("12 %");	
	}
	@Override
	public void Atm1() {
		System.out.println("Debit ");
	}
	@Override
	void aaa() {
		System.out.println("hiiiiiiiiiii AAAA");
	}
}
class Axis implements Bank{
	@Override
	public void roi1() {
		System.out.println("13 %");
	}
	@Override
	public void Atm1() {
		System.out.println("Both Debit and credit");	
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Sbi s = new Sbi();s.roi1(); s.Atm1();
		Axis a = new Axis();a.roi1();a.Atm1();
	}
}
