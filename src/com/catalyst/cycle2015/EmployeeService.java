package com.catalyst.cycle2015;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

//In this class I will use comparator to sort, because it is more expedient than bubble sort.  
//Many thanks to Kevin and Luke for their help on this!


public class EmployeeService {

	final Comparator<Employee> nameSort = new Comparator<Employee>() {
		public int compare(Employee employeeA, Employee employeeB) {
			String A = employeeA.getLastName().toUpperCase();
			String B = employeeB.getLastName().toUpperCase();
			return A.compareTo(B);
		}
	};

	final Comparator<Employee> deptSort = new Comparator<Employee>() {
		public int compare(Employee employeeA, Employee employeeB) {
			int eA = employeeA.getDepartment();
			int eB = employeeB.getDepartment();
			return eA - eB;
		}
	};

	final Comparator<Employee> dateSort = new Comparator<Employee>() {
		public int compare(Employee employeeA, Employee employeeB) {
			String A = employeeA.getEmp_date();
			String B = employeeB.getEmp_date();
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate date1 = LocalDate.parse(A, dateFormat);
			LocalDate date2 = LocalDate.parse(B, dateFormat);
			return date1.compareTo(date2);
		}
	};

	public void sortByDept(ArrayList<Employee> employeeRecords) {
		employeeRecords.sort(deptSort);
		System.out.println(employeeRecords);

	}

	/**
	 * Rearrange the elements in the list based on their Firstname
	 * 
	 * @param employeeRecords
	 */
	public void sortByName(ArrayList<Employee> employeeRecords) {

		employeeRecords.sort(nameSort);
		System.out.println(employeeRecords);

	}

	/**
	 * Rearrange the elements in the list based on their Employment date. Newest
	 * employees at the bottom.
	 * 
	 * @param employeeRecords
	 */
	public void sortByEmploymentDate(ArrayList<Employee> employeeRecords) {
		 employeeRecords.sort(dateSort);
		 System.out.println(employeeRecords);

	}

}
