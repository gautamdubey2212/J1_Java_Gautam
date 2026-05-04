package Test;

import java.lang.module.FindException;

class Emppp{
	int id;
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		return "Emppp [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}


	public Emppp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	protected void finalize()throws FindException{
		System.out.println("This is a finalize method");
	}
	
	
	
	
}




public class q19 {
	
	public static void main(String[] args) {
		Emppp ob = new Emppp(1, "Gautam", 45454.0);
		
		ob = null;
		System.gc();
		System.out.println(ob);
	}

}
