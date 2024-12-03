public class ColorDemo {
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static void colorForeground(int color, boolean bright) {
    int modifier = 30;
    if (bright) modifier += 10;
    System.out.print( "\u001b[" + (modifier + color) + "m");
  }
  public static void colorBackground(int color, boolean bright){
    int modifier = 90;
    if (bright) modifier += 10;
    System.out.print( "\u001b[" + (modifier + color) + "m");
  }
  public static int getColor(String color) {
    String[] colors = {"Black", "Red", "Green", "Yellow", "Blue", "Magenta", "Cyan", "White"};
    for (int i = 0; i < colors.size(); i++) {
      if (colors[i].equals(color)) return i;
    }
  }
  public static void main(String[] args) {

  }
}
