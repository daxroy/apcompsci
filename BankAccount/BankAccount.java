public class BankAccount
{
    private static int numOfAccount = 0;
    private int id;
    private String name;
    private double balance;
   
    public BankAccount()
    {
      numOfAccount = numOfAccount+1;
      id = numOfAccount;
      name = "John Smith";
      balance = 0;
    }
   
    public BankAccount( String n, double b)
    {
      numOfAccount++;
      id = numOfAccount;
      name = n;
      balance = b;
    }
    
    
    public String toString()
    {
      return id + "\t" + name + "balance =" + balance;    
    }
    
    
    public boolean equals(BankAccount other)
    {
      return balance == other.getBalance();
    }
    
    
    public double getBalance()
    {
      return balance;
    }
    
    
    public void deposit(double d)
    {
      balance = balance + d;
    }
 
    public void withdraw(double w)
    {
      balance = balance - w;
    }
    
    public static int getNumOfAccount()
    {
      return numOfAccount;
    }
  
}