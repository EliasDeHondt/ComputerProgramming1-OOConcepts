package klassement.archiefstukken;

import java.time.LocalDateTime;

public abstract class Archiefstuk implements Comparable<Archiefstuk> {
    private LocalDateTime archiveringsDatum;
    public Archiefstuk(LocalDateTime archiveringsDatum) {
        this.archiveringsDatum = archiveringsDatum;
    }
    public LocalDateTime getArchiveringsDatum() { // Get..
        return this.archiveringsDatum;
    }
    public abstract String hoortIn();
    public double getOmvang() {
        return 0;
    }
    @Override
    public int compareTo(Archiefstuk o) {
        return 0;
    }
}
