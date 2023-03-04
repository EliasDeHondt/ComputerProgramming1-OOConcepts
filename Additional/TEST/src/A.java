/**
 * Van Elias De Hondt
 * 4/03/2023
 */
public class A {
    // Attributes
    private final B b;
    private final C c;
    private int x;

    // Constructors
    public A() {
        this.b = new B();
        this.c = new C();
    }
    // Methods
    public void dox() {
        if (x < 10) this.b.calculate();
        else this.c.calculate();
    }
}
