/**
 * @author Elias De Hondt
 * 14/11/2022
 */
public enum Merk {
    ACER,
    APPLE,
    ASUS,
    DELL,
    HP,
    LENOVO,
    MEDION,
    TOSHIBA,
    ONBEKEND_MERK;
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }
}
