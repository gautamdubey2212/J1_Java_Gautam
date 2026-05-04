package com.hospital.staff.Nurse;

import com.hospital.staff.soctor.salary.Salary;

public class Nurse extends Salary{

	public static void main(String[] args) {
		Nurse ob = new Nurse();
		double result = ob.calculateSalary(50000, 10000);
		System.out.println("Salary:"+ result);

	}

}
