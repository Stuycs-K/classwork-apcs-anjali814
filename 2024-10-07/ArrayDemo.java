
import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] array = {
      {1, 0, 3},
      {4, 5, 0}
    };
    System.out.println("Zeroes in array: " + Arrays.toString(countZeros2D(array)));; // expected : 2
  }

  public static String arrToString(int ary[]){
    String combined = "[";
    for (int i = 0; i < ary.length; i++){
      if (i == ary.length - 1){
        combined += ary[i];
      }else{
        combined += ary[i] + ", ";
      }
    }
    combined += "]";
    return combined;
  }

  public static String arrToString(int[][]ary){
    if (ary.length == 0) return "[]";
    String combined = "[";
    for (int i = 0; i < ary.length; i++){
      combined += arrToString(ary[i]);
      if (i < ary.length - 1) {
        combined += ", ";
      }
    }
    combined += "]";
    return combined;
  }

  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums [i][j] = 0)
        return count++;
      }
    }
    return count;
  }

  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum = sum + nums [i][j];
      }
    }
    return sum;
  }

  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {    // row
      for (int c = 0; c < vals[i].length; c++) {    //column
        if (vals[i][c] < 0) {
          if (i == c) {
            vals[i][c] = 1;
          }
          else {
            vals[i][c] = 0;
          }
        }
      }
    }
  }

  public static int[][] copy(int[][] nums){
    int[][] copied = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      copied[i] = new int[nums[i].length];
      for (int j = 0; j < nums[i].length; j++) {
        copied[i][j] = nums[i][j];
      }
    }
    return copied;
  }

  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        result[j][i] = nums[i][j];
      }
    }
    return result;
  }

//6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  /*
  public static String htmlTable(int[][]nums){
    for (int 1 = 0; i < nums.length; i++)
    return "";
    */
  }

}
