/**
 * Van Elias De Hondt
 * 30/10/2022
 */
public class DemoBeeldscherm{
    private static Beeldscherm beeldscherm;
    public static void main(String[] args) {
        beeldscherm = new Beeldscherm();
        beeldscherm.maakLeeg();
        teken(40, 12, 10);
        beeldscherm.print();
    }
    public static void punt(int xc, int yc, int x, int y) {
        beeldscherm.zetKarakter(xc+x, yc+y, '*');
        beeldscherm.zetKarakter(xc-x, yc+y, '*');
        beeldscherm.zetKarakter(xc+x, yc-y, '*');
        beeldscherm.zetKarakter(xc-x, yc-y, '*');
        beeldscherm.zetKarakter(xc+y, yc+x, '*');
        beeldscherm.zetKarakter(xc-y, yc+x, '*');
        beeldscherm.zetKarakter(xc+y, yc-x, '*');
        beeldscherm.zetKarakter(xc-y, yc-x, '*');
    }
    public static void teken(int xc, int yc, int r) {
        int x = 0, y = r;
        int d = 3 - 2 * r;
        punt(xc, yc, x, y);
        while (y >= x) {
            x++;
            if (d > 0) {
                y--;
                d = d + 4 * (x - y) + 10;
            } else {
                d = d + 4 * x + 6;
            }
            punt(xc, yc, x, y);
        }
    }
}
