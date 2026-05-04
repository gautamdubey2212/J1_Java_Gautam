package CRUDCOLL;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		EmpPojo empPojo1 = new EmpPojo(1, "Gautam", 145454.00);
		EmpPojo empPojo2 = new EmpPojo(2, "Sunit", 245454.00);
		EmpPojo empPojo3 = new EmpPojo(3, "Ashok", 345454.00);
		EmpPojo empPojo4 = new EmpPojo(4, "Harshal", 445454.00);
		
		
		ArrayList<EmpPojo> al = new ArrayList<EmpPojo>();
		
		al.add(empPojo1);
		al.add(empPojo2);
		al.add(empPojo3);
		al.add(empPojo4);
		
		OperationImp ob = new OperationImp();
		
		ob.addData(al);
		ob.updateData(3, "santosh", 800000);
		ob.deleteData(3);
		ob.showData();
		ob.searchData(3);
		
		
		

	}

}
