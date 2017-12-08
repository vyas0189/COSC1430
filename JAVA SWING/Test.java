//package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;

public class Test {

	private JFrame Test;
	private JTextField LastNameField;
	private JTextField FirstNameField;
	private JTextField IDField;
	private JTextField EmailField;

	private String LName;
	private String FName;
	private String ID;
	private String EmailAddress;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.Test.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Test = new JFrame();
		Test.setBounds(100, 100, 450, 300);
		Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Test.getContentPane().setLayout(null);
		
		JPanel EndPanel = new JPanel();
		EndPanel.setBounds(172, 217, 82, 33);
		Test.getContentPane().add(EndPanel);
		
		JButton btnClicktoEnd = new JButton("ClickToEnd");
		btnClicktoEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent end) {
				System.out.println("End");
				System.exit(0);
			}
		});
		EndPanel.add(btnClicktoEnd);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBounds(10, 11, 414, 24);
		Test.getContentPane().add(TitlePanel);
		
		JLabel Class = new JLabel("COSC1430");
		Class.setBackground(Color.BLACK);
		Class.setForeground(Color.WHITE);
		Class.setOpaque(true);
		Class.repaint();
		TitlePanel.add(Class);
		
		JPanel DetailPanel = new JPanel();
		DetailPanel.setBounds(10, 34, 414, 139);
		Test.getContentPane().add(DetailPanel);
		DetailPanel.setLayout(null);
		
		JLabel LastName = new JLabel("Last Name");
		LastName.setBounds(10, 11, 74, 21);
		DetailPanel.add(LastName);
		
		LastNameField = new JTextField();
		LastNameField.setBounds(106, 11, 207, 20);
		DetailPanel.add(LastNameField);
		LastNameField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 43, 74, 21);
		DetailPanel.add(lblFirstName);
		
		FirstNameField = new JTextField();
		FirstNameField.setColumns(10);
		FirstNameField.setBounds(106, 43, 207, 20);
		DetailPanel.add(FirstNameField);
		
		JLabel PISDLabel = new JLabel("PISD");
		PISDLabel.setBounds(10, 75, 74, 21);
		DetailPanel.add(PISDLabel);
		
		IDField = new JTextField();
		IDField.setColumns(10);
		IDField.setBounds(106, 75, 207, 20);
		DetailPanel.add(IDField);
		
		JLabel Email = new JLabel("Email");
		Email.setBounds(10, 107, 74, 21);
		DetailPanel.add(Email);
		
		EmailField = new JTextField();
		EmailField.setColumns(10);
		EmailField.setBounds(106, 107, 207, 20);
		DetailPanel.add(EmailField);
		
		JPanel OutputPanel = new JPanel();
		OutputPanel.setBounds(10, 172, 414, 45);
		Test.getContentPane().add(OutputPanel);
		OutputPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel FirstNameOutput = new JLabel("FirstName:");
		OutputPanel.add(FirstNameOutput);
		
		JLabel IDOutput = new JLabel("PISD: ");
		OutputPanel.add(IDOutput);
		
		JLabel LastNameOutput = new JLabel("LastName: ");
		OutputPanel.add(LastNameOutput);
		
		JLabel EmailOutPut = new JLabel("Email: ");
		OutputPanel.add(EmailOutPut);
		
		JButton UpdateLastName = new JButton("Update");
		UpdateLastName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent updateLast) {
				LName = LastNameField.getText();
				LastNameOutput.setText("Last Name: " + LName);
			}
		});
		UpdateLastName.setBounds(323, 10, 89, 20);
		DetailPanel.add(UpdateLastName);
		
		JButton UpdateFirstName = new JButton("Update");
		UpdateFirstName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent updateFirst) {
				FName = FirstNameField.getText();
				FirstNameOutput.setText("First Name: " + FName);
			}
		});
		UpdateFirstName.setBounds(323, 42, 89, 20);
		DetailPanel.add(UpdateFirstName);
		
		JButton UpdatePISD = new JButton("Update");
		UpdatePISD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ID = IDField.getText();
				IDOutput.setText("PISD: " + ID);
			}
		});
		UpdatePISD.setBounds(323, 74, 89, 20);
		DetailPanel.add(UpdatePISD);
		
		JButton UpdateEmail = new JButton("Update");
		UpdateEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmailAddress = EmailField.getText();
				EmailOutPut.setText("Email: " + EmailAddress);
			}
		});
		UpdateEmail.setBounds(323, 106, 89, 20);
		DetailPanel.add(UpdateEmail);
		
		JButton UpdateAll = new JButton("UpdateAll");
		UpdateAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LName = LastNameField.getText();
				LastNameOutput.setText("Last Name: " + LName);
				FName = FirstNameField.getText();
				FirstNameOutput.setText("First Name: " + FName);
				ID = IDField.getText();
				IDOutput.setText("PISD: " + ID);
				EmailAddress = EmailField.getText();
				EmailOutPut.setText("Email: " + EmailAddress);
			}
		});
		UpdateAll.setBounds(316, 217, 108, 33);
		Test.getContentPane().add(UpdateAll);
	}
}
