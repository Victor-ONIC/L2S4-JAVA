package integer;

public class Program {
	public static void main(String[] args) {
		try {			
			Natural n = new Natural(6);
			Natural m = new Natural(9);
			
			Natural p = Natural.prod(n, m);
			System.out.println(p.getN());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
