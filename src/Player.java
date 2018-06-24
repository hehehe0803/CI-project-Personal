import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {

    private int positionXPlayer = 512;
    private int positionYPlayer = 300;
    private String path = "H:\\Techkids\\class-game\\resources\\images\\circle.png";
    private BufferedImage image;

    public Player(){
        this.image = this.loadImage(path);
    }

    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            return null;
        }
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.positionXPlayer, this.positionYPlayer, 20, 20, null);
    }

    public int getPositionXPlayer() {
        return positionXPlayer;
    }

    public void setSpeedXPlayer(int n){
        positionXPlayer += n;
    }

    public int getPositionYPlayer(){
        return positionYPlayer;
    }

    public void setSpeedYPlayer(int n){
        positionYPlayer += n;
    }

}
