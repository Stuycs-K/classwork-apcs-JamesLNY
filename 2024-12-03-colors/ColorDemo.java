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
  public static void colorBackground(int color, boolean bright){
    int modifier = 40;
    if (bright) modifier += 60;
    System.out.print("\u001b[" + (modifier + color) + "m");
  }
  public static int getColor(String color) {
    String[] colors = {"Black", "Red", "Green", "Yellow", "Blue", "Magenta", "Cyan", "White"};
    for (int i = 0; i < colors.length; i++) {
      if (colors[i].equals(color)) return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      colorBackground(i, false);
      System.out.print(" ");
    }
    System.out.print(RESET);
  }
}
