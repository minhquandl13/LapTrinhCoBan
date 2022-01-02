package Exercise4_4;

public class Dot extends AShape {

    public Dot(CartPointer cartPointerLocation) {
        super(cartPointerLocation);
    }

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public double distanceToO() {
        return this.cartPointerLocation.distanceToO();
    }

    @Override
    public boolean contains(CartPointer point) {
        return this.cartPointerLocation.distanceTo(point) == 0.0;
    }

    @Override
    public Square boundingBox() {
        return new Square(this.cartPointerLocation, 0);
    }

    @Override
    public Rectangle boundingBox1() {
        return new Rectangle(this.cartPointerLocation, 0, 0);
    }

    @Override
    public double perimeter() {
        return 1.0;
    }
}