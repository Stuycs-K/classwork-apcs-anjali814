import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[]args){

    // test cases for count zeroes; passed
    int[][] array = {
      {1, 0, 3},
      {4, 5, 0}
    };
    System.out.println("Zeroes in array: " + (countZeros2D(array)));; // expected : 2

    int[][] array2 = {};
    System.out.println("Zeroes in array: " + (countZeros2D(array2)));; // expected : 0

    int[][] array3 = {
      {1, 0, -3},
      {0, 5, 0, 0}
    };
    System.out.println("Zeroes in array: " + (countZeros2D(array3)));; // expected : 4

    int[][] array4 = {
      {1, -3},
      {5}
    };
    System.out.println("Zeroes in array: " + (countZeros2D(array4)));; // expected : 0

    int[][] array5 = {
      {0},
      {0, 0, 0}
    };
    System.out.println("Zeroes in array: " + (countZeros2D(array5)));; // expected : 4

    // test cases for html; passed
    int[][] ary = {
      {1, 2},
      {3}
    };
    System.out.println(htmlTable(ary)); // expected output: "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"

    int[][] ary2 = {};
    System.out.println(htmlTable(ary2)); // expected output: "<table><table>"

    int[][] ary3 = {
      {1, 2},
      {3},
      {-1, 24},
    };
    System.out.println(htmlTable(ary3)); // expected output: "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr><tr><td>-1</td><td>24</td></tr></table>"
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
        if (nums [i][j] == 0)
        count++;
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

  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++) {
      result += "<tr>";
      for (int j = 0; j < nums[i].length; j++) {
        result += "<td>" + nums[i][j] + "</td>";
      }
      result += "</tr>";
    }
    result += "</table>";
    return result;
  }

}
