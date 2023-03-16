package Tabel2;

import java.util.*;

/**
 @author Van Elias De Hondt
 * 15/12/2022
 */
public class Huisartsen {
    // Attributes
    public static int volgendeld = 0;
    private Map<Integer, Huisarts> artsen;
    // Constructors
    public Huisartsen() {
        this.artsen = new HashMap<>();
    }
    // Methods
    public int getvolgendeld() {
        return volgendeld;
    }
    public void insert(Huisarts arts) {
        arts.setId(volgendeld);
        this.artsen.put(volgendeld,arts);
        volgendeld += 1;
    }
    public boolean delete(int id) {
        for (int i = 0; i <= volgendeld; i++) {
            if (this.artsen.get(i).getId() == id) {
                this.artsen.remove(i,this.artsen.get(i));
                return true;
            }
        }
        return false;
    }
    public Huisarts findById(int id) {
        for (int i = 0; i <= volgendeld; i++) {
            if (this.artsen.get(i).getId() == id) {
                return this.artsen.get(i);
            }
        }
        return null;
    }
}
