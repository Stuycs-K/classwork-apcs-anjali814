//anjali bechu
//abechu60@stuy.edu

//jaden bae
//jabae50@stuy.edu

public class ArrayMethods{
  public static String arrayToString(int ary[]){
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
    combined += arrayToString(ary[i]);
    if (i < ary.length - 1) {
      combined += ", ";
    }
  }
  combined += "]";
  return combined;
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

public static int[][] swapRC(int[][]nums){
  int[][] result = new int[nums[0].length][nums.length];
  for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[i].length; j++) {
      result[j][i] = nums[i][j];
    }
  }
  return result;
}



public static void main(String[] args){
// test case for 2d array; passed
  int[][] arr = {
    {2,3,4},
    {5,6,7},
    {8,0,4}
  };
  System.out.println(arrToString(arr)); // expected: [[2, 3, 4], [5, 6, 7], [8, 0, 4]

  int[][] arr2 = {};
  System.out.println(arrToString(arr3)); // expected: [

  int[][] arr3 = {
    {1, 2},
    {3, 4},
    {5, 6}
  };
  System.out.println(arrToString(arr4)); // expected: [[1, 2], [3, 4], [5, 6]]


// test case for 2d sum; passed
  int[][] nums = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };
  System.out.println("Sum of 2D array: " + arr2DSum(nums)); // expected: 45

  int[][] nums2 = {
    {0, 0},
    {0, 0}
  };
  System.out.println("Sum of 2D array: " + arr2DSum(nums2)); // expected: 0

  int[][] nums3 = {
    {10, 20},
    {30, 40},
    {50, 60}
  };
  System.out.println("Sum of 2D array: " + arr2DSum(nums3)); // expected: 210


// test case for array swap; passed
  int[][] array1 = {
    {1, 2, 3},
    {4, 5, 6}
  };
  System.out.println("Swap array: " + arrToString(swapRC(array1)));; // expected : [[1,4],[2,5],[3,6]]

  int[][] array2 = {
    {1, 2},
    {3, 4},
    {5, 6}
  };
  System.out.println("Swapped array: " + arrToString(swapRC(array2))); // expected: [[1, 3, 5], [2, 4, 6]]

  int[][] array3 = {
    {1}
  };
  System.out.println("Swapped array: " + arrToString(swapRC(array3))); // expected: [[1]]
}
}
