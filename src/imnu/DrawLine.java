package imnu;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class DrawLine extends JPanel {
	public static void main(String[] args) {
	JFrame frame = new JFrame("DrawLine");
	frame.getContentPane().add(new DrawLine());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 200);
	frame.setVisible(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.transpot();
		g.drawLine(10, 10, 100, 250);
	}
	public List <Position> transpot(){
		List<Position>point=new ArrayList<Position>();
		return point;
	}
	
}
