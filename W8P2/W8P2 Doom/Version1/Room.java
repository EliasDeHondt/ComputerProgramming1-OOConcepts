/**
 * Van Elias De Hondt
 * 21/11/2022
 */
public class Room {
    // Attributen
    private static final int WIDTH = 50;
    private static final int HEIGHT = 20;
    private Player player;
    private char[][] floorPlan;
    // Constructors
    public Room(Player player) {
        floorPlan = new char[HEIGHT][WIDTH];
        this.player = player;
    }
    // Methode
    public void createFloorplan() {
        for (int w = 0; w < WIDTH; w++) {
            for (int h = 0; h < HEIGHT; h++) {
                if (w == 0 || w == WIDTH) floorPlan[h][w] = '|';
                if (h == 0 || h == HEIGHT) floorPlan[h][w] = '-';
                else floorPlan[w][h] = ' ';
            }
        }
    }
    public void draw() {
        this.createFloorplan();
        for (int w = 0; w < WIDTH; w++) {
            for (int h = 0; h < HEIGHT; h++) {
                System.out.print(this.floorPlan[h][w]);
            }
            System.out.println();
        }
    }
    public boolean isFinished() {
        return player.getHealth() == 0;
    }
    public boolean isFree(int x, int y) {
        return this.floorPlan[x][y] == ' ';
    }
    public void update() {
        for (int w = 0; w < WIDTH; w++) {
            for (int h = 0; h < HEIGHT; h++) {
                if (floorPlan[h][w] == 'P') floorPlan[h][w] = ' ';
            }
        }
        player.move();
        this.floorPlan[player.getX()][player.getY()] = player.toString().charAt(0);
    }
    public Player getPlayer() { // Get..
        return player;
    }
}
