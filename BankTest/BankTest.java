public class BankTest
{
  public static void main(String[] args)
  {
    BankAccount a1 = new BankAccount();
    BankAccount a1 = new BankAccount(-1, "Hugh G Reckshon", 0);
    BankAccount a2 = new BankAccount(0, "Heywood Jablowme", 100);
    System.out.print(a2);
    a2.deposit(50);
    System.out.print(a2);
    a2.withdraw(80);
    System.out.print(a2);
  }
}