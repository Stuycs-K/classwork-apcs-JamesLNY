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
  public int getSpecialMax() {
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
    return getName() + " casted a healing spell on " + other.getName() + ", restoring " + healAmount + " hit points!";
  }
  public String support() {
    int boost = (int) (Math.random() * 2);
    if (boost == 1) {
      setmaxHP(getmaxHP + 1);
      return getName() + " drank a magic potion, which increased their max HP by 1!";
    } else {
      return getName() + " accidentally drank water, which obviously didn't do anything!";
    }
  }
  public String specialAttack(Adventurer other) {
    if (getSpecial < 10) return getName() + " doesn't have enough mana to cast their special.";
    mana = 0;
    int random = (int) (Math.random() * 3);
    switch (random) {
      case 0:
        other.setHP(1);
        return getName() + " consumed 10 mana to summon a tornado on top of " + other.getName() + ", reducing them to 1 HP!"
      case 1:
        int change = Math.min(1, other.getmaxHP() - 5);
        other.setmaxHP(change);
        other.setHP(Math.min(other.getMaxHP(), other.getHP()));
        return getName() + " consumed 10 mana to throw a lightning bolt at " + other.getName() + ", which reduced their max HP to " + change;
      default:
        other.setmaxHP(2);
        other.setHP(2)''
        return getName() + " consumed 10 mana to turn " + other.getName() + " into a duck, setting both their max HP and HP to 2!"
    }
  }
}
