public class Square extends Rectangle {
  private static int numOfSquares;
  
  public Square() {
    super();
    numOfSquares++;
  }
  
  public Square(double l) {
    super(l,l);
    numOfSquares++;
  }
  
  public static int getNumOfSquares() {
    return numOfSquares;
  }
  
  public double getSide(){
    return getS1();
  }
  
  public void setSide(double l) {
    setS1(l);
    setS2(l);
    setS3(l);
    setS4(l);
  }
  
  public boolean equals(Square other) {
    if (getSide() == other.getSide()) 
      return true;
    else
      return false;
  }
  
  public String toString() {
    return "Square with side length "+getSide()+"; Perimeter = "+getPerimeter()+"; Area = "+getArea();
  }
}
