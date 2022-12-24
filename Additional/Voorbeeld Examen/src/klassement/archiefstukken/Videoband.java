package klassement.archiefstukken;

import java.time.LocalDateTime;

public class Videoband extends Archiefstuk {
    private final double lengte = 0.187;
    private final double breedte = 0.103;
    private final double hoogte = 0.025;
    public Videoband() {
        super(LocalDateTime.now());
    }
    public String hoortIn() {
        return "DoosType";
    }
    @Override
    public double getOmvang() {
        return this.lengte*this.breedte*this.hoogte;
    }
    @Override
    public int compareTo(Archiefstuk o) {
        return Double.compare(this.getOmvang(),this.getOmvang());
    }
}
