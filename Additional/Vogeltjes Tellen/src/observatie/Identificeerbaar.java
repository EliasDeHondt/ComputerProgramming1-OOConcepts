package observatie;

import java.time.LocalDate;

/**
 * Van Elias De Hondt
 * 19/09/2022
 */
public interface Identificeerbaar {
    String getRingInfo();
    default LocalDate getRingDatum() {
        return LocalDate.now();
    }
}
