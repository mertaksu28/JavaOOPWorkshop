package domain;

public class Director extends Manager {

	protected int bonus;

	public Director(int no, String name, int year, String department, int bonus) {
		super(no, name, year, department);
		this.bonus = bonus;

	}

	@Override
	public double calculateSalary() {
		salary = bonus + super.calculateSalary();
		return salary;
	}

	public void work() {
		System.out.println("Director " + name + " is working.");
		manage();
	}

	public void manage() {
		System.out.println("Director " + name + " is managing.");
		makeAStrategicPlan();
	}

	public void makeAStrategicPlan() {
		System.out.println("Director " + name + " is a makeing plan.");
	}

}
