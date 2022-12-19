import Bibliotheek.Boek;

/**
 * Van Elias De Hondt
 * 17/10/2022
 */
public class DemoBoek {
    public static void main(String[] args) {
        // Boek 1
        Boek boek1 = new Boek();
        boek1.setTitel("INTRODUCTION TO JAVA PROGRAMMING");
        boek1.setPaginas(1240);
        boek1.setAuteur("Y. DANIEL LIANG");
        boek1.setOntleend(true);
        boek1.printDetails();
        // Boek 2
        Boek boek2 = new Boek();
        boek2.setTitel("DE KAPELLEKENSBAAN");
        boek2.setPaginas(291);
        boek2.setAuteur("LOUIS PAUL BOON");
        boek2.setOntleend(false);
        boek2.printDetails();
        // Boek 3
        Boek boek3 = new Boek();
        boek3.setTitel("DRUGS");
        boek3.setPaginas(333);
        boek3.setAuteur("JEF GEERAERTS");
        boek3.setOntleend(true);
        boek3.printDetails();

    }
}
