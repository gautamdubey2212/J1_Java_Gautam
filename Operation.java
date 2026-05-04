package CRUDCOLL;

import java.util.ArrayList;

interface Operation {
	
	public void addData(ArrayList<EmpPojo>arrayList);
	public void updateData(int id, String name, double salary);
	public void deleteData(int id);
	public void searchData(int id);
	public void showData();
	
	
	
	

	
}
