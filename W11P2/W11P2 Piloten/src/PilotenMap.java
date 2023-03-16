import java.util.Map;
import java.util.TreeMap;

/**
 @author Van Elias De Hondt
 * 15/12/2022
 */
public class PilotenMap {
    // Attributes
    private Map<String, Piloot> piloten;
    // Constructors
    public PilotenMap() {
        this.piloten = new TreeMap<>();
        this.vulMap();
    }
    // Methods
    public void vulMap() {
        int[][] seizoenen = {
                {1994, 1995, 2000, 2001, 2002, 2003, 2004},
                {1951, 1954, 1955, 1956, 1957},
                {1985, 1986, 1989, 1993},
                {2010, 2011, 2012, 2013},
                {1959, 1960, 1966},
                {1969, 1971, 1973},
                {1975, 1977, 1984},
                {1981, 1983, 1987},
                {1988, 1990, 1991}
        };
        Piloot[] kampioenen = {
                new Piloot("Duits", "Michael Schumacher", 7),
                new Piloot("Argentijns", "Juan Manuel Fangio", 5),
                new Piloot("Frans", "Alain Prost", 4),
                new Piloot("Duits", "Sebastian Vettel", 4),
                new Piloot("Australisch", "Jack Brabham", 3),
                new Piloot("Brits", "Jackie Stewart", 3),
                new Piloot("Oostenrijks", "Niki Lauda", 3),
                new Piloot("Braziliaans", "Nelson Piquet", 3),
                new Piloot("Braziliaans", "Ayrton Senna", 3)
        };
        for (int i = 0; i < kampioenen.length; i++) {
            this.piloten.put(kampioenen[i].getNaam(),kampioenen[i]);
            for (int j = 0; j < seizoenen[i].length; j++) {
                this.piloten.get(kampioenen[i].getNaam()).voegSeizoenToe(seizoenen[i][j]);
            }
        }
    }
    @Override
    public String toString() { // @Override van toString
        StringBuilder stringBuilder = new StringBuilder();
        for (Piloot piloten : this.piloten.values()) {
            stringBuilder.append(piloten);
        }
        return String.format("%s",stringBuilder);
    }
}
