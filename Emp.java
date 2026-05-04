package ObjectIteration;

import java.util.ArrayList;

public class Emp {
	int id;
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}

	
	
	
	public Emp(int id, String name, double salary) {
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
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		
		Emp ob1 = new Emp(1, "ALexander", 45454.10);
		Emp ob2 = new Emp(2, "Gatsby", 45454.10);
		Emp ob3 = new Emp(3, "Gautam", 45454.10);
		Emp ob4 = new Emp(4, "Harshal", 45454.10);
		
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		al.add(ob4);
		
		for (Emp emp : al) {
			emp.displayInfo();
		}
		

	}

}
