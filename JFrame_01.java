import javax.swing.JFrame;

public class JFrame_01 {

	public static void main(String[] args) {
		/*
		 * Graded checkpoint
		 * 1. JOP and jar
		 * 2. put this in a while loop - while(true)
		 * 3. JOP "What do you want for a title?"
		 * 4. JOP "What width do you want"
		 * 5. JOP "What height do you want"
		 * 6. JOP "Do you want to create another window?(Y/N)"
		 * 7. if no, do a graceful exit like this ---
		 * 8. "Thank you, goodbye"
		 */
		String title = "My first window!";
		int width = 800;
		int height = 600;
		
		createJFrame(title,width,height);
		
	}	
	//name for this type of code is called a "method"
	public static void createJFrame(String topTitle, int ) {
		
		JFrame frame = new JFrame("Yo! I'm making a window!");
		//frame is the name of an object created from the JFrame class
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		
	}
	
}
