/**
 * Van Elias De Hondt
 * 28/11/2022
 */
public interface Scalable {
    static final double DUBBLE = 2.00;
    static final double HALF = 0.50;
    static final double QUART = 0.25;
    void scale(double percent);
    default void halfTheSize() {
        this.scale(HALF);
    }
    default void doubleTheSize() {
        this.scale(DUBBLE);
    }

}
