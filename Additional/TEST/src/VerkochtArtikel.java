/**
 @author Elias De Hondt
 * 4/03/2023
 */
public class VerkochtArtikel {
    // Attributes
    private int aantal;
    private Menuitem menuitem;
    // Constructors
    public VerkochtArtikel(int aantal, Menuitem menuitem) {
        this.aantal = aantal;
        this.menuitem = menuitem;
    }
    // Methods
    public void verhoogVerkoop(int verkochtAantal) {
        this.aantal += verkochtAantal;
    }
    public void resetAantal() {
        this.aantal = 0;
    }
    public String getNaam() {
        return this.menuitem.getNaam();
    }
    public int getAantal() {
        return this.aantal;
    }
    public Menuitem getMenuitem() {
        return this.menuitem;
    }
}