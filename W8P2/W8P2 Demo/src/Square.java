import geometry.Rectangle;

/**
 * @author Van Elias De Hondt
 * 21/11/2022
 */
public class Square extends Rectangle {
    // Attribuut
    private int side;
    // Constructors
    public Square() {
        // super();
    }
    public Square(int x,int y, int side) {
        super(x,y,side,side);
        this.side = side;
    }
    // Methode
    public void setSide(int side) { // Set..
        this.side = side;
        super.setHeight(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(int width) { // Set..
        setSide(width);
    }
    @Override
    public void setHeight(int height) { // Set..
        setSide(height);
    }
    // @Override van equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square square)) return false;

        return side == square.side;
    }
    // @Override van hashCode
    @Override
    public int hashCode() {
        return side;
    }
    // @Override van toString
    @Override
    public String toString() { // toString
        return String.format("Square (x = %d y = %d side = %d)",
                super.getX(),super.getY(),this.side);
    }
//    // @Override van equals
//    @Override
//    public boolean equals(Object object) {
//        Square other = (Square)object;
//        if (this.side == other.side) return true;
//        return false;
//    }
//    // @Override van hashCode
//    @Override
//    public int hashCode() {
//        return side;
//    }
}
