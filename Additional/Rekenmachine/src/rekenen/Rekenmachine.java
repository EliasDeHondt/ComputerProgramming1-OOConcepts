package rekenen;

import rekenen.plugins.Plugin;


/**
 * PEER TUTORING
 * REKENMACHINE
 */
public class Rekenmachine {
    // Attributen
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;
    // Constructors
    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        aantalPlugins = 0;
    }
    // Methode
    public void installeer(Plugin teInstallerenPlugin) {
        //Opgave 2.1.a
        if (aantalPlugins == MAX_AANTAL_PLUGINS) {
            System.out.println("Array is vol.");
            return;
        }
        for (int i = 0; i <= this.aantalPlugins; i++) {
            if (teInstallerenPlugin.equals(this.ingeladenPlugins[i])) {
                System.out.println("Plugin bestaat al.");
                return;
            }
        }
        this.ingeladenPlugins[this.aantalPlugins++] = teInstallerenPlugin;
    }
    public double bereken(String command, double x, double y) {
        //Opgave 2.1.b
        for (int i = 0; i < this.aantalPlugins; i++) {
            if (command.equals(this.ingeladenPlugins[i].getCommand())) {
                return this.ingeladenPlugins[i].bereken(x, y);
            }
        }
        System.out.println("ERROR plugin bestaat niet.");
        return Double.POSITIVE_INFINITY;
    }
    @Override
    public String toString() {
        //Opgave 2.1c
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.aantalPlugins; i++) {
            stringBuilder.append(this.ingeladenPlugins[i].getCommand()).append(" ");
        }
        return String.format("Geïnstalleerde Plugins: %s",stringBuilder);
    }
}
