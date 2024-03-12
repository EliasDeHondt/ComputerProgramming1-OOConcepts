/**
 @author Elias De Hondt
 * 14/11/2022
 */
public enum Dag {
    MAANDAG(true),
    DINSDAG(true),
    WOENSDAG(true),
    DONDERDAG(true),
    VRIJDAG(true),
    ZATERDAG(false),
    ZONDAG(false);
    private boolean isWeekdag;
    private Dag(boolean isWeekdag) {
        this.isWeekdag = isWeekdag;
    }
    public boolean isWeekdag() { // Get... Maar ook niet.
        return isWeekdag;
    }
    public String getAfkorting() { // Get ...
        return name().substring(0,2);
    }
    @Override
    public String toString() {
        return String.format("%s (Dag %d), Weekdag = %b", this.name().toLowerCase(), this.ordinal()+1, isWeekdag());
    }
}
