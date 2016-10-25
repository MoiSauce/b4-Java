import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonExample implements ActionListener{
	
	JButton redButton, blueButton, resetButton;
	JLabel redScore, blueScore;
	
	int redScoreAmount, blueScoreAmount;

	public void createAndShowGUI() {
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame ("Red vs Blue");
		
		ButtonExample demo = new ButtonExample();
		frame.setContentPane(demo.createContentPane());
		
		
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(500,300);
		frame.setVisible(true);
	}
	
	private JPanel createContentPane(){
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.PINK);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(75, 0);
		titlePanel.setSize(250, 30);
		totalGUI.add(titlePanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(75, 120);
		buttonPanel.setSize(250, 70);
		totalGUI.add(buttonPanel);
		
		
		JLabel redLabel = new JLabel("Red Team");
		redLabel.setLocation(0, 0);
		redLabel.setSize(100, 30);
		redLabel.setHorizontalAlignment(0);
		redLabel.setForeground(Color.RED);
		titlePanel.add(redLabel);
		
		JLabel blueLabel = new JLabel("Blue Team");
		blueLabel.setLocation(120, 0);
		blueLabel.setSize(100, 30);
		blueLabel.setHorizontalAlignment(0);
		blueLabel.setForeground(Color.BLUE);
		titlePanel.add(blueLabel);
		
		JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(75, 75);
		scorePanel.setSize(250, 30);
		totalGUI.add(scorePanel);
		
		redScore = new JLabel("0");
		redScore.setLocation(0, 0);
		redScore.setSize(100, 30);
		redScore.setHorizontalAlignment(0);
		redScore.setForeground(Color.RED);
		scorePanel.add(redScore);
		
		blueScore = new JLabel("0");
		blueScore.setLocation(125, 0);
		blueScore.setSize(100, 30);
		blueScore.setHorizontalAlignment(0);
		blueScore.setForeground(Color.BLUE);
		scorePanel.add(blueScore);
		
		redButton = new JButton("Red Score!");
		redButton.setLocation(5, 5);
		redButton.setSize(120, 30);
		redButton.addActionListener(this);
		buttonPanel.add(redButton);
		
		blueButton = new JButton("Blue Score!");
		blueButton.setLocation(125, 5);
		blueButton.setSize(120, 30);
		blueButton.addActionListener(this);
		buttonPanel.add(blueButton);
		
		resetButton = new JButton("Reset Scores!");
		resetButton.setLocation(5, 38);
		resetButton.setSize(240, 30);
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton);
		
		
		
		
		
		
		
		totalGUI.setOpaque(true);
		return totalGUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		if(e.getSource() == redButton)
		{
			redScoreAmount = redScoreAmount + 1;
			redScore.setText (""+redScoreAmount);
		}
		
		else if(e.getSource() == blueButton)
		{
			blueScoreAmount = blueScoreAmount + 1;
			blueScore.setText (""+blueScoreAmount);
		}
		
		else if(e.getSource() == resetButton)
		{
			redScoreAmount = 0;
			redScore.setText (""+redScoreAmount);
			blueScoreAmount = 0;
			blueScore.setText (""+blueScoreAmount);
		} else {
			//JOP "Sorry, you broke it..."
		}
		
	}

}
