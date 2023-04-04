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
	
	public static Natural sum(Natural a, Natural b) throws SumErr, ConstErr {
		// Check overflow.
		if (Integer.MAX_VALUE - a.value < b.value) {
			throw new SumErr("sum: Overflow !");
		}
		Natural n = new Natural(a.value + b.value);
		return n;
	}
	
	public static Natural diff(Natural a, Natural b) throws DiffErr, ConstErr {
		// Check si résultat négatif.
		if (a.value - b.value < 0) {
			throw new DiffErr("diff: Résultat négatif !");
		}
		Natural n = new Natural(a.value - b.value);
		return n;
	}
	
	public static Natural prod(Natural a, Natural b) throws ProdErr, ConstErr {
		// Check si overflow.
		if (Integer.MAX_VALUE / a.value < b.value) {
			throw new ProdErr("prod: Overflow !");
		}
		Natural n = new Natural(a.value * b.value);
		return n;
	}
}
