package domain;

public class Engineer extends Employee {

	protected String field;
	public final static int ENGINEERING_PAYMENT = 8000;

	public Engineer(int no, String name, int year, String field) {
		super(no, name, year);
		this.field = field;
	}
	
	public void work() {
		System.out.println("Engineer " + name + " is working on a project");
	}

	public double calculateSalary() {
		salary = year * 1000 + ENGINEERING_PAYMENT;
		return salary;
	}

}
