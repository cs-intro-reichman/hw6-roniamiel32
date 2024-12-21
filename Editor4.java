import java.awt.Color;

/**
 * Demonstrates the morphing service of Instush.java.
 * The program recieves two command-line arguments: the name of a PPM file
 * that represents the source image (a string), and the number of morphing steps
 * (an int).
 * For example:
 * java Editor4 cake.ppm 300
 * the program morphs an image into its greyscaled version
 */
public class Editor4 {

  public static void main(String[] args) {
    Color[][] image = Runigram.read(args[0]);
    Color[][] greyImage = Runigram.grayScaled(image);
    int steps = Integer.parseInt(args[1]);
    Runigram.morph(image, greyImage, steps);
  }
}
