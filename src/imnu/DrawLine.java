package imnu;

import javax.swing.*;
import java.awt.*;
public class DrawLine extends JPanel {
public static void main(String[] args) {
JFrame frame = new JFrame("DrawLine");
frame.getContentPane().add(new DrawLine());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 200);
frame.setVisible(true);
}
protected void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawLine(50, 50, 200, 250);
}
}
