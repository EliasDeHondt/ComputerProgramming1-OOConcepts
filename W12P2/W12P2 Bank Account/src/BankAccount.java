/**
 * Van Elias De Hondt
 * 19/12/2022
 */
public class BankAccount {
    // Attributes
    private String iban;
    // Constructors
    public BankAccount(String iban) throws BankAccountException {
        if (!BankAccountValidator.isValidBelgianIban(iban)) throw new BankAccountException(iban,iban.length());
        this.iban = iban;
    }
    // Methods
    public String getIban() {
        return this.iban;
    }
    @Override
    public String toString() { // @Override van toString
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < this.getIban().length(); i++) {
            if (i % 4 == 0 && i != 0) newString.append(" ");
            newString.append(this.iban.charAt(i));
        }
        return newString.toString();
    }
}
