/**
 @author Van Elias De Hondt
 * 20/12/2022
 */
public class RunDemo {
    public static void main(String[] args) throws GeboorteLijstExceptien {
//TODO: Test 1

//        // Lege naam.
//        Geschenk geschenk1 = new Geschenk("123",10.01);
//        geschenk1.setKoper("Elias");
//        geschenk1.setGeschenkNaam("");
//        // Negatieve prijs.
//        Geschenk geschenk2 = new Geschenk("123",-2);
//        // Lege naam van koper.
//        Geschenk geschenk3 = new Geschenk("123",10.01);
//        geschenk3.setKoper("");

//TODO: Test 2
        Geschenk geschenk1 = new Geschenk("Geschenk1",10.45);
        geschenk1.setKoper("Elias");

        Geschenk geschenk2 = new Geschenk("Geschenk2",123.01);
        geschenk2.setKoper("Tom");

        Geschenk geschenk3 = new Geschenk("Geschenk3",101.61);
        geschenk3.setKoper("Tim");

        Geschenk geschenk4 = new Geschenk("Geschenk4",12.51);
        geschenk4.setKoper("Axel");

        GesboorteLijst gesboorteLijst = new GesboorteLijst("X");

        gesboorteLijst.voegGeschenkToe(geschenk1);
        gesboorteLijst.voegGeschenkToe(geschenk2);
        gesboorteLijst.voegGeschenkToe(geschenk3);
        gesboorteLijst.voegGeschenkToe(geschenk4);

        gesboorteLijst.toon();
        for (int i = 0; i < 4; i++) {
            System.out.println(gesboorteLijst.getGeschenk(i).getKoper());
            System.out.println(gesboorteLijst.getGeschenk(i).getGeschenkNaam());
            System.out.println(gesboorteLijst.koop(gesboorteLijst.getGeschenk(i).getGeschenkNaam(),gesboorteLijst.getGeschenk(i).getKoper()));
        }
    }
}