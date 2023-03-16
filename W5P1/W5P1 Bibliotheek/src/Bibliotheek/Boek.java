package Bibliotheek;

/**
 @author Van Elias De Hondt
 * 17/10/2022
 */
public class Boek {
    // Attributen
    private String auteur;
    private String titel;
    private int paginas;
    private boolean ontleend;

    // Constructor
    public Boek() { // Default constructor
        this("Onbekend", "Onbekend" , 0);
    }
    public Boek(String auteur, String titel, int paginas) {
        this.auteur = auteur;
        this.titel = titel;
        this.paginas = paginas;
        this.ontleend = false;
    }

    // Methode
    public void setAuteur(String auteur) { // set ...
        this.auteur = auteur;
    }
    public void setTitel(String titel) { // set ...
        this.titel = titel;
    }
    public void setPaginas(int paginas) { // set ...
        this.paginas = paginas;
    }
    public void setOntleend(boolean ontleend) { // set ..
        this.ontleend = ontleend;
    }
    public String getAuteur() { // get ..
        return auteur;
    }
    public String getTitel() { // get ..
        return titel;
    }
    public int getPaginas() { // get ..
        return paginas;
    }
    public boolean getOntleend() { // get ..
        return ontleend;
    }
    public void printDetails() {
        auteur.toUpperCase();
        titel.toUpperCase();
        System.out.printf("Het boek %s (%d pagina’s), geschreven door %s is momenteel %s ontleend.\n\n", titel, this.paginas, auteur, ontleend?"":"niet");
    }
}
