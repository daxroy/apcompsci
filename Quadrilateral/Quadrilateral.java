public class Quadrilateral {
  private static int numOfQuads;
  private double s1;
  private double s2;
  private double s3;
  private double s4;
  private double perimiter;
  
  public Quadrilateral() {
    s1 = 1;
    s2 = 1;
    s3 = 1;
    s4 = 4;
  }
  
  public Quadrilateral(double a, double b, double c, double d) {
    s1 = a;
    s2 = b;
    s3 = c;
    s4 = d;
  }
   
  public static int getNumOfQuads() {
    return numOfQuads;
  }
   
  public double getS1() {
    return s1;
  }
  public double getS2() {
    return s2;
  }
  public double getS3() {    
    return s3;
  }
  public double getS4() {
    return s4;
   }
  
  public void setS1(double s) {
    s1 = s;
  }
  public void setS2(double s) {
    s2 = s;
  }
  public void setS3(double s) {
    s3 = s;
  }
  public void setS4(double s) {
    s4 = s;
  }
  
  public double getPerimeter() {
    perimiter = s1+s2+s3+s4;
    return perimeter;
  }
  
  public String toString() {
    return "The quadrilateral of side lengths: "+s1+", "+s2+", "+s3+", "+s4+"\n has a perimeter of "+perimeter;
  }
}