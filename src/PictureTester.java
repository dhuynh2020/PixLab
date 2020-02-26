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
  /** Method to test onlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.onlyBlue();
    beach.explore();
  }

  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();

  }

  /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();

  }
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();

  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("seagull.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }  
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
 
  public static void testMirrorDiagonal(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testNewCopy()
  {
    Picture snow = new Picture("snowman.jpg");
    Picture snow2 = new Picture("snowman.jpg");
    snow.explore();
    snow.newCopy(snow2, 81, 164, 161, 242, 230, 57);
    snow.newCopy(snow2, 81, 164, 161, 242, 230, 57);
    snow.explore();  
  }
  
    
    public static void testMyCollage()
    {
      Picture picture = new Picture("640x480.jpg");
      picture.myCollage();
      picture.explore();
    }
    
  public static void testMirrorVerticalRightToLeft()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.mirrorVerticalRightToLeft();
    bike.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.mirrorHorizontal();
    bike.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.mirrorHorizontalBotToTop();
    bike.explore();
  }

 
  
  
  /** Main method for testing.  Every class can have a main
   * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testMyCollage();
    testNewCopy();
    // testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}