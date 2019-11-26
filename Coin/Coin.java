public class Coin {
  private boolean faceValueHead;
  private static int numOfCoins = 0;
  private String result;
  private boolean output;
  
   public boolean toss() {
     int num = (int)(Math.random()*1 - 1);
    if (num > 0)
      faceValueHead = true;
    else
      faceValueHead = false;
    return faceValueHead;
  }
   
  public Coin() {
   toss();
   numOfCoins++;
  }
  
  public Coin(boolean t){
    if (t = true)
      faceValueHead = true;
    else
      faceValueHead = false;
    numOfCoins++;
  }
  
  public boolean isHead() {
    return faceValueHead;
  }
  
 
  
  public String toString() {
    if (faceValueHead == true) 
      result = "Heads";
    else
      result = "Tails";
    return result;
  }
  
  public boolean equals(Coin other) {
    if (faceValueHead == other.faceValueHead)
      output = true;
    else
      output = false;
    return output;
  }
  
  public static int getNumOfCoins() {
    return numOfCoins;
  }
  
}