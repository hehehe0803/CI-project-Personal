import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameCanvas extends JPanel {

//    BufferedImage starImage;
//    BufferedImage enemyImage;
//    BufferedImage playerImage;

    //BackBuffered
    private BufferedImage backBuffered;
    private Graphics graphics;
    private Background background = new Background();

    private List<Star> starList = new ArrayList<>();
    private List<Enemy> enemyList = new ArrayList<>();
    protected Player player = new Player();


    public GameCanvas() {
        this.setSize(1024, 600);

        this.setupBackBuffered();

        for (int i = 0; i < 50; i++) {
            this.createStar();
        }

        this.createEnemy();

        this.createPlayer();

        this.renderAll();

        this.setVisible(true);

        this.runAll();
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
    }
    private void createPlayer() {
        Player player = new Player();
    }
    private void createEnemy() {
        Enemy enemy = new Enemy();
        this.enemyList.add(enemy);
    }
    private void createStar() {
        Star star = new Star();
        this.starList.add(star);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        this.background.render(graphics);

        this.player.render(graphics);

        this.starList.forEach(star -> star.render(graphics));

        this.enemyList.forEach(enemy -> enemy.render(graphics));

        this.repaint();
    }

    public void runAll() {
        this.starList.forEach(star -> star.run());
        this.enemyList.forEach(enemy -> enemy.run());
    }


}
