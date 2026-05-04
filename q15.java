package Test;


class Person{
	int id;
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + "]";
	}


	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public void showInfo() {
		System.out.println("id:"+ id);
		System.out.println("nanme:"+ name);
		System.out.println("salary:"+ salary);
		System.out.println("------------");
	}
	
}
public class q15 {
	
	public static void main(String[] args) {
		
		Person ob = new Person(1, "Gautam", 78787.00);
		ob.showInfo();
		System.out.println(ob);
	}

}
