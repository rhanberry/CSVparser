package com.catalyst.cycle2015;

import java.time.format.DateTimeFormatter;

/**
 * This entity is used to identify a record (row) from the database table,
 * Employee
 */
public class Employee {

	private int employeeNum;
	private int department;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String emp_date;
	// used to format the Employee's start date to MM/dd/yyyy
	@SuppressWarnings("unused")
	private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");

	public Employee(int num, int dept, String fName, String lName, String addy, String cit, String st, String date) {

		this.employeeNum = num;
		this.department = dept;
		this.firstName = fName;
		this.lastName = lName;
		this.address = addy;
		this.city = cit;
		this.state = st;
		this.emp_date = date;
	}

	/**
	 * @return the employeeNum
	 */
	public int getEmployeeNum() {
		return employeeNum;
	}

	/**
	 * @param employeeNum
	 *            the employeeNum to set
	 */
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	/**
	 * @return the department
	 */
	public int getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(int department) {
		this.department = department;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the emp_date
	 */
	public String getEmp_date() {
		return emp_date;
	}

	/**
	 * @param emp_date
	 *            the emp_date to set
	 */
	public void setEmp_date(String emp_date) {
		this.emp_date = emp_date;
	}


	/**
	 * toString function displays all fields
	 */
	@Override
	public String toString() {
		System.out.println("Employee Number: " + this.employeeNum + ", Employee name: " + this.firstName + " "
				+ this.lastName + " Address: " + this.address + " " + this.city + " " + this.state + " Department ID: "
				+ this.department + " Start Date: " + this.emp_date);
		return null;

	}

}
