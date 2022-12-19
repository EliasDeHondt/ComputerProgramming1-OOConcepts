import java.time.LocalDate;

/**
 * Van Elias De Hondt
 * 17/11/2022
 */
public class Ramadan {
    public static void main(String[] args) {

        // Print.
        System.out.println("Dit programma schat dat de Ramadan op volgende datums zal starten:");

        // Maken van LocalDate "ramadan".
        LocalDate ramadan = LocalDate.of(2022,4,2);

        // For.
        for (int i = 0; i < 3; i++) {
            ramadan = ramadan.plusDays((int)(29.53 * 12));
            System.out.println(ramadan);
        }
    }
}
