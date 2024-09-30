// James Lei (jamesl291@nycstudents.net), Andy Li (andyl239@nyctudents.net)
public class ArrayMethods {
  public static String arrayToString(int[] nums) {
    String result = "[";
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length - 1) result += ", ";
    }
    return result + "]";
  }
}
