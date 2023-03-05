public class Calculator {
    private int size;
    private float xstep, ystep, zstep, xstart, ystart, zstart;
    private float[] arr;

    public Calculator(int size, float xstep, float ystep, float zstep) {

        this.size = size;
        this.xstep = xstep;
        this.ystep = ystep;
        this.zstep = zstep;
        this.arr = new float[size];
    }

    void set(float x, float y, float z) {
        xstart = x;
        ystart = y;
        zstart = z;
    }

    void calculate() {
        for(int i = 0; i < arr.length; i++) {
            Formula f = new Formula();
            f.set(xstart, ystart, zstart);
            f.run();
            arr[i] = f.get_t();
            xstart += xstep;
            ystart += ystep;
            zstart += zstep;
        }
    }
    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + "F(x, y, z) = " + arr[i]);
        }
    }
}
