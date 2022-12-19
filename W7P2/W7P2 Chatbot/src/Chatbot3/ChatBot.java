package Chatbot3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;

/**
 * Van Elias De Hondt
 * 18/11/2022
 */
public class ChatBot {
    // Attributen
    private String naam;
    private Random random;
    private String[] nonsensAntwoorden;
    private String[] antwoorden;
    private String[] zoekwoorden;
    private LocalTime startTime;
    private LocalTime stopTime;
    private int teller;
    private String antwoord;
    // Constructor
    public ChatBot(String naam) {
        startGesprek();
        this.naam = naam;
        this.random = new Random();
        this.nonsensAntwoorden = new String[]{
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
        this.antwoorden = new String[]{
                "Probeer opnieuw aan te loggen, lost dat je probleem op?",
                "Herstarten van het systeem kan vele snelheidsproblemen oplossen. Heb je dat al geprobeerd?",
                "Misschien is er iets mis met de video adapter?",
                "Je kan best nog even wachten, mogelijk lost het probleem zichzelf op.",
                "Heb je onlangs nieuwe videosoftware geïnstalleerd?",
                "Is er nog voldoende ruimte vrij op het toestel?",
                "Het volume staat toch juist he?",
                "Mogelijk een probleem met één van de systeemdrivers.",
                "Pas op, soms wel hoor.",
                "En eergisteren?",
                "In de week werken die dingen meestal vlotter...",
                "Niet wanhopen, we vinden samen wel een oplossing.",
                "Ik zal het wel oplossen, geef jij mij gewoon wat meer info.",
                "Echt geen?",
                "Ik ken dat 'zeker', uiteindelijk blijkt het toch niet!"
        };
        this.zoekwoorden = new String[]{
                "aanloggen",
                "traag",
                "scherm",
                "hangt",
                "kleuren",
                "trager",
                "geluid",
                "vooruit",
                "niet",
                "gisteren",
                "weekend",
                "geen idee",
                "oplossing",
                "geen",
                "zeker"
        };
    }
    // Methode
    public String antwoordOpVraag(String vraag) {
        // "antwoord" is null
        this.antwoord = "";
        // Zoeken in "vraag" naar "zoekwoorden[i]" met For lus.
        for (int i = 0; i < zoekwoorden.length; i++) {
            if(vraag.contains(zoekwoorden[i])) {
                switch (i) {
                    case 0: antwoord = this.antwoorden[i]; break;
                    case 1: antwoord = this.antwoorden[i]; break;
                    case 2: antwoord = this.antwoorden[i]; break;
                    case 3: antwoord = this.antwoorden[i]; break;
                    case 4: antwoord = this.antwoorden[i]; break;
                    case 5: antwoord = this.antwoorden[i]; break;
                    case 6: antwoord = this.antwoorden[i]; break;
                    case 7: antwoord = this.antwoorden[i]; break;
                    case 8: antwoord = this.antwoorden[i]; break;
                    case 9: antwoord = this.antwoorden[i]; break;
                    case 10: antwoord = this.antwoorden[i]; break;
                    case 11: antwoord = this.antwoorden[i]; break;
                    case 12: antwoord = this.antwoorden[i]; break;
                    case 13: antwoord = this.antwoorden[i]; break;
                    case 14: antwoord = this.antwoorden[i]; break;
                }
            }
        }
        // Is "vraagt" "stop"?
        if (vraag.toLowerCase().equals("stop")) {
            stopGesprek();
            Duration tijdsduur = Duration.between(startTime,stopTime);
            long seconden = tijdsduur.getSeconds();
            antwoord = String.format("Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van %s\nDit gesprek duurde %d sec.\n", this.naam,seconden);
        }
        // Is "antwoord" leeg?
        if (Objects.equals(antwoord, "")) {
            // Is "vraag" groter dan 4?
            if (vraag.length() > 4) {
                // Random antwoord.
                int temp = random.nextInt(0,nonsensAntwoorden.length);
                antwoord = nonsensAntwoorden[temp];
            }
        }
        // Zijn we aan vraag 5?
        if (this.teller++ == 5) return "Zucht, typisch. " + antwoord;
        // Niet vraag vijf?
        else return antwoord;
    }
    public void startGesprek() {
        LocalTime startTime = LocalTime.now();
        this.startTime = startTime;
    }
    public void stopGesprek() {
        LocalTime stopTime = LocalTime.now();
        this.stopTime = stopTime;
    }
    // To String
    @Override
    public String toString() {
        LocalDateTime nu = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%s\nHallo, ik ben chatbot %s, stel me een vraag en ik geef je een oplossing!",myFormat.format(nu),this.naam);
    }
}
