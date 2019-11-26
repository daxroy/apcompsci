public class Rectangle extends Quadrilateral {
  private static int numOfRects;
  private double area;
  
  public Rectangle() {
    setS1(1);
    setS2(1);
    setS3(0);
    setS4(0);
  }
  
  public Rectangle(double w, double l) {
    setS1(w);
    setS2(l);
    setS3(0);
    setS4(0);
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
    return "The rectangle of side lengths: "+getWidth()+"x"+getLength()+"\n has a perimeter of: "+getPerimeter()+" and an area of: "+getArea();
  }
}