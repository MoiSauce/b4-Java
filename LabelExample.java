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
		
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setForeground(Color.GREEN);
		greenLabel.setLocation(140, 0);
		greenLabel.setSize(50, 40);
		greenLabel.setHorizontalAlignment(0);
		textPanel.add(greenLabel);
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);
		blueLabel.setLocation(210, 0);
		blueLabel.setSize(50, 40);
		blueLabel.setHorizontalAlignment(0);
		textPanel.add(blueLabel);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		//redPanel.setLayout(null);
		redPanel.setLocation(20,45);
		redPanel.setSize(40, 40);
		totalGUI.add(redPanel);
		
		JLabel redNum = new JLabel("1");
		redNum.setForeground(Color.BLACK);
		redNum.setLocation(20, 300);
		redNum.setSize(50, 40);
		redNum.setHorizontalAlignment(0);
		redPanel.add(redNum);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setLocation(90,45);
		yellowPanel.setSize(40, 40);
		totalGUI.add(yellowPanel);
		
		JLabel yellowNum = new JLabel("2");
		yellowNum.setForeground(Color.BLACK);
		yellowNum.setLocation(20, 300);
		yellowNum.setSize(50, 40);
		yellowNum.setHorizontalAlignment(0);
		yellowPanel.add(yellowNum);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(160,45);
		greenPanel.setSize(40, 40);
		totalGUI.add(greenPanel);
		
		JLabel greenNum = new JLabel("3");
		greenNum.setForeground(Color.BLACK);
		greenNum.setLocation(20, 300);
		greenNum.setSize(50, 40);
		greenNum.setHorizontalAlignment(0);
		greenPanel.add(greenNum);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(230,45);
		bluePanel.setSize(40, 40);
		totalGUI.add(bluePanel);
		
		JLabel blueNum = new JLabel("4");
		blueNum.setForeground(Color.BLACK);
		blueNum.setLocation(20, 300);
		blueNum.setSize(50, 40);
		blueNum.setHorizontalAlignment(0);
		bluePanel.add(blueNum);
		
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
