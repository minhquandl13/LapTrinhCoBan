package Exercise4_4;

public class Dot extends Shape {

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public double disstanceToO() {
        return this.cartPointerLocation.distanceToO();
    }

    @Override
    public boolean contains(CartPointer point) {
        return this.cartPointerLocation.distanceTo(point) == 0.0;
    }

    @Override
    public Square boudingBox() {
        return null;
    }
}