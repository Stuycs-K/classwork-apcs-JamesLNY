public class MyArrays {
  public static String arrayToString(int[] nums) {
    String result = "[";
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length - 1) result += ", ";
    }
    return result + "]";
  }
  public static int[] returnCopy(int[] ary) {

  }
  public static int[] concatArray(int[] ary, int[] ary2) {

  }
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3};
    int[] copy = returnCopy(arr);
    System.out.println("returnCopy() Test Case");
    System.out.println("Items match? Expected " + arrayToString(arr) + " Returned " + arrayToString(copy));
    System.out.println("Arrays are the same? Expected not " + arr + " Returned " + copy);
    int[] arr2 = new int[] {4, 5, 6}
    int[] concat = concatArray(arr, arr2);
    System.out.println("concatArray() Test Case");
    System.out.println("Expected a concationation of " + arrayToString(arr) +_"and" + arrayToString(arr2) + " Returned " arrayToString(concat));
  }
}
