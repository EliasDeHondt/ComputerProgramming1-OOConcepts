package klassement;

import klassement.archiefhouders.ArchiefHouder;
import klassement.archiefhouders.Doos;
import klassement.archiefhouders.Koker;
import klassement.archiefstukken.Archiefstuk;
import klassement.archiefstukken.Boek;

import java.util.*;

public class Archief {
    public class Inventaris {
        public int gebruikteDozen() {
            return doosIndex;
        }
        public int gebruikteKokers() {
            return kokerIndex;
        }
    }
    private List<Doos> doosList;
    private List<Koker> kokerList;
    private int doosIndex;
    private int kokerIndex;
    public Archief() {
        this.doosIndex = 0;
        this.kokerIndex = 0;
    }
    private Inventaris getInventaris() {
        Inventaris inventaris = new Inventaris();
        return inventaris;
    }
    public Archief(int maxDozen, int maxKokers) {
        initialiseerArchief(maxDozen, maxKokers);
    }
    private void initialiseerArchief(int maxDozen, int maxKokers) {
        this.doosList = new ArrayList<>();
        this.kokerList = new ArrayList<>();
        for (int i = 0; i <= maxDozen; i++) {
            this.doosList.add(new Doos());
        }
        for (int i = 0; i <= maxKokers; i++) {
            this.kokerList.add(new Koker());
        }
    }
    public void stockeer(Archiefstuk archiefstuk) {
        Objects.requireNonNull(this.bepaalHouder(archiefstuk)).stockeren(archiefstuk);
    }
    private ArchiefHouder bepaalHouder(Archiefstuk archiefstuk) {
        if (this.doosIndex >= this.doosList.size()) throw new ArithmeticException("Archief: geen dozen meer beschikbaar");
        if (this.kokerIndex >= this.kokerList.size()) throw new ArithmeticException("Archief: geen kokers meer beschikbaar");

        if (archiefstuk.hoortIn().equals("DoosType")) {
            if (this.doosList.get(this.doosIndex).isVol()) {
                this.doosIndex++;
                return this.doosList.get(this.doosIndex);
            }
            if (this.doosList.get(this.doosIndex).getVullingsgraad()+archiefstuk.getOmvang() > this.doosList.get(this.doosIndex).getVolume()) {
                this.doosIndex++;
                return this.doosList.get(this.doosIndex);
            }
            return this.doosList.get(this.doosIndex);
        }

        if (archiefstuk.hoortIn().equals("KokerType")) {
            return this.kokerList.get(this.kokerIndex++);
        }

        return null;
    }
    public List<Boek> getSorteerdeBoeken() {
        List<Boek> alleBoeken = new ArrayList<>();
        for (Doos doos : this.doosList) {
            alleBoeken.addAll(doos.getBoeken());
        }
        alleBoeken.sort(new Comparator<Boek>() {
            @Override
            public int compare(Boek o1, Boek o2) {
                return o1.getAantalPaginas()-o2.getAantalPaginas();
            }
        });
        return alleBoeken;
    }
    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder();

        newString.append(String.format("""
                Inhoud archief:
                Aantal gebruikte dozen: %d
                Aantal gebruikte kokers: %d
                """,this.getInventaris().gebruikteDozen(),this.getInventaris().gebruikteKokers()));
        List<Boek> alleBoeken = this.getSorteerdeBoeken();
        for (Boek boek : alleBoeken) {
            newString.append(boek.toString()).append("\n");
        }
        return newString.toString();
    }
}
