package Exercise4_3;

public class Limos extends MetropolitanTransportation {
    public double length;
    public double height;

    /**
     * @param wheel           wheel
     * @param numberOfWindows numberOfWindows
     * @param length          length
     * @param height          height
     */

    public Limos(int wheel, int numberOfWindows,
                 double length, double height) {
        super(wheel, numberOfWindows);
        this.length = length;
        this.height = height;
    }
}
