/**
 @author Van Elias De Hondt
 * 24/11/2022
 */
public class Lijst {
    // Attributen
    private static final int MAX_CAPACITEIT = 100;
    private Object[] objectLijst ;
    private int aantal;
    // Constructors
    public Lijst() {
        objectLijst = new Object[MAX_CAPACITEIT];
        this.aantal = 0;
    }
    // Methode
    public boolean voegToe(Object newObject) {
        if (this.aantal <= MAX_CAPACITEIT) {
            this.objectLijst[this.aantal] = newObject;
            this.aantal++;
            return true;
        }
        else return false;
    }
    public Object zoek(int index) {
        return this.objectLijst[index];
    }
    public boolean zoek(Object zoekObject) {
//        if (zoekObject.getClass().isArray()) {
//            for (int i = 0; i < aantal; i++) {
//                int[] temp = (int[])zoekObject;
//                if (Arrays.equals(temp, objectLijst)) return true;
//            }
//        }
        for (int i = 0; i < aantal; i++) {
            if (objectLijst[i].equals(zoekObject)) return true;
        }
        return false;
    }
    public int getAantal() { // Get..
        return aantal;
    }
}
