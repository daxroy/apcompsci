public class Die
{
  private int numOfFaces;
  private int faceValue;

  public Die() {
  numOfFaces = 6;
  roll();
  }
  public Die(int f) {
    numOfFaces = f;
    roll();
  }
  public int getFaceValue()
  {
    return numOfFaces;
  }
  public void roll();
  {
    faceValue = (int)(Math.random()*numOfFaces+1);
  }
  public String toString()
  {
    return "Number of faces = "+numOfFaces+"\n Face Value = "+getFaceValue();;
  }
  boolean equals(Die d) {
    numOfFaces == d.numOfFaces && faceValue = d.faceValue;
  }
}