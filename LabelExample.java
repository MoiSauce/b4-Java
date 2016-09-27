import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LabelExample {

	/*
	 * graded 
	 * red - 1
	 * yellow - 2
	 * green - 3
	 * blue - 4
	 */
	public static void main(String[] args) {
		//old way -- pretty simple, but we really like threads
		//createAndShowGUI();

		//this is what a basic 
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JLabels");
		
		LabelExample demo = new LabelExample();
		frame.setContentPane(demo.createContentPane());
		
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	private JPanel createContentPane() {
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		totalGUI.setBackground(Color.CYAN);
		JPanel textPanel = new JPanel();
		textPanel.setBackground(Color.PINK);
		textPanel.setLayout(null);
		textPanel.setLocation(15, 5);
		textPanel.setSize(260, 30);
		totalGUI.add(textPanel);
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setForeground(Color.RED);
		redLabel.setLocation(0, 0);
		redLabel.setSize(50, 40);
		redLabel.setHorizontalAlignment(0);
		textPanel.add(redLabel);
		
		JLabel yellowLabel = new JLabel("Yellow");
		yellowLabel.setForeground(Color.YELLOW);
		yellowLabel.setLocation(70, 0);
		yellowLabel.setSize(50, 40);
		yellowLabel.setHorizontalAlignment(0);
		textPanel.add(yellowLabel);
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);
		blueLabel.setLocation(210, 0);
		blueLabel.setSize(50, 40);
		blueLabel.setHorizontalAlignment(0);
		textPanel.add(blueLabel);
		
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setForeground(Color.GREEN);
		greenLabel.setLocation(140, 0);
		greenLabel.setSize(50, 40);
		greenLabel.setHorizontalAlignment(0);
		textPanel.add(greenLabel);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(20,45);
		redPanel.setSize(40, 40);
		totalGUI.add(redPanel);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(,45);
		bluePanel.setSize(40, 40);
		totalGUI.add(bluePanel);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setLocation(60,45);
		yellowPanel.setSize(40, 40);
		totalGUI.add(yellowPanel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(80,45);
		greenPanel.setSize(40, 40);
		totalGUI.add(greenPanel);
		
		JPanel panelForPanels = new JPanel();
		panelForPanels.setBackground(Color.LIGHT_GRAY);
		panelForPanels.setLayout(null);
		panelForPanels.setLocation(15, 40);
		panelForPanels.setSize(260, 50);
		totalGUI.add(panelForPanels);
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

}
