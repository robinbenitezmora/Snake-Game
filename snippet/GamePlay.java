package snippet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

  private int[] snakexlength = new int[650];
  private int[] snakeylength = new int[650];

  private boolean left = false;
  private boolean right = false;
  private boolean up = false;
  private boolean down = false;

  private ImageIcon rightmouth;
  private ImageIcon leftmouth;
  private ImageIcon upmouth;
  private ImageIcon downmouth;

  private int lengthofsnake = 3;

  private Timer timer;
  private int delay = 100;
  private ImageIcon snakeimage;

  private int[] enemyxpos = { 25, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475,
      500, 525, 550, 575, 600, 625, 650, 675, 700, 725, 750, 775, 800, 825, 850 };
  private int[] enemyypos = { 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500,
      525, 550, 575, 600, 625 };
  private ImageIcon enemyimage;
  private Random random = new Random();
  private int xpos = random.nextInt(34);
  private int ypos = random.nextInt(23);

  private int score = 0;
  private int moves = 0;

  private ImageIcon titlImage;

  public GamePlay() {
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    timer = new Timer();
    timer.schedule(new GameTimerTask(), 0, delay);
  }

  class GameTimerTask extends TimerTask {
    @Override
    public void run() {
      // Add your game logic here
    }
  }

  public void paint(Graphics g) {
    if (moves == 0) {
      snakexlength[2] = 50;
      snakexlength[1] = 75;
      snakexlength[0] = 100;

      snakeylength[2] = 100;
      snakeylength[1] = 100;
      snakeylength[0] = 100;
    }

    // draw title image border
    g.setColor(Color.white);
    g.drawRect(24, 10, 851, 55);

    // draw the title image
    titlImage = new ImageIcon("snaketitle.jpg");
    titlImage.paintIcon(this, g, 25, 11);

    // draw border for gameplay
    g.setColor(Color.white);
    g.drawRect(24, 74, 851, 577);

    // draw background for the gameplay
    g.setColor(Color.black);
    g.fillRect(25, 75, 850, 575);

    // draw scores
    g.setColor(Color.white);
    g.setFont(new Font("arial", Font.PLAIN, 14));
    g.drawString("Scores: " + score, 780, 30);

    // draw length
    g.setColor(Color.white);
    g.setFont(new Font("arial", Font.PLAIN, 14));
    g.drawString("Length: " + lengthofsnake, 780, 50);

    rightmouth = new ImageIcon("rightmouth.png");
    rightmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);

    for (int a = 0; a < lengthofsnake; a++) {
      if (a == 0 && right) {
        rightmouth = new ImageIcon("rightmouth.png");
        rightmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
      }
      if (a == 0 && left) {
        leftmouth = new ImageIcon("leftmouth.png");
        leftmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
      }
      if (a == 0 && up) {
        upmouth = new ImageIcon("upmouth.png");
        upmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
      }
      if (a == 0 && down) {
        downmouth = new ImageIcon("downmouth.png");
        downmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
      }
      if (a != 0) {
        snakeimage = new ImageIcon("snakeimage.png");
        snakeimage.paintIcon(this, g, snakexlength[a], snakeylength[a]);
      }
    }

    enemyimage = new ImageIcon("enemy.png");

    if ((enemyxpos[xpos] == snakexlength[0]) && (enemyypos[ypos] == snakeylength[0])) {
      score++;
      lengthofsnake++;
      xpos = random.nextInt(34);
      ypos = random.nextInt(23);
    }

    enemyimage.paintIcon(this, g, enemyxpos[xpos], enemyypos[ypos]);

    for (int b = 1; b < lengthofsnake; b++) {
      if (snakexlength[b] == snakexlength[0] && snakeylength[b] == snakeylength[0]) {
        right = false;
        left = false;
        up = false;
        down = false;

        g.setColor(Color.white);
        g.setFont(new Font("arial", Font.BOLD, 50));
        g.drawString("Game Over", 300, 300);

        g.setFont(new Font("arial", Font.BOLD, 20));
        g.drawString("Space to RESTART", 350, 340);
      }
    }

    g.dispose();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
  }

}
