import java.util.Scanner;

/**
 @author Elias De Hondt
 * 14/10/2022
 */
public class Hartslagzones {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String keuze1,keuze2,keuze3;
        double HRR = 0, limietMin = 0, limietMax = 0;
        //******************************************************************************************
        // Deel 1
        //******************************************************************************************
        // Deel 1.1
        do {
            System.out.print("Ken je je HRR? (J/N) ");
            keuze1 = key.next().toUpperCase();
        } while (keuze1.charAt(0) == 'J' && keuze1.charAt(0) == 'N');
        if (keuze1.charAt(0) == 'J') {
            System.out.print("Wat is je HRR? ");
            HRR = key.nextInt();
        }
        // Deel 1.2
        do {
            System.out.print("Ga even rustig zitten en adem 10x diep in en uit.\nIndien je klaar bent typ je (K): ");
            keuze2 = key.next();
        } while (keuze2.charAt(0) == 'K' && keuze2.charAt(0) == 'k');
        double hartslagMin = slagen() * 4;
        // Deel 1.3
        System.out.println("Interval 1: Ren 30 seconden op volle snelheid.\n" +
                "Herstelperiode 1: Rust 60 seconden.\n" +
                "Interval 2: Ren 30 seconden op volle snelheid.\n" +
                "Herstelperiode 2: Rust 60 seconden.\n" +
                "Interval 3: Ren 60 seconden op volle snelheid.\n");
        double hartslagMax = slagen() * 4;
        // Deel 1.4
        if (keuze1.charAt(0) == 'N') {
            HRR = hartslagMax - hartslagMin;
        }
        // Deel 1.5
        System.out.println("Dit is je HRR: " + HRR);
        // Deel 1.6
        System.out.print("In welke zone wil je zitten? ");
        int zone = key.nextInt();
        switch (zone) {
            // Zone 1
            case 1: limietMin = hartslagMax-(hartslagMin/100)*50+hartslagMin;
                limietMax = hartslagMax-(hartslagMin/100)*60+hartslagMin; break;
            // Zone 2
            case 2: limietMin = hartslagMax-(hartslagMin/100)*60+hartslagMin;
                limietMax = hartslagMax-(hartslagMin/100)*70+hartslagMin; break;
            // Zone 3
            case 3: limietMin = hartslagMax-(hartslagMin/100)*70+hartslagMin;
                limietMax = hartslagMax-(hartslagMin/100)*80+hartslagMin; break;
            // Zone 4
            case 4: limietMin = hartslagMax-(hartslagMin/100)*80+hartslagMin;
                limietMax = hartslagMax-(hartslagMin/100)*90+hartslagMin; break;
            // Zone 5
            case 5: limietMin = hartslagMax-(hartslagMin/100)*90+hartslagMin;
                limietMax = hartslagMax-(hartslagMin/100)*100+hartslagMin; break;
        }
        System.out.println("Limieten hartslag tussen: " + limietMin + " en " + limietMax);
        //******************************************************************************************
        // Deel 2
        //******************************************************************************************
        // Deel 2.1
        do {
            System.out.print("Bent u een gevorderde? (B/G) ");
            keuze3 = key.next();
            keuze3 = keuze3.toUpperCase();
        } while (keuze3.charAt(0) == 'B' && keuze3.charAt(0) == 'G');
        // Deel 2.2
        System.out.print("Hoeveel dagen doe je dit al achter elkaar: ");
        int keuze4 = key.nextInt();
        // Deel 2.3
        int procent = 10*keuze4;
        if (keuze3.charAt(0) == 'B') {
            System.out.println("1.\t" + 10+procent*10/100 + " minuten lopen tussen de limieten van zone 3 tot en met 4.");
            if (20+procent*20/100 <= 30) {
                System.out.println("2.\t30 seconden hardlopen in zone 5.");
            } else {
                System.out.println("2.\t" + 20+procent*20/100 + " seconden hardlopen in zone 5.");
            }
            System.out.println("3.\tWandelen tot dat de bovengrens van zone 2 bereikt is.");
            System.out.println("4.\t" + 40+procent*40/100 + " seconden wandelen/joggen tussen de limieten van zone 1 tot en met 2.");
            System.out.println("5.\t" + 10+procent*10/100 + " minuten wandelen/joggen in zone 2.");
        } else if (keuze3.charAt(0) == 'G') {
            System.out.println("1.\t" + 20+procent*20/100 + " minuten lopen tussen de limieten van zone 3 tot en met 4.");
            System.out.println("2.\t30 seconden hardlopen in zone 5.");
            System.out.println("3.\tWandelen tot dat de bovengrens van zone 2 bereikt is.");
            System.out.println("4.\t" + 40+procent*40/100 + " seconden wandelen/joggen tussen de limieten van zone 1 tot en met 2.");
            System.out.println("5.\t" + 10+procent*10/100 + " minuten wandelen/joggen in zone 2 tem zone 3.");
        }
        // Deel 2.4
        // De opgave is niet duidelijk daarvoor ook niet mogelijk voor uit te voeren!!!
    }
    public static int slagen() {
        Scanner key = new Scanner(System.in);
        for (int i = 15; i > 0; i--) {
            try {
                Thread.sleep(100); // 1 seconde wachten (1000 ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print( i + "-");
        }
        System.out.print("stop\nGeef het aantal slagen in: ");
        int slagen = key.nextInt();
        return slagen;
    }
}
