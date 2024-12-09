import java.util.Scanner;
class Game {
  public static String getInput(Scanner s) {
    String validInputs[] = {"a", "attack", "sp", "special", "su", "support", "quit"};
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String userInput;
    while (true) {
      userInput = s.nextLine();
      for (String str : validInputs) {
        if (str.equals(userInput)) return str;
      }
      System.out.println("Please enter a valid input.");
    }
  }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    String action;
    System.out.print("Enter username: ");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);
    Adventurer player = new Wizard(userName);
    Adventurer enemy = new CodeWarrior();
    while (enemy.getHP() > 0 && player.getHP() > 0) {
      System.out.print(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP");
      System.out.println(", " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.print(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP");
      System.out.println(", " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      action = getInput(userInput);
      if (action.equals("sp") || action.equals("special")) {
        System.out.println(player.specialAttack(enemy));
      } else if (action.equals("a") || action.equals("attack")) {
        System.out.println(player.attack(enemy));
      } else if (action.equals("su") || action.equals("support")) {
        System.out.println(player.support());
      } else {
        return;
      }
      switch ((int) (Math.random() * 3)) {
        case 0:
          System.out.println(enemy.attack(player));
          break;
        case 1:
          System.out.println(enemy.specialAttack(player));
          break;
        case 2:
          System.out.println(enemy.support());
          break;
      }
    }
    if (enemy.getHP() <= 0) {
      if (player.getHP() <= 0) {
        System.out.println("Both players died! Noone won!");
      } else {
        System.out.println(player.getName() + " won the fight!");
      }
    } else {
      System.out.println(enemy.getName() + " won the fight!");
    }
  }
}
