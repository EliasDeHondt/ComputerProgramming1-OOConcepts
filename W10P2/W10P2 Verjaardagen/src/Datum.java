/**
 * Van Elias De Hondt
 * 8/12/2022
 */
public class Datum implements Comparable<Datum>{
    public enum Maand {
        // Attributen
        JANUARI(1), FEBRUARI(2), MAART(3), APRIL(4), MEI(5), JUNI(6), JULI(7), AUGUSTUS(8), SEPTEMBER(9), OKTOBER(10), NOVEMBER(11), DECEMBER(12);
        private int maandGetal;
        // Constructors
        Maand(int maand) {
            this.maandGetal = maand;
        }
        public int getMaandGetal() { // Get..
            return maandGetal;
        }
    }
    // Attributen
    private Maand maand;
    private int dag;
    // Constructors
    public Datum(int dag, Maand maand) {
        this.maand = maand;
        this.dag = dag;
    }
    // Methode
    public Maand getMaand() { // Get..
        return maand;
    }
    public int getDag() { // Get..
        return dag;
    }
    @Override
    public String toString() { // @Override van toString
        return String.format("%d %s",this.dag,this.maand);
    }
    @Override
    public int compareTo(Datum tempDatum) {
        if(this.maand == tempDatum.maand){
            return this.dag - tempDatum.dag;
        } else {
            return this.maand.getMaandGetal() - tempDatum.maand.getMaandGetal();
        }
    }
}
