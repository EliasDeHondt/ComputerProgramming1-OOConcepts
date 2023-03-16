package Chatbot2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
    private String[] nonsensAntwoorden;
    private String[] antwoorden;
    private String[] zoekwoorden;
    private LocalTime startTime;
    private LocalTime stopTime;
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
        for (int i = 0; i < zoekwoorden.length; i++) {
            if(vraag.contains(zoekwoorden[i])) {
                switch (i) {
                    case 0: return this.antwoorden[i];
                    case 1: return this.antwoorden[i];
                    case 2: return this.antwoorden[i];
                    case 3: return this.antwoorden[i];
                    case 4: return this.antwoorden[i];
                    case 5: return this.antwoorden[i];
                    case 6: return this.antwoorden[i];
                    case 7: return this.antwoorden[i];
                    case 8: return this.antwoorden[i];
                    case 9: return this.antwoorden[i];
                    case 10: return this.antwoorden[i];
                    case 11: return this.antwoorden[i];
                    case 12: return this.antwoorden[i];
                    case 13: return this.antwoorden[i];
                    case 14: return this.antwoorden[i];
                }
            }
        }
        if (vraag.toLowerCase().equals("stop")) {
            stopGesprek();
            Duration tijdsduur = Duration.between(startTime,stopTime);
            long seconden = tijdsduur.getSeconds();
            return String.format("Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van %s\nDit gesprek duurde %d sec.\n", this.naam,seconden);
        }
        else if (vraag.length() <= 4) {
            return "";
        }
        else {
            int temp = random.nextInt(0,nonsensAntwoorden.length);
            return nonsensAntwoorden[temp];
        }
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
