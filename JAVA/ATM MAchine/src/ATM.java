import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ATM extends JFrame implements ActionListener
{
   // instance variables
   private JTextField jtfAmount = new JTextField(20);
   private JButton jbtnWithdraw = new JButton("Withdraw");
   private JButton jbtnDeposit = new JButton("Diposit");
   private JButton jbtnTransfer = new JButton("Transfer");
   private JButton jbtnBalance = new JButton("Balance");
   private ButtonGroup buttonsGroup = new ButtonGroup();
  
   private Account checkingAccount = new Account();
   private Account savingsAccount = new Account();
   private Account activeAccount = new Account();
   private Account inactiveAccount = new Account();
  
   private JPanel buttonsPanel = new JPanel();
   private JPanel mainPanel = new JPanel();
  
   private ButtonGroup radioButtonsGroup = new ButtonGroup();  
      
   // default constructor implementation
   public ATM()
   {      
       mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 20, 10));
       mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
      
       jtfAmount.setHorizontalAlignment(JTextField.RIGHT);
      
       mainPanel.add(jtfAmount);
       add(mainPanel, BorderLayout.SOUTH);
      
       radioButtonsGroup.add(checkingRadioButton);
       radioButtonsGroup.add(savingsRadioButton);      
      
       buttonsGroup.add(jbtnWithdraw);
       buttonsGroup.add(jbtnDeposit);
       buttonsGroup.add(jbtnBalance);
       buttonsGroup.add(jbtnTransfer);      
      
       buttonsPanel.setLayout(new GridLayout(3, 2, 10, 10));
       buttonsPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 0, 15));
      
       buttonsPanel.add(jbtnWithdraw);      
       buttonsPanel.add(jbtnDeposit);  
       buttonsPanel.add(jbtnTransfer);      
       buttonsPanel.add(jbtnBalance);      
       buttonsPanel.add(savingsRadioButton);      
       buttonsPanel.add(checkingRadioButton);
              
       add(buttonsPanel, BorderLayout.CENTER);
      
       checkingRadioButton.addActionListener(this);
       savingsRadioButton.addActionListener(this);
       jbtnWithdraw.addActionListener(this);
       jbtnDeposit.addActionListener(this);
       jbtnTransfer.addActionListener(this);
       jbtnBalance.addActionListener(this);      
   } // end of constructor
   // actionPerformed method implementation for checkingRadioButton
   public JRadioButton checkingRadioButton = new JRadioButton(new AbstractAction("Checking")
   {
       public void actionPerformed(ActionEvent checking)
       {
           if(checkingRadioButton.isSelected())
           {
               activeAccount = checkingAccount;
               inactiveAccount = savingsAccount;
           }
       }
   }); // end of method
  
   // actionPerformed method implementation for savingsRadioButton
   public JRadioButton savingsRadioButton = new JRadioButton(new AbstractAction("Savings")
   {
       public void actionPerformed(ActionEvent savings)
       {
           if(savingsRadioButton.isSelected())
           {
               activeAccount = savingsAccount;
               inactiveAccount = checkingAccount;
           }
       }
   }); // end of method
      
   // actionPerformed method implementation for other buttons
   public void actionPerformed(ActionEvent ae)
   {
       Object source = ae.getSource();
      
       if(source == jbtnWithdraw)
       {
           try
           {
               String str = jtfAmount.getText();
              
               double amount = Double.parseDouble(str);
              
               if(amount < 0)
               {
                   JOptionPane.showMessageDialog(null, "Amount must be a positive value");
               }
               else if(amount % 20 == 0)
               {
                   activeAccount.withdraw(amount);
                   JOptionPane.showMessageDialog(null, "Amount is withdrawn successfully");
               }
               else
               {
                   JOptionPane.showMessageDialog(null, "Amount must be in increments of 20");
               }
           }
           catch(NumberFormatException nfe)
           {
               JOptionPane.showMessageDialog(null, "Amount must be a numeric value");
           }
           catch(InsufficientFunds ife)
           {
               JOptionPane.showMessageDialog(null, "Insufficient funds!");
           }
       }      
       else if(source == jbtnDeposit)
       {          
           try
           {
               String str = jtfAmount.getText();
              
               double amount = Double.parseDouble(str);
              
               if(amount < 0)
               {
                   JOptionPane.showMessageDialog(null, "Amount must be a positive value");
               }
               else
               {
                   activeAccount.deposit(amount);
                   JOptionPane.showMessageDialog(null, "Amount is deposited successfully");
               }
           }
           catch(NumberFormatException nfe)
           {
               JOptionPane.showMessageDialog(null, "Amount must be a numeric value");
           }
       }
       else if(source == jbtnTransfer)
       {
           try
           {
               String str = jtfAmount.getText();
              
               double amount = Double.parseDouble(str);
              
               if(amount < 0)
               {
                   JOptionPane.showMessageDialog(null, "Amount must be a positive value");
               }
               else
               {
                   activeAccount.transfer(amount, inactiveAccount);
                   JOptionPane.showMessageDialog(null, "Amount is transferred successfully");
               }
           }
           catch(NumberFormatException nfe)
           {
               JOptionPane.showMessageDialog(null, "Amount must be a numeric value");
           }
           catch(InsufficientFunds ex)
           {
               JOptionPane.showMessageDialog(null, "Insufficient funds!");
           }
       }
       else if(source == jbtnBalance)
       {
           JOptionPane.showMessageDialog(null, activeAccount.getBalance());
       }
       else
       {}      
   } // end of method
   // start main method
   public static void main(String[] args)
   {
       ATM frame = new ATM();      
       frame.setTitle("ATM Machine");
       frame.setSize(300, 200);
       frame.setResizable(false);
       frame.setVisible(true);      
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } // end of method
} // end of ATM class