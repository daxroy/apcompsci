import java.util.Scanner
public class ArithmeticExpression
{
  public static void main(String[] args)
  {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Please enter your expression: ");
  String expression = scanner.nextLine();
  if(expression.indexOf("+")!=-1){
    int plusLocation = expression.indexOf("+");
    double num1 = Double.parseDouble(expression.substring(0,plusLocation));
    double num2 = Double.parseDouble(expression.substring(plusLocation+1));
    double sum = num1 + num2;
    
  else {
    System.out.println("That is not an acceptable expression"
  