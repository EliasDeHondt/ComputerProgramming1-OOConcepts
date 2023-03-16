package Bank;

/**
 * @author Van Elias De Hondt
 * 17/10/2022
 */
public class Bankrekening {
    // Attributen
    private String houder;
    private String iban;
    private double saldo;

    // Constructor
    public Bankrekening(String houder, String iban) { // Default constructor
        this("", "", 0);

    }
    public Bankrekening(String houder, String iban, double saldo) {
        this.houder = houder;
        this.iban = iban;
        this.saldo = saldo;
    }

    // Methode
    public String setHouder() { // get ...
        return houder;

    }
    public String setIban() { // get ...
        return iban;
    }
    public double setSaldo() { // get ...
        return saldo;
    }
    public void storting(double saldo) {
        this.saldo = this.saldo + saldo;
    }
    public boolean opname(double saldo) {
        if ((this.saldo - saldo) >= 0) {
            this.saldo = this.saldo - saldo;
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        String str = String.format("De rekening %s op naam van %s heeft een saldo van €%.2f", houder, iban, saldo);
        return str;
    }
}
