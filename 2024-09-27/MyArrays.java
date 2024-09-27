public class MyArrays {
  public static String arrayToString(int[] nums) {
    String result = "[";
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length - 1) result += ", ";
    }
    return result + "]";
  }
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[]{1, 2, 3}));
  }
}
