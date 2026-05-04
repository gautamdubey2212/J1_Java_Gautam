package ObjectIteration;

import java.util.Enumeration;
import java.util.Vector;

public class Employe {
	int id;
	String name;
	double salary;
	
	
	
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}

	

	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void dipslayInfo() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("salary:"+ salary);
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		Vector<Employe> vector = new Vector<Employe>();
		
		Employe ob1 = new Employe(1, "Gautam", 45454.0);
		Employe ob2 = new Employe(2, "Agastya", 45454.0);
		Employe ob3 = new Employe(3, "Adwik", 45454.0);
		Employe ob4 = new Employe(4, "Uttam", 45454.0);
		
		vector.add(ob1);
		vector.add(ob2);
		vector.add(ob3);
		vector.add(ob4);
		
		Enumeration<Employe> enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {
			Employe employe = (Employe) enumeration.nextElement();
			employe.dipslayInfo();
			
		}

	}

}
