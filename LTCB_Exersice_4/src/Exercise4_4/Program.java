package Exercise4_4;

public class Program {
    public static void main(String[] args) {

    }

    public interface IShape {
        double area();

        boolean contains(CartPointer point);

        double disstanceToO();
    }

    public abstract class Shape implements IShape {
        public double area() {
            return 0;
        }

        public boolean contains(CartPointer point) {
            return false;
        }

        public double distanceToO() {
            return 0;
        }

        abstract Square boudingBox();
    }
}
