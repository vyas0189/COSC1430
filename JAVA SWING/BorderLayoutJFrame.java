import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class BorderLayoutJFrame extends JFrame{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 400;

	public BorderLayoutJFrame(){
		super("BorderLayout Demonstration");
		setSize(WIDTH, HEIGHT);
		setTitle("First Window Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());

		JLabel label1 = new JLabel("First Label");
		add(label1, BorderLayout.NORTH);

		JLabel label2 = new JLabel("Second Label");
		add(label2, BorderLayout.SOUTH);

		JLabel label3 = new JLabel("Third Label");
		add(label3, BorderLayout.CENTER);
	}
}