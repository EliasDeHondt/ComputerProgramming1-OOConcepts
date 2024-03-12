/**
 @author Elias De Hondt
 * 10/10/2022
 */
public class Player {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) return;
        this.score = score;
    }
}
