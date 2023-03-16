package PersonnelCosts;

/**
 @author Van Elias De Hondt
 * 29/12/2022
 */
public class Arbeider extends PersonnelCosts {
    // Attributes
    private double werknemersbijdrage = 0.1307;
    private double patronaleBijdrage = 0.2492;
    // Constructors
    public Arbeider(double brutobezoldiging, double bedrijfsvoorheffing) {
        super(brutobezoldiging, bedrijfsvoorheffing);
    }

    // Methods
    public void Calculate() {
        this.werknemersbijdrage = this.werknemersbijdrage * 1.08 * super.getBrutobezoldiging();

        super.setBelastbareBezoldiging(super.getBrutobezoldiging() - this.werknemersbijdrage);

        super.setBedrijfsvoorheffing(super.getBedrijfsvoorheffing() * super.getBelastbareBezoldiging());

        super.setNettobezoldiging(super.getBelastbareBezoldiging() - super.getBedrijfsvoorheffing());

        this.patronaleBijdrage = this.patronaleBijdrage * 1.08 * super.getBrutobezoldiging();

        this.setRatio((super.getBrutobezoldiging() + this.patronaleBijdrage) / super.getNettobezoldiging());
    }

    @Override
    public String toString() {
        return String.format("""
                        ╠═════════════════════════╦═══════════╦════════════╗
                        ║                         ║    MAR    ║   Bedrag   ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ Brutobezoldiging        ║    6203   ║ %-10.2f ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ Werknemersbijdrage RSZ  ║    454    ║ %-10.2f ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ Belastbare bezoldiging  ║    453    ║ %-10.2f ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ Bedrijfsvoorheffing     ║           ║ %-10.2f ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ Nettobezoldiging        ║    455    ║ %-10.2f ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ Patronale bijdrage      ║ 621 & 454 ║ %-10.2f ║
                        ╠═════════════════════════╬═══════════╬════════════╣
                        ║ RATIO                   ║           ║ %-10.2f ║
                        ╚═════════════════════════╩═══════════╩════════════╝
                        """, super.getBrutobezoldiging(), this.werknemersbijdrage, super.getBelastbareBezoldiging(),
                super.getBedrijfsvoorheffing(), super.getNettobezoldiging(), this.patronaleBijdrage, super.getRatio());
    }
}
