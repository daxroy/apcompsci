import java.util.ArrayList;
import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int option = 0;
    while (option != 9){
      System.out.println("1. Join Queue");
      System.out.println("9. Exit Program");
      System.out.println("Select an option");
      option = Integer.parseInt(scan.nextLine());
      if (option == 1) {
        System.out.println("Please input your name: ");
        queue.add(scan.nextLine());
        System.out.println("Theere are " + queue.size() + " people on the way");
      }
    }
  }
}