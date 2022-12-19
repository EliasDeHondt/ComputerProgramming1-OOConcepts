import java.util.Random;

public class ArrayTools {
    private static Random random = new Random();;
    public static double arrayTotal(double[] myArray) {
        double tot = 0.0;
        for (int i = 0; i < myArray.length; i++) {
            tot += myArray[i];
        }
        return tot;
    }
    public static double arrayAverage(double[] myArray) {
        double tot = 0.0;
        for (int i = 1; i < myArray.length; i++) {
            tot += myArray[i];
        }
        return tot / myArray.length;
    }
    public static double pickRandom(double[] myArray) {
        return myArray[random.nextInt(myArray.length)];
    }
}
