import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDemo extends JFrame implements ActionListener{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 400;

	private JPanel redPanel;
	private JPanel whitePanel;
	private JPanel bluePanel;

	public PanelDemo(){
		super("Panel Demonstration");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel biggerPanel = new JPanel();
		biggerPanel.setLayout(new GridLayout(1,3));

		redPanel = new JPanel();
		redPanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(redPanel);


		whitePanel = new JPanel();
		whitePanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(whitePanel);

		bluePanel = new JPanel();
		bluePanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(bluePanel);

		add(biggerPanel, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setLayout(new FlowLayout());

		JButton redButton = new JButton("Red");
		redButton.setBackground(Color.RED);
		redButton.addActionListener(this);
		buttonPanel.add(redButton);

		JButton whiteButton = new JButton("White");
		whiteButton.setBackground(Color.WHITE);
		whiteButton.addActionListener(this);
		buttonPanel.add(whiteButton);

		JButton blueButton = new JButton("Green");
		blueButton.setBackground(Color.GREEN);
		blueButton.addActionListener(this);
		buttonPanel.add(blueButton);

		add(buttonPanel, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e){
		String buttonString = e.getActionCommand();

		if(buttonString.equals("Red"))
			redPanel.setBackground(Color.RED);
		else if(buttonString.equals("White"))
			whitePanel.setBackground(Color.WHITE);
		else if(buttonString.equals("Green"))
			bluePanel.setBackground(Color.GREEN);
		else
			System.out.println("Unexpected error");
	}

	public static void main(String []args){
		PanelDemo gui = new PanelDemo();
		gui.setVisible(true);
	}
	
}