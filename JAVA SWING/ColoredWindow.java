import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ColoredWindow extends JFrame{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public ColoredWindow(Color color){
		super("No charge for color");
		setSize(WIDTH, HEIGHT);
		setTitle("First Window Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setBackground(color);

		JLabel greeting = new JLabel("Label Example");
		add(greeting);
	}

	public ColoredWindow(){
		this(Color.PINK);
	}
}