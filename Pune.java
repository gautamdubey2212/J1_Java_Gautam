package com.school.staff.Pune;

import com.school.staff.Teacher.salary.*;

public class Pune extends Sal {

	public static void main(String[] args) {
		Pune ob = new Pune();
		double result = ob.calculateSalary(80000, 10000);
		System.out.println("Sal:"+ result);
		

	}

}
