/**
 @author Elias De Hondt
 * 20/12/2022
 */
public class GeschenkExceptien extends IllegalArgumentException {
    // Constructors
    public GeschenkExceptien() {
        super();
    }
    public GeschenkExceptien(String message) {
        super(message);
    }
    public GeschenkExceptien(Throwable cause) {
        super(cause);
    }
    public GeschenkExceptien(String message, Throwable cause) {
        super(message, cause);
    }
}
