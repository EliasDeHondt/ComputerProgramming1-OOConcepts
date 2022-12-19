/**
 * Van Elias De Hondt
 * 14/11/2022
 */
public enum KaartWaarde {
    AAS(1),
    TWEE(2),
    DRIE(3),
    VIER(4),
    VIJF(5),
    ZES(6),
    ZEVEN(7),
    ACHT(8),
    NEGEN(9),
    TIEN(10),
    BOER(10),
    DAME(10),
    HEER(10);
    private int waarden;
    private KaartWaarde(int waarden) {
        this.waarden = waarden;
    }
    public int getKaartWaarde() {
        return waarden;
    }
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
