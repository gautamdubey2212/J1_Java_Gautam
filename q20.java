package Test;

class Man{
	int id;
	String name;
	double salary;
	String address;
	
	
	@Override
	public String toString() {
		return "Man [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + ", "
				+ (address != null ? "address=" + address : "") + "]";
	}


	public Man(int id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	
	public void showInfo() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("salary:"+ salary);
		System.out.println("address:"+ address);
		System.out.println("=============");
	}
	

}

public class q20 {

	public static void main(String[] args) {
		Man ob = new Man(1, "Gautam", 45454.0, "Bov");
		ob.showInfo();
		System.out.println(ob);
		

	}

}
