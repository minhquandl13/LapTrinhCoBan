package Exercise4_4;

public abstract class Shape implements IShape {
    public CartPointer cartPointerLocation;

    public double area() {
        return 0;
    }

    public boolean contains(CartPointer point) {
        return false;
    }

    public double distanceToO() {
        return 0;
    }

    public abstract Square boudingBox();
}
