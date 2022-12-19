package Table2;

import Interface.Persistent;
import Table1.Patiënt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 15/12/2022
 */
public class Huisartsen implements Persistent {
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
    @Override
    public void bewaar(String bestandsnaam) {
        try {
            Formatter formatter = new Formatter(bestandsnaam);
            for (int i = 0; i < this.artsen.size(); i++) {
                formatter.format("%d;%s\n",this.artsen.get(i).getId(),this.artsen.get(i).getNaam());
            }
            formatter.close();
        } catch (IOException e) {
            System.out.println("Specify a correct path and also a correct file name with the correct extension.\nFor example: data/huisartsen.csv");
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
                Huisarts huisarts = new Huisarts(regelData[1]);
                huisarts.setId(id);
                this.insert(huisarts);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found.\nFor example: data/huisartsen.csv");
        }
    }
    @Override
    public String toString() { // @Override van toString
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < this.artsen.size(); i++) {
            newString.append(String.format("%d | %s\n",this.artsen.get(i).getId(),this.artsen.get(i).getNaam()));
        }
        return newString.toString();
    }
}
