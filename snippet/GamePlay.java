package snippet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
  timer = new Timer(delay, this);
  timer.start();
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
