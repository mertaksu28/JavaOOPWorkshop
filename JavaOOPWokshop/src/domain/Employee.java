package domain;

public class Employee extends Object {

	protected int no;
	protected String name;
	protected double salary;
	protected int year;
	
	public static final int BASE_SALARY= 1000;


	public Employee(int no, String name, int year) {
		this.no = no;
		this.name = name;
		this.year = year;

	}

	public void work() {
		System.out.println("Employe " + name + " is working.");
	}

	public double calculateSalary() {
		salary = year * BASE_SALARY;
		return salary;
	}

	@Override
	public String toString() {
		String s = "****Employee info****\n";
		s = s + "No: " + no + "\n";
		s = s + "Name: " + name + "\n";
		s = s + "Year: " + year + "\n";
		calculateSalary();
		s = s + "Salary: " + salary + "\n";
		return s;
	}
	
	public String getName() {
		return name;
	}

}
