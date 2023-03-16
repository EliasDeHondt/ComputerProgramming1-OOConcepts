/**
 * @author Van Elias De Hondt
 * 20/10/2022
 */
public class DeMain {
    public static void main(String[] args) {
        Kamer kamer1 = new Kamer(1, 347.0);
        Kamer kamer2 = new Kamer(2, 431.0);
        Kamer kamer3 = new Kamer(3, 285.0);
        Kamer kamer4 = new Kamer(4, 354.0);

        Student student1 = new Student("Halfhide Aleksey", "Stationstraat 42", "Gent", 9000);
        Student student2 = new Student("Mutambay Lotte", "Boomforeestraat 12", "Antwerpen", 2000);
        Student student3 = new Student("Domen Tim", "Zonnebloemstraat 7", "Brussel", 1000);

        kamer2.setStudent(student1);
        kamer3.setStudent(student2);
        kamer4.setStudent(student3);

        System.out.println(kamer1);
        System.out.println(kamer2);
        System.out.println(kamer3);
        System.out.println(kamer4);

    }
}
