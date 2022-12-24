package klassement.archiefhouders;

import klassement.archiefstukken.Archiefstuk;
import klassement.archiefstukken.Boek;

import java.util.ArrayList;
import java.util.List;

public class Doos implements ArchiefHouder {
    private final double lengte = 0.305;
    private final double breedte = 0.215;
    private final double hoogte = 0.110;
    private final List<Archiefstuk> archiefstukList;
    public Doos() {
        this.archiefstukList = new ArrayList<>();
    }
    public List<Boek> getBoeken() {
        List<Boek> boekList = new ArrayList<>();
        for (Archiefstuk archiefstuk : this.archiefstukList) {
            if (archiefstuk.getClass() == Boek.class) {
                boekList.add((Boek) archiefstuk);
            }
        }
        return boekList;
    }
    @Override
    public double getVolume() {
        return this.lengte*this.breedte*this.hoogte;
    }
    @Override
    public double getVullingsgraad() { // De totale omvang van de boeken en videobanden.
        double totaalOmvang = 0;
        for (Archiefstuk archiefstuk : this.archiefstukList) {
            totaalOmvang += archiefstuk.getOmvang();
        }
        return totaalOmvang;
    }
    @Override
    public boolean isVol() {
        // Dozen zijn vol wanneer zij een vullingsgraad hebben van meer dan 95% (maximum 100%).
        return this.getVullingsgraad() > (this.getVolume()/100)*95 && this.getVullingsgraad() < this.getVolume();
    }
    @Override
    public void stockeren(Archiefstuk archiefstuk) {
        this.archiefstukList.add(archiefstuk);
    }
}
