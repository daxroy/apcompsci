public class Dictionary extends Book{
  private int definitions;
  
  public Dictionary() {
    super ();
    definitions =52500;
  }
  
  public double getDefPerPage(double x) {
    return (double)definitions/pages;
  }
  
  public String toString() {
    return "This dictionary has "+ pages +" pages.";
  }
}