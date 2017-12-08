import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class GridLayoutJFrame extends JFrame{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 400;

	public GridLayoutJFrame(int rows, int columns){
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("GridLayout Demonstration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(rows, columns));

		JLabel label1 = new JLabel("First Label");
		add(label1);

		JLabel label2 = new JLabel("Second Label");
		add(label2);

		JLabel label3 = new JLabel("Third Label");
		add(label3);

		JLabel label4 = new JLabel("Fourth Label");
		add(label4);

		JLabel label5 = new JLabel("Fifth Label");
		add(label5);
	}

	public static void main(String [] args){
		GridLayoutJFrame a = new GridLayoutJFrame(2,3);
		a.setVisible(true);
	}
}