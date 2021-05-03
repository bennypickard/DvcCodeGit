package asDraw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class JPanelExt extends JPanel {

	//Variables
	//Image photo2 = new Image("image2.gif");
	String photo1url = "photo1.gif";
	Image photo1 = Toolkit.getDefaultToolkit().getImage(photo1url);
	String photo2url = "photo2.gif";
	Image photo2 = Toolkit.getDefaultToolkit().getImage(photo2url);
	String photo3url = "photo3.gif";
	Image photo3 = Toolkit.getDefaultToolkit().getImage(photo3url);
	String photo4url = "photo4.gif";
	Image photo4 = Toolkit.getDefaultToolkit().getImage(photo4url);
	
	
	public void paintComponent (Graphics g, String type)
	{
		//clear canvas
		super.paintComponent(g);
		
		if(type == "happy") {
			//Draw happy face
			g.setColor(Color.cyan);
	       g.fillOval(0,0,300,300);
	       g.setColor(Color.RED);
	       g.fillOval(80,75,30,30);
	       g.fillOval(190,75,30,30);
	       g.setColor(Color.black);
	       g.fillArc (75,100,150,150,0,-180);
	
		}
		else if (type == "sad") {
			//Draw sad face
			g.setColor(Color.magenta);
           g.fillOval(0,0,300,300);
           g.setColor(Color.black );
           g.fillOval(80,75,30,30);
           g.fillOval(190,75,30,30);
           g.setColor(Color.black);
           g.drawArc(75,150,150,150,0,180);
		}
		else if(type == "random") {
			
			//randomly pick an image and dislplay it
			int n = ( (int) (Math.random ( ) * 4 )  ) + 1;
			
			
			if(n==1) {
				g.drawImage(photo1,0,0,this);

			}
			else if (n==2) {
				g.drawImage(photo2,0,0,this);

			}
			else if(n==3) {
				g.drawImage(photo3,0,0,this);

			}
			else if(n==4) {
				g.drawImage(photo4,0,0,this);

			}
			

		}
	    
		
	}
	
	
	
	
	
	
	
}
