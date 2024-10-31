import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static boolean isTriangle(int a, int b, int c) {
    if (a + b < c) return false;
    if (a + c < b) return false;
    if (b + c < a) return false;
    return true;
  }

  public static int countTrianglesA(String filename) {
    File file = new File(filename);
    Scanner input = new Scanner(file);
    while(input.hasNextLine()){
      System.out.println(input.nextLine());
    }
    input.close();
  }
}
