import Bank.Bankrekening;

/**
 * Van Elias De Hondt
 * 17/10/2022
 */

public class DemoBankrekening {
    public static void main(String[] args) {
        Bankrekening greg  = new Bankrekening("Gregory Farouk", "BE15 6474 3001 5840");
        System.out.println(greg);
        greg.storting(3000);
        System.out.println(greg);
        if (greg.opname(2000)) {   // opname geeft true terug
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }
        if (greg.opname(1500)) {   // opname geeft false terug
            System.out.println(greg);
        } else {
            System.out.println("Saldo ontoereikend");
        }

        Bankrekening djordin = new Bankrekening("Djordin Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + djordin);
        djordin.storting(6487);
        System.out.println(djordin);
    }
}
