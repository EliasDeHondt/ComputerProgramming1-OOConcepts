package labyrint;

import static java.lang.String.format;

/**
 * Van Elias De Hondt
 * 17/10/2022
 */
public class Speler {

    // Canstante
    public final int MAX_BREEDTE = 20;
    public final int MAX_HOOGTE = 20;

    // Attributen
    private int levens;
    private String naam;
    private int x;
    private int y;

    // Constructor
    public Speler() { // Default constructor
        this("Onbekend");
    }
    public Speler(String naam) {
        this.naam = naam;
        this.levens = 3; // Bij het begin krijgt elke speler 3 levens.
        this.x = MAX_BREEDTE/2;
        this.y = MAX_HOOGTE/2;
    }

    // Methode
    public void setNaam(String naam) { // set ...
        if (!naam.isEmpty()) {
            this.naam = naam;
        }
    }
    public void setPositie(int x, int y) { // set ...
        if (this.x > 0 && this.x < MAX_BREEDTE) this.x = x;
        if (this.y > 0 && this.y < MAX_HOOGTE)this.y = y;
    }
    public String getNaam() { // get ...
        return this.naam;
    }
    public int getX() { // get ...
        return this.x;
    }
    public int getY() { // get ...
        return this.y;
    }
    public int getLevens() { // get ...
        return this.levens;
    }
    public void verplaats(int stapX, int stapY) { // get ...
        setPositie(this.x + stapX, this.y + stapY);
    }
    public void verpaats() {
        verplaats(+1, +1);
    }
    public void valAan() {
        if (this.levens > 0) levens--;
    }
    public boolean isDood() {
        return (levens <= 0);
    }

    @Override // @Override zortervoor dat Object.java niet mijn code overrede
    public String toString() {
        return format("Speler %s wandelt naar %d, %d en heeft %d levens", this.naam, this.x, this.y, this.levens);
        //return  " ";
    }
}
