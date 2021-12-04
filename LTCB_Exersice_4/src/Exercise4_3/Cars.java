package Exercise4_3;

public class Cars extends MetropolitanTransportation {
    public String type;
    public int numberOfChair;

    public Cars(int wheel, int numberOfWindows,
                String type, int numberOfChair) {

        super(wheel, numberOfWindows);
        this.type = type;
        this.numberOfChair = numberOfChair;
    }
}
