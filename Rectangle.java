public class Rectangle extends Quadrilateral {
  private static int numOfRects;
  private double area;
  
  public Rectangle() {
    super();
    numOfRects++;
  }
  
  public Rectangle(double w, double l) {
    super(w, l, w, l);
    numOfRects++;
  }
  
  public static int getNumOfRects() {
    return numOfRects;
  }
  
  public double getWidth() {
    return getS1();
  }
  public double getLength() {
    return getS2();
  }
  
  public void setWidth(double w) {
    setS1(w);
  }
  public void setLength(double l) {
    setS2(l);
  }
  
  public double getArea() {
    area = getWidth()*getLength();
    return area;
  }
  
  public boolean equals(Rectangle other) {
    if ((getWidth()==other.getWidth()&&getLength()==other.getLength())||(getWidth()==other.getLength()&&getWidth()==other.getLength())) 
      return true;
    else
      return false;
  }
  
  public String toString() {
    return +getWidth()+"x"+getLength()+" Rectangle; Perimeter = "+getPerimeter()+"; Area = "+getArea();
  }
}