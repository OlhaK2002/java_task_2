public class Formula {
    private float x, y, z, t;
    void set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void run() {
        t = (float) ((2 * Math.cos(x - Math.PI / 6)) / (0.5 + Math.pow(Math.sin(y), 2)) * (1 + Math.pow(z, 2) / (3 - Math.pow(z, 2) / 5)));
    }
    float get_t() {
        return t;
    }
    void print() {
        System.out.println("For x = " + x + ", y = " + y + ", z = " + z + " f() = " + t);
    }
}
