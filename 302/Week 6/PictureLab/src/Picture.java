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
    for (int r=0; r < pixels.length; r++)
    {
    		for (int c=0; c < pixels[0].length; c++)
    		{
    			pixels[r][c].setBlue(0);
    		}
    }
  }
  
  /** Method to set the blue to 0 */
  public void zeroRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (int r=0; r < pixels.length; r++)
    {
    		for (int c=0; c < pixels[0].length; c++)
    		{
    			pixels[r][c].setRed(0);
    		}
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
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
  
  /** Method that mirrors the picture around a 
   * horizontal mirror in the center of the picture
   * from top to bottom */
 public void mirrorHorizontal()
 {
   Pixel[][] pixels = this.getPixels2D();
   Pixel upperPixel = null;
   Pixel lowerPixel = null;
   int height = pixels.length;
   for (int col = 0; col < pixels[0].length; col++)
   {
     for (int row = 0; row < height / 2; row++)
     {
       upperPixel = pixels[row][col];
       lowerPixel = pixels[height - 1 - row][col];
       lowerPixel.setColor(upperPixel.getColor());
     }
   } 
 }
 
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    // TO DO:  CREATE FOR LOOPS TO COPY JUST THE RIGHT PIXELS
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  
  }

  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        int distance = (int)leftPixel.colorDistance(rightColor);
        leftPixel.setRed(distance);
        leftPixel.setGreen(distance);
        leftPixel.setBlue(distance);
      }// for col
    }// for row
  }// method
  public void toGrayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (int r=0; r < pixels.length; r++)
	    {
	    		for (int c=0; c < pixels[0].length; c++)
	    		{
	    			int newVal = (pixels[r][c].getRed() + pixels[r][c].getGreen() + pixels[r][c].getBlue()) / 3;
	    			pixels[r][c].setRed(newVal);
	    			pixels[r][c].setGreen(newVal);
	    			pixels[r][c].setBlue(newVal);
	    		}
	    }
  }
  public void toNegative()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (int r=0; r < pixels.length; r++)
	    {
	    		for (int c=0; c < pixels[0].length; c++)
	    		{
	    			int newRed = 255 - pixels[r][c].getRed();
	    			int newGreen = 255 - pixels[r][c].getGreen();
	    			int newBlue = 255 - pixels[r][c].getBlue();
	    			pixels[r][c].setRed(newRed);
	    			pixels[r][c].setGreen(newGreen);
	    			pixels[r][c].setBlue(newBlue);
	    		}
	    }
  }
} // this } is the end of class Picture, put all new methods before this
