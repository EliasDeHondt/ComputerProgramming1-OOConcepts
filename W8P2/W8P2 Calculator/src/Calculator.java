import java.util.Scanner;

/**
 @author Elias De Hondt
 * 26/11/2022
 */
public class Calculator {
    // Attributen
    private Scanner key = new Scanner(System.in);
    private double input1;
    private double input2;
    private int choice;
    private double answer;
    // Constructors
    public Calculator() {
    }
    // Methode
    public void menu() {
        System.out.print("""
                        ╔═════════════════════════════════════╗
                        ║      Welcome to my calculator!      ║
                        ╟──────────────────┬──────────────────╢
                        ║ 1) → [Som]       │ 3) → [Product]   ║
                        ║ 2) → [Difference]│ 4) → [Quotient]  ║
                        ╠══════════════════╧══════════════════╝
                        """);
        System.out.print("║ Choice: ");
        this.choice = key.nextInt();
        System.out.print("║ Input1: ");
        this.input1 = key.nextInt();
        System.out.print("║ Input2: ");
        this.input2 = key.nextInt();
        switch (this.choice) {
            case 1 -> answer = this.Som(this.input1, this.input2);
            case 2 -> answer = this.Difference(this.input1, this.input2);
            case 3 -> answer = this.Product(this.input1, this.input2);
            case 4 -> answer = this.Quotient(this.input1, this.input2);
        }
        System.out.printf("║ Answer: %.2f",this.answer);
    }

    public double Som(double input1, double input2) {
        return input1 + input2;
    }

    public double Difference(double input1, double input2) {
        return input1 - input2;
    }

    public double Product(double input1, double input2) {
        return input1 * input2;
    }

    public double Quotient(double input1, double input2) {
        return input1 / input2;
    }

}
