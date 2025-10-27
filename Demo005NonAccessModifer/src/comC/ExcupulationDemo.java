package comC;
class Emp
{
	// hide the data members in single class : encupulation 
	// bindiing all the data mements in single : 
//		?  make all the variable as private , call them using setter , getter 
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	 
}
public class ExcupulationDemo {

	public static void main(String[] args) {
	
		Emp e = new Emp();
		e.setId(100);
		e.setName("Thanesh");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
