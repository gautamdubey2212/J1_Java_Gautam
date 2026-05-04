package ObjectIteration;

import java.util.ArrayList;
import java.util.Iterator;

public class Empp {
	int id;
	String name;
	double salary;
	
	
	
	@Override
	public String toString() {
		return "Empp [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}
	
	

	public Empp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayInfo() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("salary:"+ salary);
		
		System.out.println("----------------");
	}
 

	public static void main(String[] args) {
		 
		ArrayList<Empp> al = new ArrayList<Empp>();
		
		Empp ob1 =  new Empp(1, "Gautam", 45454.0);
		Empp ob2 =  new Empp(2, "sunit", 45454.0);
		Empp ob3 =  new Empp(3, "Harshal", 45454.0);
		Empp ob4 =  new Empp(4, "Agastya", 45454.0);
		
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		al.add(ob4);
		
		Iterator<Empp> it = al.iterator();
		
		while (it.hasNext()) {
			Empp empp = (Empp) it.next();
			empp.displayInfo();
			
		}
		
		
		
		
		

}
}
