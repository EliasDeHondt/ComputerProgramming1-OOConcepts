/**
 * Van Elias De Hondt
 * 14/11/2022
 */
public class Laptop {
    // Attributen
    private String eigenaar;
    private CpuGeneration  cpuGeneration;
    private CpuType cpuType;
    private int ram;
    private int disk;
    private Merk merk;
    // Constructor
    public Laptop(String eigenaar, CpuGeneration cpuGeneration, CpuType cpuType, int ram, int disk, Merk merk) {
        this.eigenaar = eigenaar;
        this.cpuGeneration = cpuGeneration;
        this.cpuType = cpuType;
        this.ram = ram;
        this.disk = disk;
        this.merk = merk;
        if (this.eigenaar == null) this.eigenaar = "onbekend eigenaar";
        if (this.cpuGeneration == null) this.cpuGeneration = CpuGeneration.ONBEKEND_GENERATION;
        if (this.cpuType == null) this.cpuType = CpuType.ONBEKEND_TYPE;
        if (this.merk == null) this.merk = Merk.ONBEKEND_MERK;
    }
    // Methods
    public String getEigenaar() { // Get...
        return eigenaar;
    }
    public CpuGeneration getCpuGeneration() { // Get...
        return cpuGeneration;
    }
    public CpuType getCpuType() { // Get...
        return cpuType;
    }
    public int getRam() { // Get...
        return ram;
    }
    public int getDisk() { // Get...
        return disk;
    }
    public Merk getMerk() { // Get...
        return merk;
    }
    @Override
    public String toString() {
        return String.format("Laptop van %s: %s (%s %s), %dGB, %dGB", this.eigenaar, this.merk, this.cpuType, this.cpuGeneration, this.ram, this.disk);
    }
}
