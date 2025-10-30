package com;
abstract class  Bank
{
		abstract void roi() ;
		abstract void  Atm() ;
		void abc() {
			System.out.println("With body ? allowd : yes ");
		}
class Sbi extends Bank
{
	@Override
	void roi() {
		System.out.println("12 %");	
	}

	@Override
	void Atm() {
		System.out.println("Debit ");	
	}
}
class Axis extends Bank
{
	@Override
	void roi() {
		System.out.println("13 %");
	}

	@Override
	void Atm() {
		System.out.println("Both Debit and credit");
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Sbi s = new Sbi();s.roi(); s.Atm();
		Axis a = new Axis();a.roi();a.Atm();
	}
}
