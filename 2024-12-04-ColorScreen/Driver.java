public class Driver {
  public static int getRandomColor() {
    return (int) (Math.random() * 7) + 31;
  }
  public static void colorSquare(int x, int y, int color) {
    Text.go(y, x);
    Text.color(Text.background(color));
    System.out.print(' ');
  }
  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    // PART 1
    for (int i = 0; i < 80; i++) {
      for (int n = 0; n < 30; n++) {
        if (n == 0 || n == 29 || i == 0 || i == 79) colorSquare(i, n, getRandomColor());
      }
    }
    // PART 2
    System.out.print(Text.RESET);
    int[] randomNumbers = new int[3];
    for (int i = 0; i < 3; i++) {
      randomNumbers[i] = (int) (Math.random() * 100);
      Text.go(2, 20 + i * 20);
      if (randomNumbers[i] < 25) {
        Text.color(Text.RED + 60);
      } else if (randomNumbers[i] > 75) {
        Text.color(Text.GREEN + 60);
      } else {
        Text.color(Text.WHITE);
      }
      System.out.print(randomNumbers[i]);
    }
    // Part 3
    for (int i = 2; i < 79; i++) {
      Text.go(3, i);
      Text.color(Text.background(Text.BLUE+60));
      System.out.print('-');
    }
    Text.go(30, 0);
    System.out.print(Text.RESET);
  }
}