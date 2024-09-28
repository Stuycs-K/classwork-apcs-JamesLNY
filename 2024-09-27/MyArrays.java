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
    int[] result = new int[ary.length];
    for (int i = 0; i < ary.length; i++) result[i] = ary[i];
    return result;
  }
  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] result = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) result[i] = ary1[i];
    for (int i = 0; i < ary2.length; i++) result[i + ary1.length] = ary2[i];
    return result;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3};
    int[] copy = returnCopy(arr);
    System.out.println("returnCopy() Test Cases");
    System.out.println("Items match? Expected " + arrayToString(arr) + " Returned " + arrayToString(copy));
    System.out.println("Arrays are the same? Expected not " + arr + " Returned " + copy);
    arr = new int[] {};
    copy = returnCopy(arr);
    System.out.println("Items match? Expected " + arrayToString(arr) + " Returned " + arrayToString(copy));
    System.out.println("Arrays are the same? Expected not " + arr + " Returned " + copy);
    arr = new int[] {4, 3, 1, 4, 5};
    copy = returnCopy(arr);
    System.out.println("Items match? Expected " + arrayToString(arr) + " Returned " + arrayToString(copy));
    System.out.println("Arrays are the same? Expected not " + arr + " Returned " + copy);
    int[] arr2 = new int[] {4, 5, 6};
    int[] concat = concatArray(arr, arr2);
    System.out.println("concatArray() Test Cases");
    System.out.println("Expected a concationation of " + arrayToString(arr) + " and " + arrayToString(arr2) + " Returned " + arrayToString(concat));
    arr2 = new int[] {};
    concat = concatArray(arr, arr2);
    System.out.println("Expected a concationation of " + arrayToString(arr) + " and " + arrayToString(arr2) + " Returned " + arrayToString(concat));
  }
}
