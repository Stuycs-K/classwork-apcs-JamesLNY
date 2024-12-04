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
    Text.go(0, 0);
    for (int i = 0; i < 80; i++) {
      for (int n = 0; n < 30; n++) {
        if (n == 0 || n == 29 || i == 0 || i == 79) colorSquare(i, n, getRandomColor());
      }
    }
    Text.go(30, 0);
    System.out.print(Text.RESET);
  }
}