package klassement.archiefstukken;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Boek extends Archiefstuk {
    private final int aantalPaginas;
    private final double lengte = 0.29;
    private final double breedte = 0.21;
    private double hoogte;
    public Boek() {
        super(LocalDateTime.now());
        Random random = new Random();
        this.aantalPaginas = random.nextInt(10,1010);
        this.berekenHoogten();
    }
    public int getAantalPaginas() {
        return aantalPaginas;
    }
    public void berekenHoogten() {
        this.hoogte = (this.aantalPaginas*0.004)+0.006;
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
    @Override
    public String toString() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("Boek (%s, %dp, %.2fm³)",myFormat.format(super.getArchiveringsDatum()),this.aantalPaginas,this.getOmvang());
    }
}
