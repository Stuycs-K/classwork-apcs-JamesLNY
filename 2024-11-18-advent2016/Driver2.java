import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver2 {
  public static void main(String[] args) {
    int number = 5;
    String stringInput, result = "";
    try {
      File file = new File("Input2.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        stringInput = input.next();
        for (int i = 0; i < stringInput.length(); i++) {
          char c = stringInput.charAt(i);
          switch (c) {
            case 'U':
              number -= 3;
              break;
            case 'L':
              number--;
              break;
            case 'R':
              number++;
              break;
            case 'D':
              number += 3;
              break;
          }
        }
        result += number;
      }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    System.out.println(result);
  }
}
