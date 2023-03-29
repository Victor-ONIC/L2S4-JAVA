package employee;

public final class Director extends Employee {
	private static Director instance;
	
	private Director() {
		super();
	}
	
	public void init(String name, int hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	
	public double getSalary(Salesman[] s) {
		double salary = super.getSalary();
		
		salary += 0.004 * Salesman.totalTurnover;
		
		return salary;
	}
	
	// Singleton
	public static Director getInstance() {
		if (instance == null) {
			instance = new Director();
		}
		return instance;
	}
}
