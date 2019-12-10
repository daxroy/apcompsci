
public class ArrayManager {
  private static String holder;
  private static int pointer = 4;
  public static void main(String[] args) {
    String[] strs = {"Dax", "Taz", "Micheal", "Itamar",null,null,null,null};
    System.out.println(arrayText(strs));
    insertAtIndex(strs, 2,"Kate");
    System.out.println(arrayText(strs));
  }
  
  public static void insertAtIndex(String[] strs, int index, String t) {}
    
  
  public static void removeAtIndex(String[] strs, int index) {
    for (int i = index; i<strs.length - 1;i++) {
      strs[i] = strs[i+1];
    }
    strs[strs.length-1] = null;
    pointer--;
  }
  
  public static String arrayText(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      holder += arr[i]+", ";
    }
    return holder;
  }
  
  
}
