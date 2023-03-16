package Chatbot1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author Elias De Hondt
 * 18/11/2022
 */
public class ChatBot {
    // Attributen
    private String naam;
    private Random random;
    private String[] antwoorden;
    // Constructor
    public ChatBot(String naam) {
        this.naam = naam;
        this.random = new Random();
        this.antwoorden = new String[]{
                "Ok, probeer eerst al eens te herstarten",
                "Kan je het probleem eens herformuleren?",
                "En is dat al lang zo?",
                "Waarom heb je ons niet eerder gecontacteerd?",
                "Ik denk dat je dat zelf wel kan oplossen, niet?",
                "Die vraag heb ik nog niet vaak gehad!",
                "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
                "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
                "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
                "En dan?",
                "Dat zal wel, maar er zijn ergere dingen he.",
                "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"
        };
    }
    // Methode
    public String antwoordOpVraag(String vraag) {
        if (vraag.toLowerCase().equals("stop")) {
            return String.format("Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van", this.naam);
        } else if (vraag.length() <= 4) {
            return "";
        } else {
            int temp = random.nextInt(0,antwoorden.length);
            return antwoorden[temp];
        }
    }
    // To String
    @Override
    public String toString() {
        LocalDateTime nu = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%s\nHallo, ik ben chatbot %s, stel me een vraag en ik geef je een oplossing!",myFormat.format(nu),this.naam);
    }
}
