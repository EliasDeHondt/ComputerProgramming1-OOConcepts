

//TODO
//Deze applicatie simuleert een STEEN-SCHAAR-PAPIER tornooi
//Deelnemers moeten de Deelnemer interface implementeren
//TODO:
// - voorzie een aantal implementaties van de interface:
//      - Jef Papier: antwoord altijd PAPIER
//      - Rik Ripiet: antwoord altijd hetgeen de vorige keer tegen hem gezegd werd
//      - Harry Random: antwoord willekeurig
//      - Mens: gebruikt Scanner om aan de gebruiker te vragen wat hij wil doen
// Voeg nu de implementaties toe en speel het tornooi!
public class Main {
    public static void main(String[] args) {
        Tornooi tornooi = new Tornooi();
        //voeg nog deelnemers toe
        tornooi.addDeelnemer(new Mens());
        tornooi.addDeelnemer(new HarryRandom());

        tornooi.addDeelnemer(new HarryRandom());
        tornooi.addDeelnemer(new JefPapier());

        tornooi.addDeelnemer(new HarryRandom());
        tornooi.addDeelnemer(new JefPapier());

        tornooi.addDeelnemer(new RikRepeat());
        tornooi.addDeelnemer(new HarryRandom());
        tornooi.start();
    }
}