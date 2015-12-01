package com.catalyst.cycle2015.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.catalyst.cycle2015.Employee;

public class CSVFileReader {

	private String inFileName;
	private static final String COMMA_DELIMITER = ",";

	public CSVFileReader() {
		this.inFileName = "csvfiles/employee.csv";
	}

	/**
	 * Reads from CSV file (text file values separated by comma or white space)
	 * store each row in an Employee object.
	 * 
	 * The first row of the CSV is the header information.
	 * 
	 */
	public ArrayList<Employee> parseCsvFile() {

		ArrayList<Employee> newRecord = new ArrayList<Employee>();
		try {
			String line = "";
			BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				String[] insert = line.split(COMMA_DELIMITER);
				if (insert.length > 0) {
					Employee employee = new Employee(Integer.parseInt(insert[0]), Integer.parseInt(insert[1]),
							insert[2], insert[3], insert[4], insert[5], insert[6], insert[7]);
					newRecord.add(employee);
				}
			}
			for (Employee employee : newRecord) {
				System.out.println(employee.toString());
			}
			fileReader.close();
		} catch (IOException e) {
			System.out.println("Error while closing fileReader");
			e.printStackTrace();
		}
		return newRecord;

	}

	/**
	 * @return the inFileName
	 */
	public String getInFileName() {
		return inFileName;
	}

	/**
	 * @param inFileName
	 *            the inFileName to set
	 */
	public void setInFileName(String inFileName) {
		this.inFileName = inFileName;
	}

	/**
	 * @return the commaDelimiter
	 */
	public static String getCommaDelimiter() {
		return COMMA_DELIMITER;
	}

}
