public class Demo {
    public static void main(String args[]) {
        Formula f = new Formula();
        f.set(14.26f, -1.22f, (float) (3.5*Math.pow(10, -2)));
        f.run();
        f.print();

        Calculator c = new Calculator(5, 0.01f, 0.01f, 0.01f);
        c.set(14.26f, -1.22f, (float) (3.5*Math.pow(10, -2)));
        c.calculate();
        c.print();
    }
}
