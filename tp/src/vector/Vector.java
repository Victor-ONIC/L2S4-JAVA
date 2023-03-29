package vector;

class Vector {
    static int vectorCount;
    int x, y, z;

    public Vector() {
        vectorCount++;
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector(int x, int y, int z) {
        vectorCount++;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // public void initialize(int x, int y, int z) {
    //     this.x = x;
    //     this.y = y;
    //     this.z = z;
    // }

    public void multiply(int n) {
        x *= n;
        y *= n;
        z *= n;
    }

    public void display() {
        // String output = "(" + "," + x + "," + y + "," + z + ")";
        // System.out.println(output);
        System.out.println(this.toString());
    }

    public int scalar(Vector other) {
        return x*other.x + y*other.y + z*other.z;
    }

    public Vector sum(Vector other) {
        return new Vector(x + other.x, y + other.y, z + other.z);
    }

    public static int getVectorCount() {
        return vectorCount;
    }

    public String toString() {
        return new String("(" + x + "," + y + "," + z + ")");
    }
    
    public static void swap(Vector v1, Vector v2) {
    	Vector tmp = new Vector(v1.x, v1.y, v1.z);
    	
    	v1.x = v2.x;
    	v1.y = v2.y;
    	v1.z = v2.z;
    	
    	v2.x = tmp.x;
    	v2.y = tmp.y;
    	v2.z = tmp.z;
    }
}
