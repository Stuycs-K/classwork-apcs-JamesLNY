import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String>randArr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = (int) (Math.random() * 11);
      if (rand == 0) {
        randArr.add("");
      } else {
        randArr.add("" + rand);
      }
    }
    return randArr;
  }

  public static void replaceEmpty(ArrayList<String> original) {
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original) {
    ArrayList<String> arrList = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      arrList.add(original.get(i));
    }
    return arrList;
  }

  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b) {
    ArrayList<String> arrList = new ArrayList<String>();
    for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
      arrList.add(a.get(i));
      arrList.add(b.get(i));
    }
    if (a.size() < b.size()) {
      for (int i = a.size(); i < b.size(); i++) {
        arrList.add(b.get(i));
      }
    } else if (b.size() < a.size()) {
      for (int i = b.size(); i < a.size(); i++) {
        arrList.add(a.get(i));
      }
    }
    return arrList;
}
}
