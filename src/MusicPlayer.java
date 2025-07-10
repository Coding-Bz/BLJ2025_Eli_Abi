import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class MusicPlayer {
    private Player player;

    public void play(String file) {
        stop();

        try {
            player = new Player(new FileInputStream(file));
            new Thread(() -> {
                try { player.play(); }
                catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
            }).start();
        } catch (Exception e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void stop() {
        if (player != null) player.close();
    }

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.play("test.mp3");

        try { Thread.sleep(5000); } catch (Exception e) {}
        mp.stop();
    }
}