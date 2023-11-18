package snippet;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
 public static void main(String[] args) {
  JFrame obj = new JFrame();
  JPanel gamePlay = new JPanel();

  obj.setBounds(10, 10, 700, 600);
  obj.setBackground(Color.DARK_GRAY);
  obj.setResizable(false);
  obj.setVisible(true);
  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  obj.add(gamePlay);
 }
}
