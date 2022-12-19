public class DemoExceptions {
    public static void main(String[] args) {
        double[] getallen = {1.0, 2.0, 3.0, 4.0};
        System.out.println("Totaal: " + ArrayTools.arrayTotal(getallen));
        System.out.println("Gemiddelde: " + ArrayTools.arrayAverage(getallen));
        System.out.println("Willekeurig element: " + ArrayTools.pickRandom(getallen));
    }
}
