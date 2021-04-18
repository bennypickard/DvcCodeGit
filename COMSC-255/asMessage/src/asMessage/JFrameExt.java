package asMessage;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JFrameExt extends JFrame implements ActionListener{

	
	private JTextField jtfMessage = new JTextField(10);
	private JButton jbtClickMe = new JButton("Click Me");
	private JButton jbtClickMeToo = new JButton("Click Me Too");
	private JPanel jpMain = new JPanel();
	private int count = 0;
	
	//[][][]CONSTRUCTOR
	public JFrameExt() {
		super();
		
		//create layout manager
		FlowLayout fl = new FlowLayout();
		
		//set fl to jpMain layout manager
		jpMain.setLayout(fl);
		
		//make jpMain as the selected content pane
		this.setContentPane(jpMain);
		
		//add GUI to container
		jpMain.add(jbtClickMe);
		jpMain.add(jtfMessage);
		jpMain.add(jbtClickMeToo);
		
		//make text field non editable
		jtfMessage.setEditable(false);
		
		//register this object as an actionListener with each button
		jbtClickMe.addActionListener(this);
		jbtClickMeToo.addActionListener(this);
		
		//Action event function. Called by button functions when clicked.
	}
	
	//[][]ACTIONPERFORMED
	public void actionPerformed(ActionEvent e){
		
		//check which button is clicked
		if(e.getSource() == jbtClickMe)
		{
			count++;
			jtfMessage.setText("Hello " + count);
		}
		else if(e.getSource() == jbtClickMeToo)
		{
			count--;
			jtfMessage.setText("Hello " + count);
		}
			
		
	}


	
	
	
	
	
}
