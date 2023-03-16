/**
 * @author Elias De Hondt
 * 21/11/2022
 */
public class Doom {
    // Attributen
    private Room room;
    // Constructors
    public Doom() {
    }
    // Methode
    public boolean isFinished() {
        return room.isFinished();
    }
    public void start() {
        while (!this.isFinished()) {
            room.update();
            room.draw();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.showInfo();
        }
    }
    public void showInfo() {
        System.out.printf("Health: %d",room.getPlayer().getHealth());
    }
}
