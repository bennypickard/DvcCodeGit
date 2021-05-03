package asDraw;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExt extends JFrame implements ActionListener {
	
	//VARIABLES[][][]
	//3 FRAMES
	
	//Main
	private JPanel jpMain = new JPanel();
	
	//content panels
    private JPanelExt jpCanvas = new JPanelExt(); //mainPanel is the content Panel
	private JPanel	jpOption = new JPanel();

	
    //3 BUTTONS
    private JButton jbtHappy = new JButton("Happy");
    private JButton jbtSad = new JButton("Sad");
    private JButton jbtRandom = new JButton("Random");

	
    //[][]CONSTRUCTOR[][]
	public JFrameExt() {
		super();
		
		
		this.setContentPane(jpMain);
		
		//LAYOUT[][]
		GridLayout g1 = new GridLayout(2,1);
    	jpMain.setLayout(g1);
    	
    	jpMain.add(jpCanvas);
    	jpMain.add(jpOption);
    	
    	//COLORS[]
    	jpCanvas.setBackground(Color.yellow);
    	jpOption.setBackground(Color.green);
    	
    	
    	
    	
    	//Add buttons[]
    	jpOption.add(jbtHappy);
    	jpOption.add(jbtSad);
    	jpOption.add(jbtRandom);
    	
    	
    	//Add Listeners[]
    	
        jbtHappy.addActionListener(this);
        jbtSad.addActionListener(this);
        jbtRandom.addActionListener(this);

		
	}
	
	//[][]event handler[][]
    public void actionPerformed(ActionEvent ev) {
    	//invoked when a button is clicked
    	
        
        //ADD functionality
        if(ev.getSource() == jbtHappy)
        {
        	jpCanvas.paintComponent(getGraphics(), "happy");

           
        }
        else if(ev.getSource() == jbtSad)
        {
        	jpCanvas.paintComponent(getGraphics(), "sad");
           
        }
        else if(ev.getSource() == jbtRandom)
        {
        	jpCanvas.paintComponent(getGraphics(), "random");
        	
        }
        
    	
    }
	
	
	
	
	
	
	
	

}
