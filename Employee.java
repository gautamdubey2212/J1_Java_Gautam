package Containmet;

class Address{
	String Address1;
	String Address2;
	
	
	@Override
	public String toString() {
		return "Address [" + (Address1 != null ? "Address1=" + Address1 + ", " : "")
				+ (Address2 != null ? "Address2=" + Address2 : "") + "]";
	}


	public Address(String address1, String address2) {
		super();
		Address1 = address1;
		Address2 = address2;
	}
	
}


class Hobby{
	String Hobby1;
	String Hobby2;
	
	
	@Override
	public String toString() {
		return "Hobby [" + (Hobby1 != null ? "Hobby1=" + Hobby1 + ", " : "")
				+ (Hobby2 != null ? "Hobby2=" + Hobby2 : "") + "]";
	}


	public Hobby(String hobby1, String hobby2) {
		super();
		Hobby1 = hobby1;
		Hobby2 = hobby2;
	}
}


public class Employee {
int id;
String name;
Address address;
Hobby hobby;


	@Override
public String toString() {
	return "Employee [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
			+ (address != null ? "address=" + address + ", " : "") + (hobby != null ? "hobby=" + hobby : "") + "]";
}

	

	public Employee(int id, String name, Address address, Hobby hobby) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobby = hobby;
	}
	
	
	public void showInfo() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("address:"+ address);
		System.out.println("hobby:"+ hobby);
		System.out.println("--------------");
	}



	public static void main(String[] args) {
		Address address = new Address("Up", "UK");
		Hobby hobby = new Hobby("swimming", "cycling");
		
		Employee ob = new Employee(1, "Gautam", address, hobby);
		ob.showInfo();
		
		System.out.println(ob);

	}

}
