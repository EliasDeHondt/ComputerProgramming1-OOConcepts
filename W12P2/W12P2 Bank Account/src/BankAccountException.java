import java.text.ParseException;

/**
 @author Elias De Hondt
 * 19/12/2022
 */
public class BankAccountException extends ParseException {
    /**
     * Constructs a ParseException with the specified detail message and
     * offset.
     * A detail message is a String that describes this particular exception.
     *
     * @param s           the detail message
     * @param errorOffset the position where the error is found while parsing.
     */
    public BankAccountException(String s, int errorOffset) {
        super(s, errorOffset);
    }
}
