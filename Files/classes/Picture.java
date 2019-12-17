import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set the red and blue to 0 */
  public void greenOnly()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
         pixelObj.setBlue(0);
         pixelObj.setRed(0);
      }
    }
  }
  
  /** Method to set the red,green,blue to (255 - its original value)  */
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for ( Pixel[] rowArray : pixels )
    {
      for ( Pixel pixelObj : rowArray )
      {
        pixelObj.setRed( 255 - pixelObj.getRed() );
        pixelObj.setGreen( 255 - pixelObj.getGreen());
        pixelObj.setBlue( 255 - pixelObj.getBlue());
      }
    }
  }
  
  /** Method to set all red,green,blue to the average of the three values  */
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {   
        int avg = (int)((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3);
        pixelObj.setRed(avg);
        pixelObj.setBlue(avg);
        pixelObj.setGreen(avg);
      }
    }
  }
  
  /** Method to make the shape of the fish stand out  */
  public void enhanceFish()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel pixel = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        pixel = pixels[row][col];
        pixel.setRed(pixel.getRed() * 3);
      }
    }
  }
  
  /** Method to highlight the edges of object in a picture by checking large changes in color */
   public void edgeDetection()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        if (leftPixel.colorDistance(rightPixel.getColor()) > 15 ||
            topPixel.colorDistance(bottomPixel.getColor()) > 15)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /** Method to mirror the picture around a vertical line in the center of the picture from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** Method to mirror around a diagonal line from bottom left to top right */
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topRightPixel = null;
    Pixel bottomLeftPixel = null;
    int max = pixels.length;
    if (pixels[0].length < max)
      max = pixels[0].length;
    for (int row = 1; row < max; row++)
    {
      for (int col = 0; col < row; col++)
      {
        topRightPixel = pixels[row][col];
        bottomLeftPixel = pixels[col][row];
        bottomLeftPixel.setColor(topRightPixel.getColor());
      }
    }
  }
    
  /** Method to mirror just part of a picture of a temple to fix the broken part of the temple */
   public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 27; row < 97; row++)
    {
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  /** Method to mirror just part of a picture of a snowman, so that it will have four arms instead of two */
  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 158; row < mirrorPoint; row++)
    {
      for (int col = 103; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    int mirrorPoint2 = 198;
    Pixel topPixel2 = null;
    Pixel bottomPixel2 = null;
    for (int row = 171; row < mirrorPoint2; row++)
    {
      for (int col = 239; col < 294; col++)
      {
        topPixel2 = pixels[row][col];      
        bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
        bottomPixel2.setColor(topPixel2.getColor());
      }
    }
  }
    
  /** Method to copy the gull in the picture to another location of the picture */
  public void copyGull()
  {
    int mirrorPoint = 345;
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    Pixel[][] pixels = this.getPixels2D();   
    for (int row = 235; row < 323; row++)
    {
      for (int col = 238; col < mirrorPoint; col++)
      {
        rightPixel = pixels[row][col];      
        leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  
  /** Method to create a collage of several pictures */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
   
  
  /** Method to replace the blue background with the pixels in the newBack picture
    * @param newBack the picture to copy from
    */
  public void chromakey( Picture newBack )
    {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = newBack.getPixels2D();
    for ( int row = 0; row < this.getHeight(); row++ )
    {
      for ( int col = 0; col < this.getWidth(); col++ )
      {
        toPixel = toPixels[row][col];
        if ( toPixel.getBlue() > toPixel.getRed() )
        {
          fromPixel = fromPixels[row][col];
          toPixel.setColor( fromPixel.getColor() );
        }
      }
    }
  }
  
  /** Method to decode a message hidden in the red value of the current picture */
  public Picture decode()
    {
    Pixel[][] pixels = this.getPixels2D();
    int height = this.getHeight();
    int width = this.getWidth();
    Pixel currPixel = null;
    Pixel messagePixel = null;
    Picture messagePicture = new Picture( height, width );
    Pixel[][] messagePixels = messagePicture.getPixels2D();
    int count = 0;
    for ( int row = 0; row < this.getHeight(); row++ )
    {
      for ( int col = 0; col < this.getWidth(); col++ )
      {
        currPixel = pixels[row][col];
        messagePixel = messagePixels[row][col];
        if ( currPixel.getRed() % 2 == 1 )
        {
          messagePixel.setColor( Color.BLACK );
          count++;
        }
      }
    }
    System.out.println(count);
    return messagePicture;
  }
  
  /** Hide a black and white message in the current picture by changing the green to even and then setting it to odd if the message pixel is black 
    * @param messagePict the picture with a message
    */
  public void encodeGreen(Picture messagePict)
  {
    Pixel[][] messagePixels = messagePict.getPixels2D();
    Pixel[][] currPixels = this.getPixels2D();
    Pixel currPixel = null;
    Pixel messagePixel = null;
    int count = 0;
    for ( int row = 0; row < this.getHeight(); row++ )
    {
      for ( int col = 0; col < this.getWidth(); col++ )
      {
        currPixel = currPixels[row][col];
        if (currPixel.getGreen() % 2 == 1 )
          currPixel.setGreen(currPixel.getGreen() - 1 );
        messagePixel = messagePixels[row][col];
        if (messagePixel.colorDistance( Color.BLACK ) < 50 )
        {
          currPixel.setGreen( currPixel.getGreen() + 1 );
          count++;
        }
      }
    }
    System.out.println( count );
  }
} 

 
