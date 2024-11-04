import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static boolean isTriangle(int a, int b, int c) {
    if (a + b <= c) return false;
    if (a + c <= b) return false;
    if (b + c <= a) return false;
    return true;
  }

  public static int countTrianglesA(String filename) {
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNext()){
        if (isTriangle(input.nextInt(), input.nextInt(), input.nextInt())) {
          count++;
        }
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
