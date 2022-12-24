package klassement.archiefstukken;

import java.time.LocalDateTime;

public class Kaart extends Archiefstuk {
    public Kaart() {
        super(LocalDateTime.now());
    }
    public String hoortIn() {
        return "KokerType";
    }
}