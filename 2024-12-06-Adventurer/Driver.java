public class Driver {
  public static void main(String[] args) {
    Wizard Jerry = new Wizard("Jerry");
    Wizard Albert = new Wizard("Albert", 20, 80);
    System.out.print("Testing Wizard.getSpecialName(): ");
    System.out.println(Jerry.getSpecialName().equals("mana") ? "PASSED" : "FAILED");
    System.out.print("Testing Wizard.getSpecialMax(): ");
    System.out.println(Jerry.getSpecialMax() == 10 && Albert.getSpecialMax() == 80 ? "PASSED" : "FAILED");
    System.out.print("Testing Wizard.getSpecial(): ");
    System.out.println(Jerry.getSpecial() == 10 && Albert.getSpecial() == 80 ? "PASSED" : "FAILED");
    System.out.print("Testing Wizard.setSpecial(): ");
    Jerry.setSpecial(5);
    System.out.println(Jerry.getSpecial() == 5 ? "PASSED" : "FAILED");
    System.out.println("-------------------------");
    System.out.println("FIGHT SEQUENCE");
    int maxRounds = 20, currentRounds = 0;
    while (Jerry.getHP() > 0 && Albert.getHP() > 0 && currentRounds < maxRounds) {
      System.out.print(Jerry.getName() + " | Health: " + Jerry.getHP() + " | Max Health: " + Jerry.getmaxHP() + " | ");
      System.out.println(Jerry.getSpecialName() + ": " + Jerry.getSpecial() + " | Max " + Jerry.getSpecialName() + ": " + Jerry.getSpecialMax());
      System.out.print(Albert.getName() + " | Health: " + Albert.getHP() + " | Max Health: " + Albert.getmaxHP() + " | ");
      System.out.println(Albert.getSpecialName() + ": " + Albert.getSpecial() + " | Max " + Albert.getSpecialName() + ": " + Albert.getSpecialMax());
      switch ((int) (Math.random() * 8)) {
        case 0:
          System.out.println(Jerry.attack(Albert));
          break;
        case 1:
          System.out.println(Albert.attack(Jerry));
          break;
        case 2:
          System.out.println(Jerry.support(Albert));
          break;
        case 3:
          System.out.println(Albert.support(Jerry));
          break;
        case 4:
          System.out.println(Jerry.support());
          break;
        case 5:
          System.out.println(Albert.support());
          break;
        case 6:
          System.out.println(Jerry.specialAttack(Albert));
          break;
        case 7:
          System.out.println(Albert.specialAttack(Jerry));
          break;
      }
      currentRounds++;
    }
  }
}