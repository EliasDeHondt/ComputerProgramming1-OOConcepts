/**
 @author Van Elias De Hondt
 * 10/10/2022
 */
public class PlayerDemo {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        player1.setName("Elias");
        player2.setName("Tom");
        player3.setName("Mark");
        player1.setScore(123);
        player2.setScore(321);
        player3.setScore(666);
        System.out.print("HIGHSCORES\n----------\n");
        System.out.println(player1.getName() + " " + player1.getScore());
        System.out.println(player2.getName() + " " + player2.getScore());
        System.out.println(player3.getName() + " " + player3.getScore());
    }
}
