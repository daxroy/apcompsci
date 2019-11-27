public class ComplexTester
{
  public static void main(String[] args)
  {
    System.out.print("Constructing a Complex number called c1 using no-arges constructor...");
    Complex c1 = new Complex();
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Constructing a Complex number called c2 using parameterized constructor...");
    Complex c2 = new Complex(1,2);
    System.out.println("PASSED");
    System.out.println();
    
      
    System.out.print("Checking c1 instant variables...");
    if(c1.getReal()==0 && c1.getImg()==0){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    System.out.print("Checking c2 instant variables...");
    if(c2.getReal()==1 && c2.getImg()==2){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    
    System.out.print("Checking static variable and method...");
    if(Complex.getNumOfComplex()==2)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    
    System.out.print("Checking setReal and getReal method...");
    c1.setReal(3);
    if(c1.getReal()==3 && c1.getImg()==0){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    System.out.print("Checking setImg and getImg method");
    c2.setImg(5);
    if(c2.getReal()==1 && c2.getImg()==5){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    Complex c3 = new Complex(1,5);
    System.out.print("Checking equals method...");
    if(!c3.equals(c1) && c3.equals(c2))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    System.out.print("Checking add method...");
    c1.add(new Complex(1,2));
    if(c1.getReal()==4 && c1.getImg()==2)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    System.out.print("Checking subtract method...");
    c2.subtract(new Complex(0,3));
    if(c2.getReal()==1 && c2.getImg()==2)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    System.out.print("Checking multiply method...");
    c1.multiply(new Complex(3,2));
    if(c1.getReal()==8 && c1.getImg()==14)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!");
    }
    System.out.println();
    
    
    System.out.println("Checking toString method:");
    Complex c4 = new Complex();
    System.out.println(c4 + "\t Expected: 0.0" + (c4.toString().equals("0.0")?"PASSED":"FAILED"));
    Complex c5 = new Complex(0,3);
                       System.out.println(c5 + "\t Expected: 3.0i\t" + (c5.toString().equals("3.0i")?"PASSED":"FAILED"));
    Complex c6 = new Complex(0,-3);
                       System.out.println(c6 + "\t Expected: -3.0i\t" + (c6.toString().equals("-3.0i")?"PASSED":"FAILED"));
    Complex c7 = new Complex(2,0);
                       System.out.println(c7 + "\t Expected: 2.0\t" + (c7.toString().equals("2.0")?"PASSED":"FAILED"));
    Complex c8 = new Complex(2,-3);
                       System.out.println(c8 + "\t Expected: 2.0 - 3.0i\t" + (c8.toString().equals("2.0 - 3.0i")?"PASSED":"FAILED"));
    Complex c9 = new Complex(1,2);
                       System.out.println(c9 + "\t Expected: 1.0 + 2.0i\t" + (c9.toString().equals("1.0 + 2.0i")?"PASSED":"FAILED"));
    Complex c10 = new Complex(0,1);
                       System.out.println(c10 + "\t Expected: i\t" + (c10.toString().equals("i")?"PASSED":"FAILED"));
    Complex c11 = new Complex(5,-1);
                       System.out.println(c11 + "\t Expected: 5.0 - i\t" + (c11.toString().equals("5.0 - i")?"PASSED":"FAILED"));
        
    System.out.println("END of TEST");
  }
}