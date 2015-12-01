package com.catalyst.cycle2015;

import java.util.ArrayList;
import java.util.Scanner;
import com.catalyst.cycle2015.Employee;
import com.catalyst.cycle2015.fileIO.CSVFileWriter;
import com.catalyst.cycle2015.fileIO.CSVFileReader;

public class EmployeeController {

	private static CSVFileWriter fileWriter;
	private static EmployeeService employeeService;
	private static ArrayList<Employee> empRecords = null;

	/**
	 * processUserRequest based on user's selection calls the method to execute
	 * that choice Options are: R read in input from CSV file D display Employee
	 * info sorted by Department id
	 * 
	 */
	public static void main(String[] args) {

		fileWriter = new CSVFileWriter();
		employeeService = new EmployeeService();
		empRecords = new ArrayList<Employee>();
		start();

	}

	private static void start() {

		Scanner in = new Scanner(System.in);
		do {

			displayMenu();
			char userInput = ' ';
			userInput = in.next().charAt(0);

			switch (userInput) {

			case 'R':
				// reads existing file from console, stores in employee object
				CSVFileReader fileReader = new CSVFileReader();
				empRecords = fileReader.parseCsvFile();
				break;

			case 'D':
				// Sort Employees by Department
				employeeService.sortByDept(empRecords);
				fileWriter.write(empRecords);
				break;

			case 'S':
				// Sort employee's names alphabetically
				employeeService.sortByName(empRecords);
				fileWriter.write(empRecords);
				break;

			case 'C':
				// Sort by Employment Date
				employeeService.sortByEmploymentDate(empRecords);
				fileWriter.write(empRecords);
				break;

			case 'E':
				System.out.println("EXIT program");
				in.close();
				return;

			default:
				System.out.println("Invalid Input");

			}

		} while (true); // end loop to determine user's choice

	}

	/**
	 * Display menu of options
	 */
	public static void displayMenu() {

		String menu = "Please choose an option. \n " + "R: Read records from file. \n "
				+ "D: Sort Employees by Department \n " + "S: Sort Employees by Name (last, first) \n "
				+ "C: Sort Employees by Employee Tenure \n " + "E: Exit program \n ";

		System.out.println(menu);

	}

}
