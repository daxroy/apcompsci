public class BankTest 
{
  public static void main(String[] args)
  {
    BankAccount a1 = new BankAccount("chen",100);
    BankAccount a2 = new BankAccount("mary cooper", 100);
    BankAccount a3 = new BankAccount();
    
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(BankAccount.getNumOfAccount());
    System.out.println(a1.getNumOfAccount());
  }
}