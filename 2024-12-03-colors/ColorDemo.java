public class ColorDemo {
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static final String RESET = "\u001b[0m";
  public static void colorForeground(int color, boolean bright) {
    int modifier = 30;
    if (bright) modifier += 60;
    System.out.print("\u001b[" + (modifier + color) + "m");
  }
  public static void colorBackground(int color, boolean bright) {
    int modifier = 40;
    if (bright) modifier += 60;
    System.out.print("\u001b[" + (modifier + color) + "m");
  }
  public static void colorBackgroundRGB(int r, int g, int b) {
    System.out.print("\u001b[48;2;" + r + ";" + g + ";" + b + "m");
  }
  public static int getColor(String color) {
    String[] colors = {"Black", "Red", "Green", "Yellow", "Blue", "Magenta", "Cyan", "White"};
    for (int i = 0; i < colors.length; i++) {
      if (colors[i].equals(color)) return i;
    }
    return -1;
  }
  public static void moveCursor(int r, int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }
  public static void sleep(int milli){
    try {
      Thread.sleep(milli);
    } catch(Exception e) {}
  }
  public static void main(String[] args) {
    System.out.print(CLEAR_SCREEN);
    System.out.print(HIDE_CURSOR);
    for (int b = 0; b < 256; b += 16) {
      moveCursor(4, 0);
      sleep(5);
      for (int r = 0; r < 256; r += 16) {
        sleep(5);
        for (int g = 0; g < 256; g += 16) {
          sleep(5);
          colorBackgroundRGB(r, g, b);
          System.out.print("  ");
        }
        System.out.print(RESET);
        System.out.println();
      }
      System.out.print(RESET);
    }
    System.out.print(RESET);
    moveCursor(0, 0);
    System.out.print(SHOW_CURSOR);
  }
}
