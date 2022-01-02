package Exercise4_3;

public class Subways extends MetropolitanTransportation {
    public double length;
    public int numberOfCarriages;

    /**
     * @param wheel             wheel
     * @param numberOfWindows   numberOfWindows
     * @param length            length
     * @param numberOfCarriages numberOfCarriages
     */

    public Subways(int wheel, int numberOfWindows,
                   double length, int numberOfCarriages) {
        super(wheel, numberOfWindows);
        this.length = length;
        this.numberOfCarriages = numberOfCarriages;
    }
}
