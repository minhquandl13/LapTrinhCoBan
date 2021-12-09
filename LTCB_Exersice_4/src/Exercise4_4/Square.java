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
    public double disstanceToO() {
        return this.cartPointerLocation.distanceToO();
    }

    @Override
    public boolean contains(CartPointer point) {
        return false;
    }

    @Override
    public Square boudingBox() {
        return new Square(this.cartPointerLocation, this.size);
    }
}
