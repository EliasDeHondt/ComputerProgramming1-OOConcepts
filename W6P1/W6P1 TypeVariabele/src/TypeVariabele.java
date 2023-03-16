import java.util.Scanner;

/**
 @author Van Elias De Hondt
 * 8/11/2022
 */
public class TypeVariabele {
    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        int answer;
        do {
            System.out.print("Type a number that's corresponding to the variable type name or type 0 to stop the program.\n0. To stop\n1. byte\n2. short\n3. int\n4. long\n5. float\n6. double\n7. boolean\n8. char\n9. For all\n");
            answer = key.nextInt();
            for (int i = 0; i < 20; i++) System.out.println();
            if (answer == 0) System.exit(0);
            System.out.print(line());
            System.out.print("| Type    | Omschrijving                    | Formaat               | Minimaal  | Maximaal |\n");
            System.out.print(line());
            if (answer == 1 | answer == 9) System.out.print("| byte    | Byte weerde                     | 1 byte (2-complement) | -128      | 127      |\n");
            if (answer == 2 | answer == 9) System.out.print("| short   | Short integer                   | 2 byte (2-complement) | -32768    | 32767    |\n");
            if (answer == 3 | answer == 9) System.out.print("| int     | Integrt                         | 4 byte (2-complement) | -2 31     | 2 31 -1  |\n");
            if (answer == 4 | answer == 9) System.out.print("| long    | Long integer                    | 8 byte (2-complement) | -2 63     | 2 63 -1  |\n");
            if (answer == 5 | answer == 9) System.out.print("| float   | Single precision floating point | 4 byte (IEEE 754)     | -3.4E+38  | 3.4E+38  |\n");
            if (answer == 6 | answer == 9) System.out.print("| double  | Double precision floating point | 8 byte (IEEE 754)     | -1.4E+308 | 1.4E+308 |\n");
            if (answer == 7 | answer == 9) System.out.print("| boolean | Boolean waarde                  | 1 bit                 | false (0) | true (1) |\n");
            if (answer == 8 | answer == 9) System.out.print("| char    | Karakter                        | 2 byte (Unicode)      | u0000     | uFFFF    |\n");
            System.out.print(line());
            System.out.print("Are you done? (Y|N) ");
            key.next();
            for (int i = 0; i < 20; i++) System.out.println();
        } while (true);
    }
    public static String line() {
        return "+---------+---------------------------------+-----------------------+-----------+----------+\n";
    }
}
