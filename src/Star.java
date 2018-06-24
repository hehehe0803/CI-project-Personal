import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.image.BufferedImage;

public class Star {

    private Random rand;
    private int positionX;
    private int positionY;
    private int speedX;
//    private int speedY;
    private static String path = "H:\\Techkids\\class-project\\resources\\images\\star.png";
    private BufferedImage image;


    public Star() {
        this.rand = new Random();
        this.positionX = rand.nextInt(1024);
        this.positionY = rand.nextInt(600);
        this.speedX = rand.nextInt(5 + 1 + 5) - 5;
//        this.speedY = rand.nextInt(5 + 1 + 5) - 5;
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
        graphics.drawImage(this.image, this.positionX, this.positionY, 5, 5, null);

    }

    public void run() {
        positionX += speedX;
//        positionY += speedY;
    }


}
