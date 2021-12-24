package Exercise4_4;

// 4.4.1
public class Rectangle extends AShape {
    public int width;
    public int height;

    public Rectangle(CartPointer cartPointerLocation, int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Compute area of shape
     * Example: <br/>
     * IShape rectangle; = new Rectangle(cartPointer2, 30); <br/>
     * square.area()
     rectangle
     * @return area
     */
    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public boolean contains(CartPointer point) {
        int thisX = this.cartPointerLocation.getX();
        int thisY = this.cartPointerLocation.getY();

        return ShapeUntils.between(point.getX(), thisX, thisX + width)
                && ShapeUntils.between(point.getY(), thisY, thisY + this.height);
    }

    @Override
    public double distanceToO() {
        return super.distanceToO();
    }

    @Override
    public Square boundingBox() {
        return null;
    }

    @Override
    public Rectangle boundingBox1() {
        return new Rectangle(this.cartPointerLocation, this.width, this.height);
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }
}
