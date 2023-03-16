import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 30/09/2022
 */
public class Oefening1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nogis = "ja";
        // Dit is een while dat runt alt nogis == ja en of Ja of ...
        while (nogis.toLowerCase().equals("ja")) {
            // Hier worden een paar variabelen gedefinieerd.
            int aantalGebruikers = 0;
            int percentageExtreme = 0;
            int extreme = 0;
            int totaalVraag = 0;
            // Wat is je naam.
            System.out.print("Wat is je naam? ");
            String naam = keyboard.nextLine();
            // Vraag 1.
            System.out.print("Het laatste wat ik doe -voor ’s avonds het licht uit gaat- is nog snel even kijken of er nog iets aan berichten, enz is binnengekomen op mijn smartphone.\n(Ja/Nee) ");
            String vraag1 = keyboard.nextLine();
            if (vraag1.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 2.
            System.out.print("Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn.\n(Ja/Nee) ");
            String vraag2 = keyboard.nextLine();
            if (vraag2.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 3.
            System.out.print("Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn smartphone.\n(Ja/Nee) ");
            String vraag3 = keyboard.nextLine();
            if (vraag3.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 4.
            System.out.print("Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen de minuut op mijn smartphone wat het precies is.\n(Ja/Nee) ");
            String vraag4 = keyboard.nextLine();
            if (vraag4.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 5.
            System.out.print("Terwijl is naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere keren mijn smartphone.\n(Ja/Nee) ");
            String vraag5 = keyboard.nextLine();
            if (vraag5.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 6.
            System.out.print("Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd.\n(Ja/Nee) ");
            String vraag6 = keyboard.nextLine();
            if (vraag6.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 7.
            System.out.print("Als ik in gezelschap -familie, vrienden,… eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd.\n(Ja/Nee) ");
            String vraag7 = keyboard.nextLine();
            if (vraag7.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 8.
            System.out.print("Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld naar het scherm.\n(Ja/Nee) ");
            String vraag8 = keyboard.nextLine();
            if (vraag8.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Vraag 9.
            System.out.print("Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar het scherm te kijken.\n(Ja/Nee) ");
            String vraag9 = keyboard.nextLine();
            if (vraag9.toLowerCase().equals("ja")) {
                totaalVraag += 1;
            }
            // Resultaat 1.
            if (totaalVraag == 0) {
                System.out.println("Je bent niet digitaal verslaafd " + naam + ". Houden zo!");
            }
            // Resultaat 2.
            if (totaalVraag == 1 || totaalVraag == 2) {
                System.out.println("Je hebt een milde vorm van digitale verslaving " + naam + ".");
            }
            // Resultaat 3.
            if (totaalVraag == 3 || totaalVraag == 4 || totaalVraag == 5) {
                System.out.println("Je hebt een niet te onderschatten vorm van digitale verslaving " + naam + ". Leg jezelf wat beperkingen op");
            }
            // Resultaat 4.
            if (totaalVraag == 6 || totaalVraag == 7 || totaalVraag == 8) {
                System.out.println("Je hebt een ernstige vorm van digitale verslaving " + naam + ". Overweeg om een digitale detox-cursus te volgen!");
                // Teller.
                ++extreme;
            }
            // Resultaat 5.
            if (totaalVraag == 9 || totaalVraag == 10) {
                System.out.println("Je hebt een extreme vorm van digitale verslaving " + naam +  ". Je hebt waarschijnlijk professionele hulp nodig!");
                // Hier staat nog een vraag voor ernstige digitale verslaving.
                System.out.print("Hoeveel uur per dag zit je op je smartphone? ");
                int uurPerDagAantal = keyboard.nextInt();
                System.out.println("===========================================================================");
                double percentageVanEenDag =  100 / 24;
                double percentageErnstige = uurPerDagAantal * percentageVanEenDag;
                if (percentageErnstige >= 80) {
                    System.out.println("Je spendeert " + percentageErnstige + "% van de dag aan je smartphone.\n Jouw verslaving vormt een gevaar voor jezelf en jouw omgeving. Zoek zo snel mogelijk hulp!!");
                }
                if (percentageErnstige > 20 && percentageErnstige < 80) {
                    System.out.println("Je spendeert " + percentageErnstige + "% van de dag aan je smartphone.\n Vreemd, ben je zeker dat je de enquête eerlijk ingevuld hebt? Wees eerlijk tegenover jezelf!");
                }
                if (percentageErnstige <= 20) {
                    System.out.println("'Je spendeert " +  percentageErnstige + "% van de dag aan je smartphone.\n Vreemd, ben je zeker dat je de enquête eerlijk ingevuld hebt? Wees eerlijk tegenover jezelf!");
                }
                // Teller.
                ++extreme;
            }
            keyboard.nextLine();
            // Teller.
            ++aantalGebruikers;
            // Wat is het percentage van het aantal "extreme digitale verslaving".
            percentageExtreme = (extreme / aantalGebruikers) * 100;
            // Het overzichtsrapport.
            System.out.println("===========================================================================");
            System.out.println("Deze enquête werd reeds door " + aantalGebruikers + " gebruikers ingevuld," + "\t\t\t\t\t\t  =" );
            System.out.println(percentageExtreme + "% hiervan had een ernstige of extreme vorm van digitale verslaving. \t  =");
            System.out.println("===========================================================================");
            System.out.println("Dit waren de antwoorden op u vragen:\n" + "| Vraag 1 " + vraag1 + " | Vraag 2 " + vraag2 + " | Vraag 3 " + vraag3 + " |\n| Vraag 4 " + vraag4 + " | Vraag 5 " + vraag5 + " | Vraag 6 " + vraag6 + " |\n| Vraag 7 " + vraag7 + " | Vraag 8 " + vraag8 + " | Vraag 9 " + vraag9 + " |");
            System.out.println("Je hebt in totaal " + totaalVraag + " keer \"ja\" beantwoord.");
            if (totaalVraag == 9 || totaalVraag == 10) {
                System.out.println(percentageExtreme + "van de dag zit je op je smartphone");
            }
            System.out.println("===========================================================================");
            System.out.print("Wil je de enquête nog is doen? (Ja/Nee) ");
            nogis = keyboard.nextLine();
        }
    }
}
