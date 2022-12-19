package Table1;

import Interface.Persistent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Van Elias De Hondt
 * 15/12/2022
 */
public class Patiënten implements Persistent {
    // Attributes
    private static int volgendeld = 0;
    private Map<Integer, Patiënt> patiënten;
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
    @Override
    public void bewaar(String bestandsnaam) {
        try {
            Formatter formatter = new Formatter(bestandsnaam);
            for (int i = 0; i < this.patiënten.size(); i++) {
                formatter.format("%d;%s;%d\n",this.patiënten.get(i).getId(),this.patiënten.get(i).getNaam(),this.patiënten.get(i).getHuisartsid());
            }
            formatter.close();
        } catch (IOException e) {
            System.out.println("Specify a correct path and also a correct file name with the correct extension.\nFor example: data/patienten.csv");
        }
    }
    @Override
    public void lees(String bestandsnaam) {
        try {
            Scanner file = new Scanner(new File(bestandsnaam));
            while (file.hasNext()) {
                String regel = file.nextLine();
                String[] regelData = regel.split(";");
                int id = Integer.parseInt(regelData[0]);
                int huisartsid = Integer.parseInt(regelData[2]);
                Patiënt patiënt = new Patiënt(regelData[1]);
                patiënt.setId(id);
                patiënt.setHuisartsId(huisartsid);
                this.insert(patiënt);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found.\nFor example: data/patienten.csv");
        }
    }
    @Override
    public String toString() { // @Override van toString
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < this.patiënten.size(); i++) {
            newString.append(String.format("%d | %-20s | %d\n",this.patiënten.get(i).getId(),this.patiënten.get(i).getNaam(),this.patiënten.get(i).getHuisartsid()));
        }
        return newString.toString();
    }
}