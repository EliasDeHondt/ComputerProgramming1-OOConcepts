package golven;

import java.awt.*;
import java.util.Random;

/**
 @author Elias De Hondt
 * 28/10/2022
 */
public class GolvenGrafiek {
    // Attributen
    private Golf[] golven;
    private Random random;

    // Constructors
    public GolvenGrafiek(int aantalGolven) {
        this.random = new Random();
        this.golven = new Golf[aantalGolven];
    }
    // Methode
    public void maakGolven() {
        Golf golf = new Golf();
        for (int i = 0; i < golven.length; i++) {
            this.golven[i]= new Golf() ;
            this.golven[i].setAmplitude(random.nextDouble(0.1,4.0));
            this.golven[i].setFrequentie(random.nextDouble(0.1,4.0));
            this.golven[i].setFase(random.nextDouble(-1.0,1.0));
        }
    }
    public void tekenGolven(){
        GrafiekWindow grafiekWindow = new GrafiekWindow(10,6);
        for(Golf golf: this.golven){
            switch (random.nextInt(0,12)) {
                case 0: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.BLACK); break; //       :-)
                case 1: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.BLUE); break; //        :-)
                case 2: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.CYAN); break; //        :-)
                case 3: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.DARK_GRAY); break; //   :-)
                case 4: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.GRAY); break; //        :-)
                case 5: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.GREEN); break; //       :-)
                case 6: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.LIGHT_GRAY); break; //  :-)
                case 7: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.MAGENTA); break; //     :-)
                case 8: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.ORANGE); break; //      :-)
                case 9: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.PINK); break; //        :-)
                case 10: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.RED); break; //        :-)
                case 11: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.WHITE); break; //      :-)
                case 12: for(double i = -5; i < 10;i+=0.001) grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.YELLOW); break; //     :-)
            }
        }
        grafiekWindow.toon();
    }
}
