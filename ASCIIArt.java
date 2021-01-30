import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class ASCIIArt {
   public static void main(String args[]) {
      // Loading the OpenCV core library
      System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

      // Instantiating the Imagecodecs class
      Imgcodecs imageCodecs = new Imgcodecs();
      String string = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
      // Reading the Image from the file
      String file = "E:\\Java\\Image Processing\\ascii-pineapple.jpg";
      Mat matrix = Imgcodecs.imread(file);
      for (int i = 0; i < matrix.height(); i++) {
         int height = matrix.width();
         for (int j = 0; j < height; j++) {
            // System.out.print("(");
            int avg = 0;
            for (int j2 = 0; j2 < 3; j2++) {
               // System.out.print(matrix.get(i, j)[j2] );  
               avg+=matrix.get(i, j)[j2];
               // if (j2!=height) {
               //    System.out.print(",");
               // }
            }
            avg/=3;
            int index = (int)((float) (avg / 255.0 * 64));
            System.out.print(string.charAt(index)+" ");
            // System.out.print(")");
            // if (j!=height-1) {
               // System.out.print(",");
            // }
         }
         System.out.println();
      }
      // System.out.println(matrix.height());
      // System.out.println(matrix.width());
   }
}
