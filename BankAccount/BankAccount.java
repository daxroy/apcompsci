public class BankAccount
{
  private String name;
  private double balance;
  private int id;
 
  public BankAccount() {
    name = "John Smith";
    balance = 0;
    id = -1;
  }
  
  public BankAccount(String n, double b, int i) {
    name = n;
    balance = b;
    id = i;
  }
  public String toString() {
    return id+ "\t"+ name + "\tbalance = " + balance;
  }
  public void deposit(double d){
    balance = balance + d;
  }
  
  public void withdraw(double w) {
    balance = balance - w;
  }
}