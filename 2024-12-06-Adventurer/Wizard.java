public class Wizard extends Adventurer {
  private int mana;
  private int maxMana
  public Wizard(String name) {
    super(name, 10);
    mana = 10;
    this.maxMana = 10;
  }
  public Wizard(String name, int hp, int mana) {
    super(name, hp);
    this.mana = mana;
    this.maxMana = mana;
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
  public int getSpecialMan() {
    return maxMana;
  }
}
