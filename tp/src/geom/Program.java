package geom;

public class Program {

	public static void main(String[] args) {
		Quadri q = new Quadri(1, 2, 3, 4);
		System.out.println(q.perimeter());
		
		Rectangle r = new Rectangle(3, 4);
		System.out.println(r.perimeter());
		
		Square s = new Square(4);
		System.out.println(s.perimeter());
	}

}
