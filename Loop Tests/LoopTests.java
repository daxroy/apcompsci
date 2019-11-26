public class LoopTests
{
  public static void main(String[] args)
  {
    int x = 10;
    int n = 0;
    while (n<3) {
      System.out.print((x+1)+" ");
      System.out.print((x+2)+" ");
      System.out.print((x+3)+" ");
      System.out.println((x+4));
      n++;
      x += 10;
    }
    
    for(int r = 1; r <= 3; r++)
    {
      for(int c = 1; c<=4; c++)
      { 
        System.out.print("" + r + c +" ");
      }
      System.out.print("\n");
   }
    
    for(int z = 0; z < 4; z++)
    {
      if (z%2 == 0) {
        System.out.println("O#O#O#O#");
      }
      else {
        System.out.println("#O#O#O#O");
      }
    }
  }
}