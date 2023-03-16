/**
 * @author Elias De Hondt
 * 28/11/2022
 */
public final class Square extends Rectangle {
    private int side;

    public Square() {
//        super();
    }

    public Square(int x, int y, int side) {
        super(x, y, side, side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return String.format("SQUARE (x = %d, y = %d, side = %d)",
                super.getX(), super.getY(), side);
    }
    @Override
    public void scale(double percent) {
        this.side *= percent;
        super.setHeight(this.side);
        super.setWidth(this.side);
    }
}
