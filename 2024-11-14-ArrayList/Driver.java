import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    ArrayList<String> newArrList = ArrayListPractice.createRandomArray(10);
    System.out.println(newArrList);
    ArrayListPractice.replaceEmpty(newArrList);
    System.out.println(newArrList);
    newArrList = ArrayListPractice.makeReversedList(newArrList);
    System.out.println(newArrList);
    ArrayList<String> otherArrList = ArrayListPractice.createRandomArray(20);
    System.out.println(otherArrList);
    System.out.println(ArrayListPractice.mixLists(newArrList, otherArrList));

    int count = 10;
    ArrayList<Integer> expectedIndices = new ArrayList<Integer>();
    System.out.print("Testing ArrayListPractice.replaceEmpty(ArrayList): ");
    for (int n = 0; n < 10; n++) {
      expectedIndices = new ArrayList<Integer>();
      newArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 200000));
      for (int i = 0; i < newArrList.size(); i++) {
        if (newArrList.get(i).equals("")) expectedIndices.add(i);
      }
      ArrayListPractice.replaceEmpty(newArrList);
      for (int i : expectedIndices) {
        if (! newArrList.get(i).equals("Empty")) count--;
      }
    }
    System.out.println(count == 10 ? "PASSED" : "FAILED");

    count = 10;
    System.out.print("Testing ArrayListPractice.makeReversedList(ArrayList): ");
    for (int n = 0; n < 10; n++) {
      newArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 200000));
      otherArrList = ArrayListPractice.makeReversedList(newArrList);
      for (int i = 0; i < newArrList.size(); i++) {
        if (newArrList.get(i) != otherArrList.get(newArrList.size() - 1 -i)) count--;
      }
    }
    System.out.println(count == 10 ? "PASSED" : "FAILED");
  }
}
