package Exercise4_4;

public interface IShape {

    double area();

    boolean contains(CartPointer point);

    double distanceToO();

    Square boundingBox();

    double perimeter();
}
