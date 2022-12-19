import steenschaarpapier.Antwoord;

public class Tornooi {
    public static final int START_SIZE = 8;
    private Deelnemer[] deelnemers = new Deelnemer[START_SIZE];
    private Deelnemer[] winnaars = new Deelnemer[START_SIZE / 2];
    private int aantal = 0;

    public void addDeelnemer(Deelnemer deelnemer) {
        if (aantal == START_SIZE) {
            System.out.println("We zitten vol!");
            return;
        }
        deelnemers[aantal++] = deelnemer;
    }

    public void start() {
        while (deelnemers.length > 1) {
            speelEenRonde();
        }
        System.out.println("The winner is:" + deelnemers[0].getNaam());
    }

    public void speelEenRonde() {
        System.out.println("\nRonde start, aantal deelnemers:" + deelnemers.length);
        for (int i = 0; i < deelnemers.length - 1; i += 2) {
            Antwoord antwoord1, antwoord2;
            int drawCounter = 0;
            do {
                if(drawCounter > 0) System.out.print("Gelijk spel... ");
                System.out.println(deelnemers[i].getNaam() + " tegen " + deelnemers[i + 1].getNaam());
                antwoord1 = deelnemers[i].getAntwoord();
                antwoord2 = deelnemers[i + 1].getAntwoord();
                deelnemers[i].ditZeiTegenstander(antwoord2);
                deelnemers[i + 1].ditZeiTegenstander(antwoord1);
                drawCounter++;
            } while (antwoord1 == antwoord2 && drawCounter < 5);
            if (drawCounter == 5) {
                System.out.println("Te veel hetzelfde...");
                System.out.println(deelnemers[i].getNaam() + " wint!");
                winnaars[i / 2] = deelnemers[i];
            } else {
                System.out.println("\t" + deelnemers[i].getNaam() + " deed " + antwoord1);
                System.out.println("\t" + deelnemers[i + 1].getNaam() + " deed " + antwoord2);
                if (antwoord1.wintVan(antwoord2)) {
                    System.out.println(deelnemers[i].getNaam() + " wint!");
                    winnaars[i / 2] = deelnemers[i];
                } else {
                    System.out.println(deelnemers[i + 1].getNaam() + " wint!");
                    winnaars[i / 2] = deelnemers[i + 1];
                }
            }
        }
        this.deelnemers = winnaars;
        this.winnaars = new Deelnemer[this.deelnemers.length / 2];
    }
}
