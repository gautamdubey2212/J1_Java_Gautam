package Test;


class A{
	 A get() {
		return A;
	}
}

class B extends A{
	B get() {
		return B;
	}
	
	protected void message() {
		System.out.println("welcome to the covariant return type ");
	}
}





public class Covariant {
	
	public static void main(String[] args) {
		B b = new B();
		b.get().message();

	}

}
