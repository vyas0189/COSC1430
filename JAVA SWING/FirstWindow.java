import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class FirstWindow extends JFrame{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public FirstWindow(){
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("First Window Class");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JButton endButton = new JButton("Click to end program");
		endButton.addActionListener(new EndingListener());
		add(endButton);

		//JLabel greeting = new JLabel("Hello");
		//add(greeting);
		Color color = Color.BLUE;
		getContentPane().setBackground(color);
	}



	public static void main(String []args){
		FirstWindow firstWindow = new FirstWindow();
		firstWindow.setVisible(true);

	}
}