package Exercise4_4;

public interface IShape {
    /**
     * Compute area of shape
     * Example: <br/>
     * CartPointer cartPointerLocation = new CartPointer(4, 3);
     * <p>
     * IShape square = new Square(cartPointerLocation, 30); <br/>
     * square.area() --> area of square = 900
     *
     * @return area
     */
    double area();

    /**
     * is the given point is within the bounds of this shapes
     * Example: <br/>
     * CartPointer cartPointerLocation = new CartPointer(4, 3);
     * <p>
     * IShape square = new Square(cartPointerLocation, 30); <br/>
     * square.contains(cartPointerLocation) --> False
     *
     * @return true or false
     */
    boolean contains(CartPointer point);

    /**
     * Compute the distance of this shapes to the origin
     * Example: <br/>
     * CartPointer cartPointerLocation = new CartPointer(4, 3);
     * <p>
     * IShape square = new Square(cartPointerLocation, 30); <br/>
     * square.distanceToO() --> distance to O of square = 5.0
     *
     * @return distanceToO
     */
    double distanceToO();

    /**
     * Compute the bounding box for this shapes
     * Example: <br/>
     * CartPointer cartPointerLocation = new CartPointer(4, 3);
     * <p>
     * IShape square = new Square(cartPointerLocation, 30); <br/>
     * square.boundingBox()
     *
     * @return Square
     */
    Square boundingBox();

    /**
     * Compute the bounding box for this shapes
     * Example: <br/>
     * CartPointer cartPointerLocation = new CartPointer(4, 3);
     * <p>
     * IShape square = new Square(cartPointerLocation, 30); <br/>
     * square.perimeter() --> perimeter of square = 120.0
     *
     * @return perimeter
     */
    double perimeter();
}
