package Test;

class Emppojo{
	private int id;
	private String name;
	private double salary;
	
	
	@Override
	public String toString() {
		return "Emppojo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public Emppojo(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	

public class q10 {

	public static void main(String[] args) {
		
		Emppojo ob = new Emppojo(1, "Gautam", 45454.10);
		
		ob.setId(2);
		ob.setName("Aalok");
		ob.setSalary(78787.10);
		
		System.out.println(ob.getId());
		System.out.println(ob.getName());
		System.out.println(ob.getSalary());
		
		
	}
		
	}

}
