package Exercise4_4;

public abstract class AShape implements IShape {
    public CartPointer cartPointerLocation;

    public AShape(CartPointer cartPointerLocation) {
        this.cartPointerLocation = cartPointerLocation;
    }

    public abstract double area();

    public abstract boolean contains(CartPointer point);

    public abstract double distanceToO();

    public abstract Square boundingBox();

    public abstract Rectangle boundingBox1();

    public abstract double perimeter();
}
