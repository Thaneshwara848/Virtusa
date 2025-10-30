package comD;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {
	public static void main(String[] args) {
//		Hashtable map = new Hashtable();		// legacy class 
//		HashMap map = new HashMap(); // K-V , no dup ,+ no order
//		LinkedHashMap map = new LinkedHashMap();//no dup+ user order
		TreeMap map = new TreeMap();
		
		
		map.put(111, "Thanesh");
		map.put(555, "Rajesh");
		map.put(234, "Suresh");
		map.put(777, "Rakesh");
		map.put(777, "Ganesh");
		
		map.put(333, "Mahesh");
		map.put(444, "Ramesh");
		
		Set s  =map.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
