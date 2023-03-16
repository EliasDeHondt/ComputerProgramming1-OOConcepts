/**
 @author Van Elias De Hondt
 * 24/10/2022
 */
public class FilmVerzameling {
    // Attributen
    private Film[] films; // Een array-attribuut films met objecten van de klasse Film.
    private int index;
    private int capaciteit;

    // Constructor
    public FilmVerzameling(int capaciteit) {
        this.capaciteit = capaciteit;
        this.films = new Film[capaciteit];
        this.index = 0;
    }

    // Methode
    public void voegFilmToe(Film newFilm) {
        if (this.index < this.capaciteit) {
            this.films[this.index] = newFilm;
            this.index++;
        }
    }

    public void toonOverzicht() {
        for (int i = 0; i < films.length; i++) {
            System.out.printf("%d.\t %s\n", i + 1, films[i].toString());
        }
    }
}
