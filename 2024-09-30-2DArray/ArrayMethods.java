//1. Write both your names + emails at the top of the document as a comment.
// James Lei (jamesl291@nycstudents.net), Andy Li (andyl239@nyctudents.net)
public class ArrayMethods {
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += ary[i];
      if (i < ary.length - 1) result += ", ";
    }
    return result + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += arrToString(ary[i]);
      if (i < ary.length - 1) result += ", ";
    }
    return result + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for (int[] arr : nums) {
      for (int n : arr) {
        sum += n;
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] newArr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int n = 0; n < nums[0].length; n++) {
        newArr[n][i] = nums[i][n];
      }
    }
    return newArr;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int n = 0; n < vals[i].length; n++){
        if (vals[i][n] < 0){
          if (i == n){
            vals[i][n] = 1;
          }
          else{
            vals[i][n] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copy(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[i];
    }
    return result;
  }

  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      result[i] = copy(nums[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Testing arrToString(int[][])");
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
    System.out.println("Expected true Returned " + arrToString(arr1).equals("[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10]]"));

    System.out.println("Testing arr2DSum()");
    System.out.println("Expected 55 Returned " + arr2DSum(arr1));
    arr1 = new int[][] {{}, {}};
    System.out.println("Expected 0 Returned " + arr2DSum(arr1));

    System.out.println("Testing swapRC()");
    int[][] rectangularArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expectedArr = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    System.out.println("Expected " + arrToString(expectedArr) + " Returned " + arrToString(swapRC(rectangularArr)));
    rectangularArr = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    expectedArr = new int[][] {{1, 5, 9}, {2, 6, 10}, {3, 7, 11}, {4, 8, 12}};
    System.out.println("Expected " + arrToString(expectedArr) + " Returned " + arrToString(swapRC(rectangularArr)));
    
    System.out.println("Testing arrToString()");
    int[][] arr2 = {{-1, 0, 1}, {-2, -5, -8, 10}, {-4}};
    System.out.println("Original array is " + arrToString(arr2));
    replaceNegative(arr2);
    System.out.println("Modified array is " + arrToString(arr2));

    System.out.println("Testing copy(int[])");
    System.out.println("Expected " + arrToString(arr2[0]) + " Returned " + arrToString(copy(arr2[0])));
    System.out.println("Expected not " + arr2[0] + " Returned " + copy(arr2[0]));

    System.out.println("Testing copy(int[][])");
    System.out.println("Expected " + arrToString(arr2) + " Returned " + arrToString(copy(arr2)));
    System.out.println("Expected not " + arr2 + " Returned " + copy(arr2));
  }
}
