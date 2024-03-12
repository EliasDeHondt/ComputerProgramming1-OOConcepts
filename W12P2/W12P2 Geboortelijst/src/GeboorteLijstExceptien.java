/**
 @author Elias De Hondt
 * 20/12/2022
 */
public class GeboorteLijstExceptien extends Exception{
    // Constructors
    public GeboorteLijstExceptien() {
        super();
    }
    public GeboorteLijstExceptien(String message) {
        super(message);
    }
    public GeboorteLijstExceptien(Throwable cause) {
        super(cause);
    }
    public GeboorteLijstExceptien(String message, Throwable cause) {
        super(message, cause);
    }
}
