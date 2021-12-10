package Exercise4_4;

public class Square extends Shape{
    public int size;

    public Square(CartPointer cartPointerLocation, int size) {
        super();
        this.size = size;
    }

    @Override
    public double area() {
        return this.size * this.size;
    }

    @Override
    public double distanceToO() {
        return this.cartPointerLocation.distanceToO();
    }

    // 4.4.1
    @Override
    public boolean contains(CartPointer point) {
        int thisX = this.cartPointerLocation.getX();
        int thisY = this.cartPointerLocation.getY();

        return ShapeUntils.between(point.getX(), thisX, thisX + this.size)
                && ShapeUntils.between(point.getY(), thisY, thisY + this.size);
    }

    @Override
    public Square boundingBox() {
        return new Square(this.cartPointerLocation, this.size);
    }

    @Override
    public Rectangle boundingBox1() {
        return new Rectangle(this.cartPointerLocation, 0 ,0);
    }

    @Override
    public double perimeter() {
        return 4 * this.size;
    }
}

