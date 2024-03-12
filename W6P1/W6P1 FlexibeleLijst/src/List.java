/**
 @author Elias De Hondt
 * 24/10/2022
 */
public class List {
    // Attributen
    private int[] numbers;
    private int size;

    // Constructor
    public List(int capacity) {
        // De array wordt gecreëerd.
        this.numbers = new int[capacity];
        this.size = 0;
    }

    // Methode
    public boolean add(int i, int number) {
        // Het getal wordt op het einde in de array gestockeerd en size wordt verhoogd.
        // Als de maximumcapaciteit overschreden werd, wordt false teruggegeven.
        if (i >= this.numbers.length) {
            return false;
        } else {
            this.numbers[(this.numbers.length - 1) - i] = number;
            this.size++;
            return true;
        }
    }

    public int size() {
        // Geeft het aantal elementen in de lijst terug.
        return this.size;
    }

    public int get(int i) {
        // Geeft het i-de element terug of -1 als het niet bestaat.
        if (i >= this.numbers.length) {
            return -1;
        } else {
            return numbers[(this.numbers.length - 1) - i];
        }
    }

    // Gevorderd: kan je deze methode aanvullen?
    public boolean remove(int index) {
        // Deze methode verwijdert het element op de gegevenplaats.
        this.numbers[this.numbers.length - index - 1] = 0;
        size--;
        // Alle elementen hierna moeten dus 1 plaats opgeschoven worden.
        for (int i = this.numbers.length - index - 1; i > 0; i--) {
            this.numbers[i] = this.numbers[i -1];
        }

        // De return value geeft weer of het element bestond en succesvol verwijderd is.
        return index >= 0 && index < this.numbers.length;
    }
}
