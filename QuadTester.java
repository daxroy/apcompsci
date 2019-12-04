//testing class built by Huo Chen; Last Update 11/16/2018
public class QuadTester
{
  public static void main(String[] args)
  {
    System.out.println("Begin TEST!");
    System.out.println();
    
    System.out.print("Constructing a Quadrilateral called q1 using no-arges constructor...");
    Quadrilateral q1 = new Quadrilateral();
    System.out.println("PASSED");
    System.out.println();
      
    System.out.print("Constructing a Quadrilateral called q2 using parameterized constructor...");
    Quadrilateral q2 = new Quadrilateral(1,2,3,4);
    System.out.println("PASSED");
    System.out.println();
      
    System.out.print("Checking instant variables...");
    if(q1.getS1()==1 && q1.getS2()==1 && q1.getS3()==1 && q1.getS4()==1 && q2.getS1()==1 && q2.getS2()==2 && q2.getS3()==3 && q2.getS4()==4){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
      
    System.out.print("Checking getPerimeter() method...");
    if(q1.getPerimeter() == 4 && q2.getPerimeter() == 10)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
      
    System.out.print("Checking toString() method...");
    if(q1.toString().equals("Quadrilateral Sides 1.0,1.0,1.0,1.0; Perimeter = 4.0") && q2.toString().equals("Quadrilateral Sides 1.0,2.0,3.0,4.0; Perimeter = 10.0"))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
      System.out.println("Expected output: Quadrilateral Sides 1.0,1.0,1.0,1.0; Perimeter = 4.0");
      System.out.println("Your output:" + q1);
      System.out.println("Expected output: Quadrilateral Sides 1.0,2.0,3.0,4.0; Perimeter = 10.0");
      System.out.println("Your output:" + q2);
    }
    System.out.println();
      
    System.out.print("Checking the number of Quadrilateral Objects...");
    if(Quadrilateral.getNumOfQuads() == 2)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.println();
    
    System.out.print("Constructing a Rectangle called r1 using no-arges constructor...");
    Rectangle r1 = new Rectangle();
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Constructing a Rectangle called r2 using parameterized constructor...");
    Rectangle r2 = new Rectangle(3,4);
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Constructing Hierarchy...");
    Quadrilateral r = new Rectangle(1,2);
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking getWidth() and getLength() method...");
    if(r1.getWidth() == 1 && r1.getLength() == 1 && r2.getWidth() == 3 && r2.getLength() == 4)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking getPerimeter() method...");
    if(r1.getPerimeter() == 4 && r2.getPerimeter() == 14)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking getArea() method...");
    if(r1.getArea() == 1 && r2.getArea() == 12)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking toString() method...");
    if(r1.toString().equals("1.0x1.0 Rectangle; Perimeter = 4.0; Area = 1.0") && r2.toString().equals("3.0x4.0 Rectangle; Perimeter = 14.0; Area = 12.0"))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
      System.out.println("Expected output: 1.0x1.0 Rectangle; Perimeter = 4.0; Area = 1.0");
      System.out.println("Your output:" + r1);
      System.out.println("Expected output: 3.0x4.0 Rectangle; Perimeter = 14.0; Area = 12.0");
      System.out.println("Your output:" + r2);
    }
    System.out.println();
    
    System.out.print("Checking equals() method...");
    if(r2.equals(new Rectangle(3,4)) && r2.equals(new Rectangle(4,3)) && !r2.equals(new Rectangle(5,6)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking the number of Rectangle Objects...");
    if(Rectangle.getNumOfRects() == 6)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.println();
    
    System.out.print("Constructing a Square called s1 using no-arges constructor...");
    Square s1 = new Square();
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Constructing a Square called s2 using parameterized constructor...");
    Square s2 = new Square(3);
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Constructing Hierarchy...");
    Quadrilateral s = new Square(4);
    Rectangle ss = new Square(5);
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking getSide method...");
    if(s1.getSide() == 1 && s2.getSide() == 3)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking getPerimeter() method...");
    if(s1.getPerimeter() == 4 && s2.getPerimeter() == 12)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking getArea() method...");
    if(s1.getArea() == 1 && s2.getArea() == 9)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking toString() method...");
    if(s1.toString().equals("Square with side length 1.0; Perimeter = 4.0; Area = 1.0") && s2.toString().equals("Square with side length 3.0; Perimeter = 12.0; Area = 9.0"))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
      System.out.println("Expected output: Square with side length 1.0; Perimeter = 4.0; Area = 1.0");
      System.out.println("Your output:" + s1);
      System.out.println("Square with side length 3.0; Perimeter = 12.0; Area = 9.0");
      System.out.println("Your output:" + s2);
    }
    System.out.println();
    
    System.out.print("Checking equals() method...");
    if(s2.equals(new Square(3)) && !s2.equals(new Square(5)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.print("Checking the number of Square Objects...");
    if(Square.getNumOfSquares() == 6)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    System.out.println();
    
    System.out.println("END of TEST!");
  }
}