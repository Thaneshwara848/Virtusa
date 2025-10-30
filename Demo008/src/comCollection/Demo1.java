package comCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
class Clerk1
{		
			// in collections we can add the different daty types also + object also 
}	
public class Demo1 {
	public static void main(String[] args) {
//		Collection 1) dynimic size ,
					//hetrogeinnus ,
					//ready made methods 
		ArrayList al = new ArrayList(4);
		al.add(100);
		al.add(400);
		al.add(222);
		al.add(999);
		al.add(56);
//		al.add("Thanesh");
//		al.add('A');
//		al.add(true);
//		al.add(10.5);
//		al.add(new Date());
//		al.add(new Clerk());
		System.out.println(al);
															// COllections as Freamwork (many of theing are ready made) 
		Iterator i =al.iterator();							// iterator
		while(i.hasNext()) {								// hasNext
			System.out.println(i.next());					// next
		}
		System.out.println("=======");
		System.out.println(" 999 "+ al.contains(999));		// contains 
		System.out.println("Is EMpty ? :"+al.isEmpty());	// isEmpty
		System.out.println(al.get(1));						// getIndex
		al.remove(1);										// remove 
		System.out.println(al);			
		Collections.sort(al);								// sort
		System.out.println(al);		
		Collections.reverse(al);							//reverse
		System.out.println(al);
		System.out.println("TOpest :"+ al.getFirst());		//gitFirst
		System.out.println("Lowest :"+ al.getLast());		// getLast
	}
}
