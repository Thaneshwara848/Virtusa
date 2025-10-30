package comD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) {
	//LIST : it will allow the duplicate 
		
//		ArrayList al = new ArrayList();		// easy to search  but difficult to add / remove 
//		LinkedList al = new LinkedList();	// easy to add / remove  but difficult to Search
//		Vector al= new Vector();	1.0 version , leagecy class ( Old class with less methods)
//		Stack al = new Stack();		1.0 version , leagecy class ( Old class with less methods)
		//Set : no duplicate 
//		HashSet al = new HashSet();// no duplicate  + how about order ?  ramdoom order 
//		LinkedHashSet al = new LinkedHashSet(); // no dup + user enter order 
		TreeSet al = new TreeSet();	// no dup + soreted Order 
		al.add(124);
		al.add(456);
		al.add(124);
		al.add(456);
		
		al.add(777);
		al.add(333);
		al.add(999);
		al.add(453);
		
		Iterator i =al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
