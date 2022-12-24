package klassement.archiefhouders;

import klassement.archiefstukken.Archiefstuk;
import klassement.archiefstukken.Kaart;

// gegeven, mag je wijzigen
public class Koker implements ArchiefHouder {
    private final double hoogte = 0.450;
    private final double straal = 0.25;
    private Kaart kaart;
    @Override
    public double getVolume() {
        return 2*Math.PI*(this.straal*2)*this.hoogte;
    }
    @Override
    public boolean isVol() {
        return false;
    }
    @Override
    public void stockeren(Archiefstuk archiefstuk) {
        this.kaart = (Kaart) archiefstuk;
    }
}

