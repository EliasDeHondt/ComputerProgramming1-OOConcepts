/**
 @author Van Elias De Hondt
 * 30/10/2022
 */
public class Beeldscherm {
    // Attributen
    private char[][] beeld;
    // Constructors
    public Beeldscherm() { // Default Constructor.
        this.beeld = new char[80][25];
    }
    // Methode
    public void maakLeeg() { // Vult de array met spaties.
        for (int i = 0; i < 80; i++) {
            for (int j = 0; j < 25; j++) {
                this.beeld[i][j] = ' ';
            }
        }
    }
    public void print() { // Drukt de array af op het scherm.
        for (int i = 0; i < 80; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print(this.beeld[i][j]);
            }
            System.out.println();
        }
    }
    public void zetKarakter(int x, int y, char c) {
        this.beeld[x][y] = c;

    }
}
