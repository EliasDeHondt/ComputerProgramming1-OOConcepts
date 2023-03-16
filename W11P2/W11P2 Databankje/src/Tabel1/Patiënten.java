package Tabel1;

import java.util.*;

/**
 @author Van Elias De Hondt
 * 15/12/2022
 */
public class Patiënten {
    // Attributes
    private static int volgendeld = 0;
    private Map<Integer,Patiënt> patiënten;
    // Constructors
    public Patiënten() {
        this.patiënten = new HashMap<>();
    }
    // Methods
    public void insert(Patiënt patiënt) {
        patiënt.setId(volgendeld);
        this.patiënten.put(volgendeld,patiënt);
        volgendeld +=1;
    }
    public boolean delete(int id) {
        for (int i = 0; i <= volgendeld; i++) {
            if (this.patiënten.get(i).getId() == id) {
                this.patiënten.remove(i,this.patiënten.get(i));
                return true;
            }
        }
        return false;
    }
    public Patiënt findById(int id) {
        for (int i = 0; i <= volgendeld; i++) {
            if (patiënten.get(i).getId() == id) {
                return this.patiënten.get(i);
            }
        }
        return null;
    }
    public Set<Patiënt> findByHuisarts(int id) {
        Set<Patiënt> tempList = new HashSet<>();
        for (int i = 0; i < volgendeld; i++) {
            if (this.patiënten.get(i).getHuisartsid() == id) {
                tempList.add(this.patiënten.get(i));
            }
        }
        return tempList;
    }
}
