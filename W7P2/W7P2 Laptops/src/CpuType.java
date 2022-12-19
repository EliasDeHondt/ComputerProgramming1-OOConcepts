/**
 * Van Elias De Hondt
 * 14/11/2022
 */
public enum CpuType {
    I3,
    I5,
    I7,
    ONBEKEND_TYPE;
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }
}
