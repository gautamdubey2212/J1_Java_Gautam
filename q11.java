package Test;

class Add{
	void addSum(int a) {
		System.out.println(a);
	}
	
	void addSum(int a, int b) {
		System.out.println(a+b);
	}
	
	void addSum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

class Plus extends Add{

	@Override
	void addSum(int a) {
		// TODO Auto-generated method stub
		super.addSum(a);
	}

	@Override
	void addSum(int a, int b) {
		// TODO Auto-generated method stub
		super.addSum(a, b);
	}

	@Override
	void addSum(int a, int b, int c) {
		// TODO Auto-generated method stub
		super.addSum(a, b, c);
	}
	
	
	
	
}


public class q11 {
public static void main(String[] args) {
	
	Add ob = new Add();
	ob.addSum(100);
	ob.addSum(100, 200);
	ob.addSum(100, 2000, 30000);
	
	
	Plus obj = new Plus();
	obj.addSum(200);
	obj.addSum(600, 7000);
	obj.addSum(700, 8000, 5000);
	
}
}
