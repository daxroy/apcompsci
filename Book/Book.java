public class Book {
  private int pages;
  
  public Book() {
    pages = 500;
  }
  
  public int getPages() {
    return pages;
  }
  
  public void setPages(int p) {
    pages = p;
  }
  
  public String toString() {
    return "This book has "+ pages +" pages.";
  }
}