package Exercise4_3;

public class Cars extends MetropolitanTransportation {
    public String type;
    public int numberOfChair;

    /**
     * @param wheel           wheel
     * @param numberOfWindows numberOfWindows
     * @param type            type
     * @param numberOfChair   numberOfChair
     */

    public Cars(int wheel, int numberOfWindows,
                String type, int numberOfChair) {
        super(wheel, numberOfWindows);
        this.type = type;
        this.numberOfChair = numberOfChair;
    }
}
