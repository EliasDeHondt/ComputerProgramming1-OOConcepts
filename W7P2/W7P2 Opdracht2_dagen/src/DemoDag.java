/**
 @author Elias De Hondt
 * 14/11/2022
 */
public class DemoDag {
    public static void main(String[] args) {
        for (Dag dag : Dag.values()) {
            System.out.println(dag + " " + dag.getAfkorting()); // dag.toString
        }
    }
}
