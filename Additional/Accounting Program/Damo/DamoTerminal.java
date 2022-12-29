import App.Conclusion;
import PersonnelCosts.*;

import java.util.Scanner;

/**
 * Van Elias De Hondt
 * 28/12/2022
 */
public class DamoTerminal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        start(keyboard);
    }

    public static void start(Scanner keyboard) {
        System.out.print(
                """
                        ╔════════════════════════════╗
                        ║     Accounting Program     ║
                        ╠════════════════════════════╝
                        ╠[1 Calculate Personnel Costs]
                        ╠[2 Exit❌]
                        ║
                        """);
        System.out.print("╠➤ ");
        switch (keyboard.nextInt()) {
            case 1 -> PersonnelCosts(keyboard);
            case 2 -> Conclusion.exit();
        }
    }

    public static void PersonnelCosts(Scanner keyboard) {
        System.out.print(
                """
                        ╠═══════════════════════════════════╗
                        ║   What is the (Brutobezoldiging)  ║
                        ╠═══════════════════════════════════╝
                        """);
        System.out.print("╠➤ ");
        double brutobezoldiging = keyboard.nextDouble();
        System.out.print(
                """
                        ╠═══════════════════════════════════╗
                        ║ What is the (Bedrijfsvoorheffing) ║
                        ╠═══════════════════════════════════╝
                        """);
        System.out.print("╠➤ ");
        double bedrijfsvoorheffing = keyboard.nextDouble();
        System.out.print(
                """
                        ╠══════════════════╗
                        ║   1) Arbeider    ║
                        ║   2) Bedienden   ║
                        ╠══════════════════╝
                        """);
        System.out.print("╠➤ ");
        switch (keyboard.nextInt()) {
            case 1 -> {
                Arbeider arbeider = new Arbeider(brutobezoldiging, bedrijfsvoorheffing);
                arbeider.Calculate();
                System.out.println(arbeider);
            }
            case 2 -> {
                Bedienden bedienden = new Bedienden(brutobezoldiging, bedrijfsvoorheffing);
                bedienden.Calculate();
                System.out.println(bedienden);
            }
        }
    }
}
