package Baitap2_6;

public class Quadratic {
    int a;
    int b;
    int c;

    /**
     * @param a
     * @param b
     * @param c
     */
    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Compute delta
     *
     * @return b * b - 4 * (a * c)
     * Example new Quadratic(2, 3, 4).delta() : 23.0
     */
    public double delta() {
        return this.b * this.b - 4 * (this.a * this.c);
    }

    /**
     * method consumes the coefficients a, b, and c of a quadratic equation.
     *
     * @return kind of Quadratic function
     * Example new Quadratic(2, 3, 4).whatKind() : "none"
     */
    public String whatKind() {
        double delta = this.delta();
        int a = this.a;

        if (a == 0) {
            return "degenerate";
        }

        if (delta < 0) {
            return "none";
        }

        if (delta == 0) {
            return "one solution";
        }

        return "two solution";
    }
}
