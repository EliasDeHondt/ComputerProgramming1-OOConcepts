/**
 * Van Elias De Hondt
 * 19/12/2022
 */
public class  BankAccountValidator {
    public static boolean isValidBelgianIban(String iban) {
        int controlegetal;
        int bankcode;
        int rekeningnummer;
        int nationaalControlegetal;
        if(!(iban.length() == 16)) return false;
        if (!(iban.charAt(0) == 'B' && iban.charAt(1) == 'E')) return false;
        if (!(iban.matches("BE[0-9]{14}"))) return false;
        try {
            controlegetal = Integer.parseInt(iban.substring(2,4));
            bankcode = Integer.parseInt(iban.substring(4,7));
            rekeningnummer = Integer.parseInt(iban.substring(7,14));
            nationaalControlegetal = Integer.parseInt(iban.substring(14,16));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (((bankcode * 10000000L + rekeningnummer)%97 != nationaalControlegetal)) return false;
        return controlegetal > 2 && controlegetal < 98;
    }
}
