package wijnen;

public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private Wijn[] wijnen = new Wijn[MAX_AANTAL];  //voorlopig gevuld met 10 null-objecten
    private String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public void voegWijnToe(Wijn wijn) {
        if (this.aantal <= this.wijnen.length) {

            if (this.zoekWijn(wijn)) {

                this.wijnen[this.aantal] = wijn;
                this.aantal++;
            }
        }
    }

    public boolean zoekWijn(Wijn wijn) {
        for (int i = 0; i < this.wijnen.length; i++) {
            if (wijn.equals(this.wijnen[i])) return true;
        }
        return false;
    }

    public Wijn getOudsteWijn() {
        if (this.aantal == 0) return null;
        int oudsteDatum = 2500;

        for (int i = 0; i < this.wijnen.length; i++) {
            if(this.wijnen[i].getOogstDatum().getYear() < oudsteDatum){
                oudsteDatum = this.wijnen[i].getOogstDatum().getYear();
            }
        }

        for (int i = 0; i < this.wijnen.length; i++) {
            if(this.wijnen[i].getOogstDatum().getYear() == oudsteDatum){
                return this.wijnen[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();

        return result.toString();
    }
}
