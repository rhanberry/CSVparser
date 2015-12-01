package com.catalyst.cycle2015.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.catalyst.cycle2015.Employee;

//This code is adapted from the javacodegeeks example on their website, 
//and from gracious assistance from Luke Dahlberg

public class CSVFileWriter {

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	// CSV file name
	public static String DESTINATION = "csvFiles/result.csv";
	// CSV file header
	private static final String FILE_HEADER = "employee num, department, firstName, lastName, address, city, state, emp_date";

	FileWriter fileWriter = null;

	// Opens new file
	public void openFile() {
		try {
			fileWriter = new FileWriter(DESTINATION);
		} catch (Exception e) {
			System.out.println("File error, file could not be opened");
		}
	}

	/**
	 * Write the list of employees to the file. Each row should be a separate
	 * employee.
	 * 
	 * @param employeeList
	 */
	public void write(ArrayList<Employee> employeeList) {

		try {
			openFile();

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a new Employee object list to the CSV file
			for (Employee employee : employeeList) {
				fileWriter.append(String.valueOf(employee.getEmployeeNum()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getDepartment()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getFirstName()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getLastName()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getAddress()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getCity()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getState()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getEmp_date()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");

		}
	}

	/**
	 * close file
	 */
	public void closeFile() {

		try {
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Error while closing file!!!");

		}

	}

}
