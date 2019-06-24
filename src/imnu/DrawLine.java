package imnu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;


public class DrawLine extends JPanel {
	public List<Position>point=new ArrayList<Position>();

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("DrawLine");
		frame.getContentPane().add(new DrawLine());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200, 100); 
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		
		
        
		}
		public void paintComponent(Graphics g) {
			
			
			
			
			super.paintComponent(g);
			DrawLine position=new DrawLine();
			
			 ImgInfoBean imgInfoBean = new SampleUsage().parseImgInfo("F:/IMG_20190624_084415.jpg");
			 float latitude=imgInfoBean.getLatitudeNumber();
			 float longitude=imgInfoBean.getLongitudeNumber();
			 System.out.println(latitude+"  "+longitude);
			
			int number1=10;
			int number2=2;
			int i;
			for(i=0;i<6;i++){
				Position x=new Position();
				
				x.x=number1;
				x.y=number2;
				number1=number1+50;
				number2=number2*3;
				position.point.add(x);
			}
			
			int flag=0;
			int x1=0;
			int y1=0;
			for(Position x2:position.point){
				if(flag==1){
					g.drawLine(x1,y1,x2.x,x2.y);
				}
				x1=x2.x;
				y1=x2.y;
				flag=1;
			}
			
		}
}
