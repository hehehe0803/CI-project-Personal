import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Enemy {
    private Random rand;
    private int positionX;
    private int positionY;
    private int speedX;
    private int speedY;
    private String path = "H:\\Techkids\\class-game\\resources\\images\\circle.png";
    private BufferedImage image;

    public Enemy() {
        this.rand = new Random();
        this.positionX = rand.nextInt(1024);
        this.positionY = rand.nextInt(600);
        this.speedX = rand.nextInt(5 + 1 + 5) - 5;
        this.speedY = rand.nextInt(5 + 1 + 5) - 5;
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
        graphics.drawImage(this.image, this.positionX, this.positionY, 20, 20, null);

    }

    public void run() {
        this.positionX += this.speedX;
        this.positionY += this.speedY;

        if (this.positionX < 0 || this.positionX > 1024 - 20)
                this.speedX = -this.speedX;

        if (this.positionY < 0 || this.positionY > 600 - 20)
            this.speedY = -this.speedY;
    }


}
