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
  }
}