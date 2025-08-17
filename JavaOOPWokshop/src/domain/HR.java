package domain;

public class HR {
	
	public void paySalary(Employee employee) {
		double salary = employee.calculateSalary();
		System.out.println("Paying: " + employee.getName() + "Salary: " + salary);
	}

}
