import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutExample implements ActionListener {

	// field vars here -- all vars here can be used
	// *everywhere* inside of this class!
	// class variable stack
	// instance vars, class vars, field vars

	JPanel totalGUI, textPanel, panelForTextFields, resultsPanel;
	JLabel userName, password, panelTitle, userLabel, passLabel;
	JTextField usernameField, passwd;
	JButton loginButton;

	public boolean loginSuccess = false;

	private int testInt = 25;

	public int getTestInt() {
		// add check code
		// for example, make sure code has been updated
		// before allowing this get
		return testInt;
	}

	public void setTestInt(int testInt) {
		// CRITICAL -- don't allow any set
		// but check, control, make sure the set is valid
		// example for grades
		if (testInt >= 0 && testInt <= 100) {
			this.testInt = testInt;
		} else {
			// syso "Wrong value, please try again"
		}
	}

	public void createAndShowGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("My First Login Screen!");

		BorderLayoutExample demo = new BorderLayoutExample();
		frame.setContentPane(demo.createContentPane());

		frame.setSize(400, 230);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	private JPanel createContentPane() {

		totalGUI = new JPanel();
		
		//totalGUI.setLayout(null);
		totalGUI.setLayout(new BorderLayout(10, 10));
		
		totalGUI.setBackground(Color.CYAN);

		/* manual layout
		// place a JLabel on totalGUI
		panelTitle = new JLabel("Pretty please login!");
		panelTitle.setLocation(75, 5);
		panelTitle.setSize(200, 40);
		panelTitle.setHorizontalAlignment(4);
		totalGUI.add(panelTitle);
		*/
		
		// BorderLayout
		panelTitle = new JLabel("Login Screen");
		panelTitle.setPreferredSize(new Dimension(290, 30));
		panelTitle.setHorizontalAlignment(0);
        //totalGUI.add(panelTitle, BorderLayout.PAGE_START);
		totalGUI.add(panelTitle, BorderLayout.NORTH);
		

		// create a panel,
		// set the layout
		// add components to the panel,
		// add the panel to totalGUI
		// add totalGUI to our JFrame

		/*
		// Creation of a Panel to contain the JLabels
		textPanel = new JPanel();
		textPanel.setLayout(null);
		textPanel.setLocation(10, 75);
		textPanel.setSize(100, 80);
		textPanel.setBackground(Color.CYAN);
		totalGUI.add(textPanel);
		*/
		
		// Creation of a Panel to contain the JLabels
        textPanel = new JPanel();
        textPanel.setBackground(Color.CYAN);
        textPanel.setPreferredSize(new Dimension(100, 80));
        //totalGUI.add(textPanel, BorderLayout.LINE_START);
        totalGUI.add(textPanel, BorderLayout.WEST);

        /*
		// add JLabel for userName
		userName = new JLabel("User Name:");
		userName.setLocation(0, 0);
		userName.setSize(90, 40);
		userName.setHorizontalAlignment(4);
		textPanel.add(userName);
		*/
		
		// Username Label
        userName = new JLabel("Username");
        userName.setPreferredSize(new Dimension(80, 30));
        userName.setHorizontalAlignment(4);
        textPanel.add(userName);

        /*
		// add JLabel for password
		password = new JLabel("Password:");
		password.setLocation(0, 40);
		password.setSize(80, 40);
		password.setHorizontalAlignment(4);
		textPanel.add(password);
		*/
        
     // Password Label
        password = new JLabel("Password");
        password.setPreferredSize(new Dimension(80, 30));
        password.setHorizontalAlignment(4);
        textPanel.add(password);

        /*
		// TextFields Panel Container
		panelForTextFields = new JPanel();
		panelForTextFields.setLayout(null);
		panelForTextFields.setBackground(Color.CYAN);
		panelForTextFields.setLocation(130, 80);
		panelForTextFields.setSize(100, 70);
		totalGUI.add(panelForTextFields);
		*/
		
		// TextFields Panel Container
        panelForTextFields = new JPanel();
        panelForTextFields.setPreferredSize(new Dimension(100, 60));
        panelForTextFields.setBackground(Color.CYAN);
        totalGUI.add(panelForTextFields, BorderLayout.CENTER);

        /*
		// Username Textfield
		usernameField = new JTextField(8);
		usernameField.setLocation(0, 0);
		usernameField.setSize(100, 30);
		panelForTextFields.add(usernameField);
		*/
		
		// Username Textfield
        usernameField = new JTextField(8);
        usernameField.setPreferredSize(new Dimension(100, 30));
        panelForTextFields.add(usernameField);

		// passwd Textfield
		passwd = new JTextField(8);
		//passwd.setLocation(0, 40);
		passwd.setPreferredSize(new Dimension(100,30));
		panelForTextFields.add(passwd);

		// results Panel Container
		resultsPanel = new JPanel();
		//resultsPanel.setLayout(null);
		resultsPanel.setBackground(Color.CYAN);
		//resultsPanel.setLocation(250, 80);
		resultsPanel.setPreferredSize(new Dimension(100,70));
		//totalGUI.add(resultsPanel, BorderLayout.EAST);
		totalGUI.add(resultsPanel, BorderLayout.LINE_END);

		// Username Label
		userLabel = new JLabel("Wrong!");
		userLabel.setForeground(Color.RED);
		//userLabel.setLocation(0, 0);
		userLabel.setPreferredSize(new Dimension(70,40));
		resultsPanel.add(userLabel);

		// password Label
		passLabel = new JLabel("Wrong!");
		passLabel.setForeground(Color.RED);
		//passLabel.setLocation(0, 40);
		passLabel.setPreferredSize(new Dimension(70, 40));
		resultsPanel.add(passLabel);

		// Button for Logging in
		loginButton = new JButton("Login");
		//loginButton.setLocation(130, 200);
		loginButton.setPreferredSize(new Dimension(80, 30));
		loginButton.addActionListener(this);
		totalGUI.add(loginButton, BorderLayout.PAGE_END);

		totalGUI.setOpaque(true);
		return totalGUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginButton) {

			handleLogin();
		}

	}

	public void handleLogin() {

		// local var or method var that describes the "scope"
		boolean nameIsGood = false, passIsGood = false;

		if (usernameField.getText().trim().compareTo("M") == 0) {
			userLabel.setForeground(Color.BLUE);
			userLabel.setText("Correct!");
			nameIsGood = true;
		} else {
			userLabel.setForeground(Color.RED);
			userLabel.setText("Wrong!");
			nameIsGood = false;
		}

		if (passwd.getText().trim().compareTo("m") == 0) {
			passLabel.setForeground(Color.BLUE);
			passLabel.setText("Correct!");
			passIsGood = true;
		} else {
			passLabel.setForeground(Color.RED);
			passLabel.setText("Wrong!");
			passIsGood = false;
		}

		if (nameIsGood && passIsGood) {
			
			//showResultJFrame("Login was successful!");
			ToggleButton myToggleButton = new ToggleButton();
			myToggleButton.createAndShowGUI();
			
			ButtonExample scoring = new ButtonExample();
			scoring.createAndShowGUI();

		} else {
			
			showResultJFrame("Sorry, login failed!");

		}

	} // end of handleLogin

	private void showResultJFrame(String theResults) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame resultFrame = new JFrame("Login Results");
		resultFrame.setSize(400, 300);
		resultFrame.setLocation(625, 200);
		JLabel resultLabel = new JLabel(theResults);
		resultFrame.add(resultLabel);
		resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resultFrame.setVisible(true);

	}


} // end of class

