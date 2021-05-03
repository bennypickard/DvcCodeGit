package asPieChart;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class PieChart extends JFrame{
	
	//variables
	private int north;
    private int south;
    private int east;
    private int west;
    private int midwest;
    
    //Constructor
    public PieChart(int north, int south, int east, int west, int midwest) throws HeadlessException {
    	super();
    	
    	//assign variables
    	this.north = north;
    	this.south = south;
        this.east = east;
        this.west = west;
        this.midwest = midwest;
    }

    //Paint override
    public void paint(Graphics g) {
    	super.paint(g);
    	
    	double total = north+south+east+west+midwest;
    	
    	
    	//ARCS[][]
    	//draw arc for north
    	int startAngle = 0;
    	int arcLength = (int)(north/total*360.0);
    	g.setColor(Color.red);
    	g.fillArc(100, 100, 300, 300, startAngle, arcLength);
    	
    	//south arc
    	startAngle = startAngle+arcLength;
        arcLength = (int)(south/total*360.0);
        g.setColor(Color.green);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        //east arc
    	startAngle = startAngle+arcLength;
        arcLength = (int)(east/total*360.0);
        g.setColor(Color.blue);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        //west arc
    	startAngle = startAngle+arcLength;
        arcLength = (int)(west/total*360.0);
        g.setColor(Color.magenta);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        //midwest arc
    	startAngle = startAngle+arcLength;
        arcLength = (int)(midwest/total*360.0);
        g.setColor(Color.yellow);
        g.fillArc(100,100,300,300,startAngle,arcLength);
        
        
        //LEGENDS[][]
        
        //north
        int xRect=100;
        int rectWidth=50;
        int horSpacing=10;
        int vertSpacing=5;
        
        int yRect=500;
        int rectHeight=10;
        g.setColor(Color.red);
        g.fillRect (xRect,yRect,rectWidth,rectHeight);
        
        int xString=xRect+rectWidth+horSpacing;
        int yString=yRect+rectHeight;
        String theString="North - " + (int)(north/total*100.0);
        g.drawString (theString,xString,yString);
    	
        
        
        //south
        
        yRect=yRect+rectHeight+vertSpacing;
        rectHeight=10;
        g.setColor(Color.green);
        g.fillRect (xRect,yRect,rectWidth,rectHeight);

        //xString=xRect+rectWidth+horSpacing;
        yString=yRect+rectHeight;
        theString="South - " + (int)(south/total*100.0);                  
        g.drawString (theString,xString,yString);
        
        
        //east
        
        yRect=yRect+rectHeight+vertSpacing;
        rectHeight=10;
        g.setColor(Color.blue);
        g.fillRect (xRect,yRect,rectWidth,rectHeight);

        //xString=xRect+rectWidth+horSpacing;
        yString=yRect+rectHeight;
        theString="East - " + (int)(east/total*100.0);                  
        g.drawString (theString,xString,yString);
        
		//west
        
        yRect=yRect+rectHeight+vertSpacing;
        rectHeight=10;
        g.setColor(Color.magenta);
        g.fillRect (xRect,yRect,rectWidth,rectHeight);

        //xString=xRect+rectWidth+horSpacing;
        yString=yRect+rectHeight;
        theString="West - " + (int)(west/total*100.0);                 
        g.drawString (theString,xString,yString);
        
        //midwest
        
        yRect=yRect+rectHeight+vertSpacing;
        rectHeight=10;
        g.setColor(Color.yellow);
        g.fillRect (xRect,yRect,rectWidth,rectHeight);

        //xString=xRect+rectWidth+horSpacing;
        yString=yRect+rectHeight;
        theString="Midwest - " + (int)(midwest/total*100.0);                  
        g.drawString (theString,xString,yString);
        
        
    }
    
    
    
}
