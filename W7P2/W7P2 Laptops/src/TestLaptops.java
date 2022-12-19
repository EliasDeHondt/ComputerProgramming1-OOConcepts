/**
 * Van Elias De Hondt
 * 14/11/2022
 */
public class TestLaptops {
    public static void main(String[] args) {
        Laptops laptops = new Laptops();
        laptops.voegToe(new Laptop("Kris", CpuGeneration.IVY_BRIDGE, CpuType.I7, 16, 256, Merk.APPLE));
        laptops.voegToe(new Laptop("Paulien", CpuGeneration.HASWELL, CpuType.I3, 8, 128, Merk.TOSHIBA));
        laptops.voegToe(new Laptop("Kay", CpuGeneration.BROADWELL, CpuType.I5, 16, 512, Merk.ACER));
        laptops.voegToe(new Laptop("Divine", CpuGeneration.KABYLAKE, CpuType.I5, 32, 1024, Merk.DELL));
        laptops.voegToe(new Laptop("Mohamed", CpuGeneration.KABYLAKE, null, 16, 512, null));

        System.out.printf("Er zijn %d laptops:\n", Laptops.getAantal());

        for (int i = 0; i < Laptops.getAantal(); i++) {
            System.out.println(Laptops.getLaptop(i));
        }
    }
}
