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
    int[] sides = new int[3]();
    int count = 0;
    while(input.hasNextLine()){
      for (int i = 0; i < 3; i++) {
        sides[i] = Integer.parseInt(input.next())
      }
      if (isTriangle(sides[0], sides[1], sides[2])) {
        count++;
      }
    }
    input.close();
    return count;
  }
}
