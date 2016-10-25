import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ToggleButton implements ItemListener{

	//this area right below the class declaration is called "The field"
	//or "class variables" or "field variables"
	//all variables declared here can be used everywhere inside of this class
	int sizeWide = 400; int sizeHigh = 300, frameX = 400, frameY = 200;
	JToggleButton toggleButton;
	JPanel totalGUI;
	//constructor(s) usually go here
	public ToggleButton(){
		
	}//end of constructor
	
	public ToggleButton (String title){
		
	}
	
	public ToggleButton (String title, int width,int height){
		
	}
	
	//all of your methods
	public void createAndShowGUI(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame ("JToggleButton Class Project");
		
		//Create and set up the content pane.
		ToggleButton demo = new ToggleButton();
		frame.setContentPane(demo.createContentPane());
		
		frame.setSize(sizeWide, sizeHigh);
		frame.setLocation(frameX, frameY);
		frame.setVisible(true);
		
		//JOptionPane.showMessageDialog(frame, "JFrame is done!");
		
		
	}

	private JPanel createContentPane() {
		
		totalGUI = new JPanel();
		totalGUI.setBackground(Color.RED);
		
		toggleButton = new JToggleButton("Push for Red");
		toggleButton.setLocation(75,10);
		toggleButton.setSize(200,300);
		toggleButton.addItemListener(this);
		totalGUI.add(toggleButton);
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			toggleButton.setText("Push for green");
			totalGUI.setBackground(Color.RED);
			}
			else{
				toggleButton.setText("Push for red");
				totalGUI.setBackground(Color.GREEN);
		}
	}
	
}
