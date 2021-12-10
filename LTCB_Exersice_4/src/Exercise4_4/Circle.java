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
    public double distanceToO() {
        return this.cartPointerLocation.distanceToO();
    }

    @Override
    public boolean contains(CartPointer point) {
        return this.cartPointerLocation.distanceTo(point) <= this.radius;
    }

    @Override
    public Square boundingBox() {
        return new Square(this.cartPointerLocation.translate(
                - this.radius, - this.radius), this.radius * 2);
    }

    @Override
    public Rectangle boundingBox1() {
        return null;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
