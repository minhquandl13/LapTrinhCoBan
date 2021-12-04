package Exercise4_3;

public class Buses extends MetropolitanTransportation {
    public double height;
    public double numberOfChair;

    public Buses(int wheel, int numberOfWindows,
                 double height, int numberOfChair) {

        super(wheel, numberOfWindows);
        this.height = height;
        this.numberOfChair = numberOfChair;
    }
}

