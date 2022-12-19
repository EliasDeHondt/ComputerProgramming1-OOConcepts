import java.util.Random;

/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Player extends Doom{
    // Attributen
    private static final double STAET_HEALTH = 9;
    private double health;
    private int x;
    private int y;
    private Random random;
    private Room room;
    // Constructors
    public Player(int x, int y) {
        this.health = STAET_HEALTH;
        this.x = x;
        this.y = y;
        //
    }
    // Methode
    public void setRoom(Room room) { // Set..
        this.room = room;
    }
    public Room getRoom() { // Get..
        return room;
    }
    public int getX() { // Get..
        return x;
    }
    public int getY() { // Get..
        return y;
    }
    public void attack(double attack) {
        this.health =- attack;
    }
    public double getHealth() { // Get..
        return health;
    }
    public boolean isDeath() {
        return this.health <= 0;
    }
    public void move() {
        random = new Random();
        int newX = random.nextInt(0,2);
        int newY = random.nextInt(0,2);
        if (room.isFree(newX,newY)) {
            switch (newX) {
                case 0: this.x =+ 1; break;
                case 1: this.x =- 1; break;
            }
            switch (newY) {
                case 1: this.y =+ 1; break;
                case 2: this.y =- 1; break;
            }
        }
    }
    @Override
    public String toString() { // toString
        return "P";
    }
}
