import java.util.ArrayList;
import java.util.List;

/**
 * Van Elias De Hondt
 * 20/12/2022
 */
public class GesboorteLijst {
    // Attributes
    private String babyNaam;
    private List<Geschenk> geschenken;
    // Constructors
    public GesboorteLijst(String babyNaam) {
        this.babyNaam = babyNaam;
        this.geschenken = new ArrayList<>();
    }
    // Methods
    public void voegGeschenkToe(Geschenk geschenk) {
        this.geschenken.add(geschenk);
    }
    public double koop(String geschenkNaam, String koper) throws GeboorteLijstExceptien {
        for (int i = 0; i < this.geschenken.size(); i++){
            if (this.geschenken.get(i).getGeschenkNaam().equals(geschenkNaam)) {
                if (this.geschenken.get(i).getKoper().equals(koper)) {
                    return this.geschenken.get(i).getPrijs();
                }
            }
        }
        throw new GeboorteLijstExceptien("Geschenk niet in de lijst.");
    }
    public Geschenk getGeschenk(int index) {
        return this.geschenken.get(index);
    }
    public void toon() {
        for (Geschenk geschenk : this.geschenken) {
            System.out.printf("%s", geschenk.toString());
        }
    }
}
