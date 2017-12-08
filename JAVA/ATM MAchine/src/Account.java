// Account class implementation
public class Account
{
   // instance variables
   private double balance;
   private int withdrawals;
   private final double SERVICE_CHARGE = 1.5;
  
   // default constructor implementation
   public Account()
   {
       balance = 0.00;
       withdrawals = 0;
   } // end of constructor
      
   // withdraw method implementation
   public void withdraw(double amount) throws InsufficientFunds
   {
       withdrawals++;
      
       double serviceCharges = getServiceCharges();
      
       if(balance < amount + serviceCharges)
           throw new InsufficientFunds();
      
       balance = balance - amount - serviceCharges;
   } // end of withdraw method
  
   // deposit method implementation
   public void deposit(double amount)
   {
       balance = balance + amount;
   } // end of deposit method
  
   // transfer method implementation
   public void transfer(double amount, Account targetAccount) throws InsufficientFunds
   {
       if(balance < amount)
           throw new InsufficientFunds();
      
       balance = balance - amount;
       targetAccount.deposit(amount);      
   } // end of transfer method
   // getBalance method implementation
   public double getBalance()
   {
       return balance;
   } // end of getBalance method
  
   // getServiceCharges method implementation
   private double getServiceCharges() throws InsufficientFunds
   {
       if(withdrawals > 4)
       {
           if(balance - SERVICE_CHARGE < 0)
               throw new InsufficientFunds();  
          
           return balance - SERVICE_CHARGE;
       }
      
       return 0;
   } // end of getServiceCharges method
} // end of Account class