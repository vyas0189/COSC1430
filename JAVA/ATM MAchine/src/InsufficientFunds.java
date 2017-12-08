// InsufficientFunds class implementation
public class InsufficientFunds extends Exception
{
   // default constructor
   public InsufficientFunds()
   {
       super();
   }
   // parameterized constructor
   public InsufficientFunds(String message)
   {
       super(message);
   }
} // end of InsufficientFunds class