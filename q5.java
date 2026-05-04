package Test;

import java.util.Objects;

public class q5 implements Cloneable {
	
	int id;
	String name;
	double salary;
	
	
	
	@Override
	public String toString() {
		return "q5 [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}

	public q5(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("salary:"+ salary);
		System.out.println("=============");
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		q5 other = (q5) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public static void main(String[] args) {
		
		q5 ob = new q5(1, "Gautam", 45454.0);
		ob.showInfo();
		
		
	}
}
