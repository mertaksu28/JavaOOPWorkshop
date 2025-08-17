package test;

import domain.Director;
import domain.Employee;
import domain.HR;
import domain.Manager;

public class Test {

	public static void main(String[] args) {

//		run1();
//		run2();
		run3();

	}

	private static void run1() {

		Employee e1 = new Employee(1, "Ali", 15);
		System.err.println(e1);
		var salary = e1.calculateSalary();
		System.out.println(salary);

		Manager m1 = new Manager(2, "Zeynep", 10, "Sales");
		System.out.println(m1);
		;
		System.out.println(salary);
		m1.manage();

		Director d1 = new Director(2, "Mahmut", 5, "Company", 20000);
		System.out.println(d1);
		salary = d1.calculateSalary();
		System.out.println(salary);
		d1.manage();
		d1.makeAStrategicPlan();

	}

	private static void run2() {

		Employee e = new Employee(1, "Ali", 15);
		System.err.println(e);
		var salary = e.calculateSalary();
		System.out.println(salary);

		e = new Manager(2, "Zeynep", 10, "Sales");
		System.out.println(e);
		System.out.println(salary);
//		m1.manage();

		e = new Director(2, "Mahmut", 5, "Company", 20000);
		System.out.println(e);
		salary = e.calculateSalary();
		System.out.println(salary);
//		d1.manage();
//		d1.makeAStrategicPlan();

	}

	private static void run3() {

		HR hr = new HR();

		Employee e = new Employee(1, "Ali", 15);
		hr.paySalary(e);

		e = new Manager(2, "Zeynep", 10, "Sales");
		hr.paySalary(e);

		e = new Director(2, "Mahmut", 5, "Company", 20000);
		hr.paySalary(e);
	}

}
