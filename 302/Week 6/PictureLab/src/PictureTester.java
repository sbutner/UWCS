/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  /**
   * Method to test pixellate with three args
   */
  public static void testPixellateThreeArgs(){
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.pixellate(18, 60, 40);
	  caterpillar.explore();
  }
  
  /**
   * Method to test pixellate with one arg
   */
  public static void testPixellateOneArg(){
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.pixellate(40);
	  caterpillar.explore();
  }
  
  /**
   * Method to test posterize
   */
  public static void testPosterize(){
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.posterize(8);
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  

  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection();
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  
  /** Method to test Negating  */
  public static void testNegate()
  {
	  Picture thrudoor = new Picture("thruDoor.jpg");
	  thrudoor.toNegative();
	  thrudoor.explore();
  }
 
  
  /** Method to test Grayscale */
  public static void testGrayscale()
  {
	  Picture wall = new Picture("wall.jpg");
	  wall.toGrayscale();
	  wall.explore();
  }
  /**
   * Method to test rounding down to nearest multiple of 8
   */
  public static void testRoundDown(){
	  Picture wall = new Picture("wall.jpg");
	  wall.explore();
	  wall.roundDownToMultOf8();
	  wall.explore();
  }
  /**
   * Method to test hiding a picture
   */
  public static void testHidePicture(){
	  Picture wall = new Picture("wall.jpg");
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  wall.explore();
	  wall.hidePicture(caterpillar);
	  wall.explore();
	  
  }
  
  /**
   * Method to test decoding a picture
   */
  
  public static void testDecodePicture(){
	  Picture wall = new Picture("wall.jpg");
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  wall.hidePicture(caterpillar);
	  wall.explore();
	  wall.decodePicture();
	  wall.explore();
  }
  
  /** Method to test zero Red */
  public static void testZeroRed()
  {
	  Picture wall = new Picture("wall.jpg");
	  wall.zeroRed();
	  wall.explore();
  }
  public static void main(String[] args)
  {
	testDecodePicture();
	  //testHidePicture();
	  //testRoundDown();
	 //testPosterize(); 
	 //testPixellateThreeArgs();
	//testPixellateOneArg();
	// METHODS THAT ARE ALREADY WRITTEN FOR YOU
    //testZeroBlue();
    //testMirrorVertical();
    //testMirrorTemple();
    //testEdgeDetection();
	  
	// METHODS THAT YOU NEED TO WRITE
    
	  //testZeroRed();
	  //testNegate();
    //testGrayscale();
	  //testMirrorTemple();
  }
}