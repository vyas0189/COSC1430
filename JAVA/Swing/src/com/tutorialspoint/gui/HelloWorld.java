package com.tutorialspoint.gui;

import javax.swing.*;
import java.awt.*;



public class HelloWorld extends JFrame{

    private JTextField FirstNameField;
    private JTextField LastNameField;
    private JTextField AgeField;
    private JTextField IDField;

    private String FName;
    private String LName;
    private String sAgae;
    private String sID;

    public static void main(String[] args) {
        HelloWorld window  =new HelloWorld();
        window.setVisible(true);
    }

    private HelloWorld(){
        initialize();
    }
    private void initialize(){

        setBounds(100,100,450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel EndPanel = new JPanel();
        EndPanel.setBounds(172,217,82,33);
        getContentPane().add(EndPanel);

        JButton clickToEnd = new JButton("Click to Exit");
        clickToEnd.addActionListener(e -> System.exit(0));
        EndPanel.add(clickToEnd);

        JPanel title = new JPanel();
        title.setBounds(10,11,414,24);
        getContentPane().add(title);

        JLabel tName = new JLabel("TEST 1");
        tName.setBackground(Color.blue);
        tName.setForeground(Color.WHITE);
        tName.setOpaque(true);
        tName.repaint();
        title.add(tName);

        JPanel InfoPanel = new JPanel();
        InfoPanel.setBounds(10,34,414,139);
        getContentPane().add(InfoPanel);
        InfoPanel.setLayout(null);

        JLabel LastName = new JLabel("Last Name");
        LastName.setBounds(11,11,74,21);
        InfoPanel.add(LastName);

        LastNameField = new JTextField();
        LastNameField.setBounds(106, 11,207,20);
        InfoPanel.add(LastNameField);
        LastNameField.setColumns(10);

        JLabel FirstName = new JLabel("First Name");
        FirstName.setBounds(11,43,74,21);
        InfoPanel.add(FirstName);

        FirstNameField = new JTextField();
        FirstNameField.setBounds(106,43,207,20);
        InfoPanel.add(FirstNameField);
        FirstNameField.setColumns(10);

        JLabel Age = new JLabel("Age");
        Age.setBounds(11,75,74,21);
        InfoPanel.add(Age);

        AgeField = new JTextField();
        AgeField.setBounds(106,75,207,20);
        InfoPanel.add(AgeField);
        AgeField.setColumns(10);

        JLabel ID = new JLabel("ID");
        ID.setBounds(11,107,74,21);
        InfoPanel.add(ID);

        IDField = new JTextField();
        IDField.setBounds(106,107,207,21);
        InfoPanel.add(IDField);
        IDField.setColumns(10);

        JPanel outPut = new JPanel();
        outPut.setBounds(10,172,412,45);
        getContentPane().add(outPut);
        outPut.setLayout(new GridLayout(2,2,0,0));

        JLabel FirstNameOutput = new JLabel("First Name: ");
        outPut.add(FirstNameOutput);

        JLabel LastNameOutput = new JLabel("Last Name: ");
        outPut.add(LastNameOutput);

        JLabel AgeOutput = new JLabel("Age: ");
        outPut.add(AgeOutput);

        JLabel IDOutput = new JLabel("ID: ");
        outPut.add(IDOutput);




    }
}