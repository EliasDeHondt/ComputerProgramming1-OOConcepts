/**
 * Van Elias De Hondt
 * 24/11/2022
 */
public class RunPersoon {
    // Methode
    public static void main(String[] args) {
     Telefoon tel1 = new Telefoon("04444");
     Persoon per1 = new Persoon(tel1,"Tom");
     Student stu1 = new Student(tel1, per1.getNaam(),1234);

        System.out.println(stu1);
    }
}
