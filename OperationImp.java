package CRUDCOLL;

import java.util.ArrayList;
import java.util.Iterator;

public class OperationImp implements Operation {
	
	ArrayList<EmpPojo> db = new ArrayList<EmpPojo>();
	
	

	@Override
	public void addData(ArrayList<EmpPojo> arrayList) {
		db.addAll(arrayList);
		System.out.println("Data Added!!");
		
	}

	@Override
	public void updateData(int id, String name, double salary) {
		Iterator<EmpPojo> it = db.iterator();
		while (it.hasNext()) {
			EmpPojo empPojo = (EmpPojo) it.next();
			if (empPojo.getId()==id) {
				empPojo.setName(name);
				empPojo.setSalary(salary);
				System.out.println("Data has been updated!!");
			}
			
		}
		
	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> it = db.iterator();
		while (it.hasNext()) {
			EmpPojo empPojo = (EmpPojo) it.next();
			if (empPojo.getId()==id) {
				it.remove();
				System.out.println("Data has been Deleted!!");
			}
		}
		
	}

	@Override
	public void searchData(int id) {
		Iterator<EmpPojo> it = db.iterator();
		while (it.hasNext()) {
			EmpPojo empPojo = (EmpPojo) it.next();
			if (empPojo.getId()==id) {
				System.out.println("Data Found!!");
			}
		}
		
	}

	@Override
	public void showData() {
		Iterator<EmpPojo> it = db.iterator();
		while (it.hasNext()) {
			EmpPojo empPojo = (EmpPojo) it.next();
			System.out.println(empPojo);
			
		}
		
	}

	

}
