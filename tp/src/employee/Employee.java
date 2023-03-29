package employee;

public class Employee {
	static double bonus = 100;  // Prime de 100€.
	String name;
	int hours;
	double rate;
	double extraPercentage = 1.25;  // ex: 125% = 1.25
	
	public Employee() {}
	
	// TODO DELETE: ce constructeur ne sert qu'aux tests.
	public Employee(String name, int hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	//
	
	public double getSalary() {
		double salary = 0;
		
		if (hours > 35) {
			int overtime = hours - 35;
			salary += extraPercentage * rate * overtime;
			salary += rate * 35;
			salary += bonus;
		} else {
			salary += rate * hours;
		}
		
		return salary;
	}
}
