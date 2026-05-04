package Test;

class Boss{
	int id;
	String name;
	
	
	@Override
	public String toString() {
		return "Boss [id=" + id + ", " + (name != null ? "name=" + name : "") + "]";
	}


	public Boss(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
	}
	
}

class Emp extends Boss{
	
	double salary;
	String address;
	
	public Emp(int id, String name, double salary, String address) {
		super(id, name);
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [salary=" + salary + ", " + (address != null ? "address=" + address : "") + "]";
	}

	@Override
	public void showInfo() {
		System.out.println("Thos is a super ");
		super.showInfo();
	}
		
}




public class q16 {

	public static void main(String[] args) {
		Emp ob = new Emp(1, "Suresh", 45450.0, "churchagte");
		ob.showInfo();

	}

}
