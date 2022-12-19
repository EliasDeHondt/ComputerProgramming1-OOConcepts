package wijnen;

import java.time.LocalDate;
import java.util.Objects;

/**
 * PEER opdracht
 * P2W2
 */
public class Wijn {
    private String naam;
    private String streek;
    private LocalDate oogstDatum;
    private double basisPrijs;

    public Wijn(String naam, String streek, LocalDate oogstDatum, double basisPrijs) {
        this.naam = naam;
        this.streek = streek;
        this.oogstDatum = oogstDatum;
        this.basisPrijs = basisPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public String getStreek() {
        return streek;
    }

    public LocalDate getOogstDatum() {
        return oogstDatum;
    }

    protected double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        return this.basisPrijs;
    }

    final String getKenmerken() {
        return String.format("Van %s, afkomstig uit %s",
                this.oogstDatum,this.streek);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wijn)) return false;

        Wijn wijn = (Wijn) o;

        return Objects.equals(naam, wijn.naam);
    }

    @Override
    public int hashCode() {
        return naam != null ? naam.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("%-60s € %.2f\n\t(%s)",
                this.naam,this.berekenPrijs(),this.getKenmerken());
    }
}
