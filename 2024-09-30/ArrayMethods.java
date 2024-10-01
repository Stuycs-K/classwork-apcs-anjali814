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
      sum = sum + nums [i] [j];
    }
  }
  return null;//place holder return value so it compiles.
}

public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}




public static void main(String[] args){
  int[][] arr = {
    {2,3,4},
    {5,6,7},
    {8,0,4}
  };
  System.out.println(arrToString(arr)); // expected: "[[2, 3, 4], [5, 6, 7], [8, 0, 4]"

  int[][] nums = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };
  System.out.println("Sum of 2D array: " + arr2DSum(nums)); // expected: 45
}


}
