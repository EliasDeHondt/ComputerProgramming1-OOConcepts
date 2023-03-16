import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 @author Van Elias De Hondt
 * 8/12/2022
 */
public class LottoGetallen {
    // Attributen
    private List<Integer> getallen;
    private int[] lottoGetallen;
    // Constructors
    public LottoGetallen() {
        this.lottoGetallen = new int[6];
        this.getallen = new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            this.getallen.add(i);
        }
    }
    // Methode
    public void genereerLottoGetallen() {
        Collections.shuffle(this.getallen);

        for (int i = 0; i < 6; i++) {
            this.lottoGetallen[i] = this.getallen.get(i);
        }
        Arrays.sort(this.lottoGetallen);
    }
    public String toonLottoGetallen() {
        return String.format("%d %d %d %d %d %d",
                this.lottoGetallen[0],this.lottoGetallen[1],this.lottoGetallen[2],
                this.lottoGetallen[3],this.lottoGetallen[4],this.lottoGetallen[5]);
    }
}
