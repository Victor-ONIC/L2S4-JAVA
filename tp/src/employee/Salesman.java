package employee;

public class Salesman extends Employee {
	static double totalTurnover;
	double turnover;
	
	public Salesman() {}
	
	// TODO DELETE: ce constructeur ne sert qu'aux tests.
	public Salesman(String name, int hours, double rate, double turnover) {
		super(name, hours, rate);
		this.turnover = turnover;
		totalTurnover += turnover;
	}
	//
	
	public double getSalary() {
		double salary = super.getSalary();
		return salary + 0.01 * turnover;
	}
}
