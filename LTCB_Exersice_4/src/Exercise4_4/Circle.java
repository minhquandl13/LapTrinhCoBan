package Exercise4_4;

public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double disstanceToO() {
        return this.cartPointerLocation.distanceToO();
    }

    @Override
    public boolean contains(CartPointer point) {
        return this.cartPointerLocation.distanceTo(point) <= this.radius;
    }

    @Override
    public Square boudingBox() {
        return null;
    }
}
