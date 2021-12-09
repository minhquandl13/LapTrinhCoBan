package Exercise4_4;

public class CartPointer {
    public int x;
    public int y;

    public CartPointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToO() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public CartPointer translate(int dx, int dy) {
        return new CartPointer(this.x + dx, this.y + dy);
    }

    public double distanceTo(CartPointer point) {
        double diffX = this.x - point.x;
        double diffY = this.y - point.y;

        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
