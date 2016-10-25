import javax.swing.SwingUtilities;

public class Executive {

	public static void main(String[] args) {
		BorderLayoutExample border = new BorderLayoutExample();
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				border.createAndShowGUI();
			}
		});

	}

}
