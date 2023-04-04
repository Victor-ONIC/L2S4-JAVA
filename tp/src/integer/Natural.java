package integer;

public class Natural {
	int value;
	
	public Natural(int value) throws ConstErr {
		if (value < 0) {
			throw new ConstErr("Integer: valeur négative !");
		}
		
		this.value = value;
	}
	
	public int getN() {
		return value;
	}
	
	public static int sum(Natural a, Natural b) throws SumErr {
		// Check overflow.
		if (Integer.MAX_VALUE - a.value < b.value) {
			throw new SumErr("sum: Overflow !");
		}
		
		return a.value + b.value;
	}
	
	public static int diff(Natural a, Natural b) throws DiffErr {
		// Check si résultat négatif.
		if (a.value - b.value < 0) {
			throw new DiffErr("diff: Résultat négatif !");
		}
		
		return a.value - b.value;
	}
	
	public static int prod(Natural a, Natural b) throws ProdErr {
		// Check si overflow.
		if (Integer.MAX_VALUE / a.value < b.value) {
			throw new ProdErr("prod: Overflow !");
		}
		
		return a.value * b.value;
	}
}
