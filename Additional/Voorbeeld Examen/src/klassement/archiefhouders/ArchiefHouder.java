package klassement.archiefhouders;

import klassement.archiefstukken.Archiefstuk;

public interface ArchiefHouder {
    enum Soort {
        DoosType, KokerType
    }
    // hier aanvullen
    double getVolume();
    default double getVullingsgraad() {
        return 1;
    }
    boolean isVol();
    void stockeren(Archiefstuk archiefstuk);
}
