//anjali bechu
//abechu60@stuy.edu

//jaden bae
//jabae50@stuy.edu

public class ArrayMethods{
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
    return copied;
  }
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
  System.out.println(arrToString(arr2)); // expected: []

  int[][] arr3 = {
    {1, 2},
    {3, 4},
    {5, 6}
  };
  System.out.println(arrToString(arr3)); // expected: [[1, 2], [3, 4], [5, 6]]


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
  System.out.println("Swapped array: " + arrToString(swapRC(array1)));; // expected : [[1,4], [2,5], [3,6]]

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

// test case for replace neg; passed
  int[][] neg = {
    {-5, -2, -3},
    {-4, -1, -8},
    {-9, -7, -3}
  };

  replaceNegative(neg);
  System.out.println("Replace negative array: " + arrToString(neg)); // expected: [[1, 0, 0], [0, 1, 0], [0, 0, 1]]

  int[][] neg2 = {
    {5, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };

 replaceNegative(neg2);
 System.out.println("Replace negative array: " + arrToString(neg2)); // expected: [[5, 2, 3], [4, 5, 6], [7, 8, 9]]

 int[][] neg3 = {
    {-5, 2, 3},
    {4, -1, 6},
    {7, 8, -3}
  };
  replaceNegative(neg3);
  System.out.println("Replace negative array: " + arrToString(neg3)); // expected: [[1, 2, 3], [4, 1, 6], [7, 8, 1]]

  int[][] neg4 = {
    {-5, -2, 3, 4},
    {6, -1, -8, 9},
    {10, 11, -3, -12},
    {-13, 14, 15, -16}
  };
  replaceNegative(neg4);
  System.out.println("Replace negative array: " + arrToString(neg4)); // expected: [[1, 0, 3, 4], [6, 1, 0, 9], [10, 11, 1, 0], [0, 14, 15, 1]]

  int[][] ary = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };
  int[][] copiedAry = copy(ary);
  System.out.println("Original array: " + arrToString(ary));  // Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
  System.out.println("Copied array: " + arrToString(copiedAry));   // Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
  ary[0][0] = 100;
  System.out.println("Original array: " + arrToString(ary));  // Expected: [[100, 2, 3], [4, 5, 6], [7, 8, 9]]
  System.out.println("Copied array: " + arrToString(copiedAry));   // Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
}
}
