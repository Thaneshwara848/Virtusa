package comCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
abstract class Emp
{
	 Scanner sc = new Scanner(System.in);
	 	int id;
	    String name;
	    int age; int salary ;
	    String desig;
	Emp(){
		System.out.print("ID : ");  id = sc.nextInt();
        System.out.print("Name : ");  name = sc.next();
        System.out.print("Age : ");  age = sc.nextInt();
	}
	void display() {
        System.out.println("===================");
        System.out.println("ID : "+ id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desig);
    }
	abstract void raiseSalary();
	
}
class Manager extends Emp{
    public Manager() {
    	  salary = 90000;
 	     desig="Manager"; 
    }
    void raiseSalary() {
    	salary= salary + 15000;
    }
}
class Clerk extends Emp{
    public Clerk() {
    	  salary = 30000;
 	     desig="Clerk"; 
    }
    void raiseSalary() {
    	salary= salary + 15000;
    }
}
class Developer extends Emp{
    public Developer() {
    	  salary = 80000;
 	     desig="Developer"; 
    }
    void raiseSalary() {
    	salary= salary + 15000;
    }
}
class Tester extends Emp{
	public Tester() {
  	  salary = 50000;
	     desig="Tester"; 
	}
    void raiseSalary() {
    	salary= salary + 10000;
    }
}
public class Project {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch1,ch2,ch3,ch4=0;
       ArrayList<Emp> emp= new ArrayList<Emp>();
//		 LinkedList<Emp> emp= new LinkedList<Emp>();
//        HashSet<Emp> emp= new HashSet<Emp>();
        do{
            System.out.println("1)create");
            System.out.println("2)Display");
            System.out.println("3) Raise Salary ");
            System.out.println("4)exit");
            ch1=sc.nextInt();
            if(ch1==1){
            		do {
                        System.out.println("	1)Developer");
                        System.out.println("	2)Tester");
                        System.out.println("	3)Manager");
                        System.out.println("	4)Clerk");
                        System.out.println("	5)exit");
                        ch2=sc.nextInt();
                        if(ch2==1) {
                        	emp.add(new Developer());
                        }
                        if(ch2==2) {
                        	emp.add(new Tester());
                        }
                        if(ch2==3) {
                        	emp.add(new Manager());
                        }
                        if(ch2==4) {
                        	emp.add(new Clerk());
                        }
            		}while(ch2!=5);
            }
            if(ch1==2){
            		Iterator i =emp.iterator();
            		while(i.hasNext()) {
            			Emp e = (Emp)i.next();
            			e.display();
            			
            		}
            }
            if(ch1==3) {
            	Iterator i =emp.iterator();
        		while(i.hasNext()) {
        			Emp e = (Emp)i.next();
        			e.raiseSalary();
        		}
            }
            if(ch1==4){
            	System.out.println("Thank  you ");
            	System.exit(0);
            } 
    }while(ch1!=4);
  }
}