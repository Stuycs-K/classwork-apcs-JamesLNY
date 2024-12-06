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
  public String attack(Adventurer other) {
    int attackDamage = (int) (Math.random() * 3) + 2;
    other.applyDamage(attackDamage);
    return getName() + " threw a fireball at " + other.getName() + ", dealing " + attackDamage + " damage!";
  }
  public String support(Adventurer other) {
    int healAmount = (int) (Math.random() * 3) + 2;
    healAmount = Math.min(other.getmaxHP(), other.getHP() + healAmount);
    other.setHP(healAmount);
    return getName() " casted a healing spell on " + other.getName() + ", restoring " + healAmount + " hit points!";
  }
}
