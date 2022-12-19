import java.util.Objects;

/**
 * Van Elias De Hondt
 * 12/12/2022
 */
public class Girl implements Comparable<Girl>{
    // Attributes
    private String naam;
    private int leeftijd;
    // Constructors
    public Girl(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }
    // Methods
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Girl girl)) return false;
//
//        return Objects.equals(naam, girl.naam);
//    }
//    @Override
//    public int hashCode() {
//        return naam != null ? naam.hashCode() : 0;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Girl girl)) return false;
//
//        return leeftijd == girl.leeftijd;
//    }
//    @Override
//    public int hashCode() {
//        return leeftijd;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Girl girl)) return false;

        if (leeftijd != girl.leeftijd) return false;
        return Objects.equals(naam, girl.naam);
    }
    @Override
    public int hashCode() {
        int result = naam != null ? naam.hashCode() : 0;
        result = 31 * result + leeftijd;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %d",naam,leeftijd);
    }
    @Override
    public int compareTo(Girl o) {
        int vgl = this.naam.compareTo(o.naam);
        if (vgl == 0) {
            return this.leeftijd - o.leeftijd;
        }
        return vgl;
    }
}
