package vogels;

import java.util.Objects;

/**
 @author Elias De Hondt
 * 19/09/2022
 */
public class Vogel {
    private String naam;
    private Habitat habitat;
    public Vogel(String naam, Habitat habitat) {
        this.naam = naam;
        this.habitat = habitat;
    }
   public boolean isTrekker() {
       return this.getClass() == TrekVogel.class;
   }
    public String getNaam() { // Get..
        return this.naam;
    }
    public String verblijftIn() {
        return switch (this.habitat) {
            case BOS -> "Bot";
            case ZEE -> "Zee";
            case STAD -> "Stad";
            case TUIN -> "Tuin";
            case WEIDE -> "Weide";
            case MOERAS -> "Moeras"; // Staat niet in de PDF
            case ZOET_WATER -> "Zoet water";
        };
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Vogel vogel)) return false;

        return Objects.equals(naam, vogel.naam);
    }
    @Override
    public int hashCode() {
        return naam != null ? naam.hashCode() : 0;
    }
    @Override
    public String toString() {
        return String.format("%-20s habitat: ",this.naam);
    }

}
