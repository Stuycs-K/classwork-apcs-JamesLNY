public class Wizard extends Adventurer {
  private int mana;
  public Wizard(String name) {
    super(name, 10);
    mana = 10;
  }
  public Wizard(String name, int hp, int mana) {
    super(name, hp);
    this.mana = mana;
  }
  public String getSpecialName() {
    return "mana";
  }
  public int getSpecial() {
    return mana;
  }
  public void setSpecial(int n) {
    mana = n;
  }
}
