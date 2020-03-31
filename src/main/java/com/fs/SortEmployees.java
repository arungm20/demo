package com.fs;

import java.util.ArrayList;
import java.util.List;

public class SortEmployees {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1("aTestName", "dLastName", 1, "India");
		Employee1 e2 = new Employee1("aTestName", "pLastName", 2, "Germany");
		Employee1 e3 = new Employee1("kTestName", "sLastName", 3, "Netherlands");
		Employee1 e4 = new Employee1("dTestName", "zLastName", 4, "Poland");
		Employee1 e5 = new Employee1("CTestName", "DLastName", 4, "Belgium");
		Employee1 e6 = new Employee1("BTestName", "ALastName", 3, "Austria");
		Employee1 e7 = new Employee1("DTestName", "CLastName", 2, "Switzerland");

		List<Employee1> employee1s = new ArrayList<>();
		employee1s.add(e2);
		employee1s.add(e3);
		employee1s.add(e1);
		employee1s.add(e4);
		employee1s.add(e5);
		employee1s.add(e6);
		employee1s.add(e7);

		String[] sortingAttribute1 = { "firstName", "lastName" };
		sortAndPrintEmployees(employee1s, sortingAttribute1);

		String[] sortingAttribute2 = { "age", "country" };
		sortAndPrintEmployees(employee1s, sortingAttribute2);
		
		String[] sortingAttribute3 = { "age1" };
		sortAndPrintEmployees(employee1s, sortingAttribute3);


	}

	private static void sortAndPrintEmployees(List<Employee1> employee1s, String[] sortingAttributes) {

		for (String sortOn : sortingAttributes) {

			System.out.println("Sorting on : " + sortOn);
			
			switch(sortOn) {
			
			case "firstName":
				employee1s.stream().sorted((object1, object2) -> object1.getFirstName().compareTo(object2.getFirstName()))
				.forEach(employee -> System.out.println(employee.getFirstName() + "|" + employee.getLastName() + "|"
						+ employee.getAge() + "|" + employee.getCountry()));
				break;
				
			case "lastName":
				employee1s.stream().sorted((object1, object2) -> object1.getLastName().compareTo(object2.getLastName()))
				.forEach(employee -> System.out.println(employee.getFirstName() + "|" + employee.getLastName() + "|"
						+ employee.getAge() + "|" + employee.getCountry()));
				break;
				
			case "age":
				employee1s.stream().sorted((object1, object2) -> object1.getAge().compareTo(object2.getAge()))
				.forEach(employee -> System.out.println(employee.getFirstName() + "|" + employee.getLastName() + "|"
						+ employee.getAge() + "|" + employee.getCountry()));
				break;
				
			case "country":
				employee1s.stream().sorted((object1, object2) -> object1.getCountry().compareTo(object2.getCountry()))
				.forEach(employee -> System.out.println(employee.getFirstName() + "|" + employee.getLastName() + "|"
						+ employee.getAge() + "|" + employee.getCountry()));
				break;
				
			default:
				System.out.println("Invalid sort attribute");
			
			}


		}
	}

}
