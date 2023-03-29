package vector;

class PairVect {
    Vector a, b;

    public PairVect(int n1, int n2, int n3, int n4, int n5, int n6) {
        a = new Vector(n1, n2, n3);
        b = new Vector(n4, n5, n6);
    }

    public PairVect(Vector a, Vector b) {
        this.a = a;
        this.b = b;
    }

    public Vector first() {
        return a;
    }

    public Vector second() {
        return b;
    }
}
