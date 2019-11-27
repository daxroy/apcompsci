public class Complex
{
  private static int numOfComplex = 0;
  private double real;
  private double img;
  private String message;
  
  public Complex() {
    real = 0;
    img = 0;
    numOfComplex++;
  }
  
  public Complex(double r, double i){
    double real = r;
    double img = i;
    numOfComplex++;
  }
  
  public static int getNumOfComplex(){
    return numOfComplex;
  }
  
  public double getReal(){ 
    return real;
  }
  
  public double getImg(){
    return img;
  }
  
  public void setReal(double r){
    real = r;
  }
  
  public void setImg(double i){
    img = i;
  }
  
  public void subtract(Complex c){
    real -= c.getReal();
    img -= c.getImg();
  }
  
  public void add(Complex c){
    real += c.getReal();
    img += c.getImg();
  }
  
  public void multiply(Complex c){
    num1 = real * c.getReal();
    num2 = img * c.getReal();
    num3 = real * c.getImg();
    num4 = img * c.getImg();
    num4*=-1
    num1
  }
  
  public boolean equals(Complex c){
    if(real == getReal(c) && img == getImg(c)) 
      return true;
    else
      return false;
  }
  
  public String toString() {
    message = (String) ("Your complex number is: "+ real + "+" + img + "i");
    return message; 
  }
}