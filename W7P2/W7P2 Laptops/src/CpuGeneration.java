/**
 * @author Elias De Hondt
 * 14/11/2022
 */
public enum CpuGeneration {
    SANDY_BRIDGE,
    IVY_BRIDGE,
    HASWELL,
    BROADWELL,
    SKYLAKE,
    KABYLAKE,
    ONBEKEND_GENERATION;
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }
}
