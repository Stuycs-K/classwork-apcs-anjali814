// I think my partner forgot to email me the file from class because it's not in my inbox
// I don't have his email because I wrote my email on the file...

public class ArrayMethods {
  public static String arrayToString(int[] array) {
    String result = "[";
    for (int i = 0; i < array.length; i++) {
        result += array[i];
        if (i < array.length - 1) {
            result += ", ";
        }
    }
    result += "]";
    return result;
}

public static String arrToString(int[][]ary){
  if (ary.length == 0) return "[]";
  String result = "[";
  for (int i = 0; i < ary.length; i++) {
      result += arrayToString(ary[i]);
      if (i < ary.length - 1) {
          result += ", ";
      }
  }
  result += "]";
  return result;
}



  public static void main (String [] args){
    int[] array1 = {1, 2, 3, 4};
    System.out.println(arrayToString(array1)); // expectec: "[1, 2, 3, 4]"

    int[][] array2 = {
      {2, 3, 4},
      {5, 6, 7},
      {2, 1, 10}
    };
    System.out.println(arrToString(array2)); // expected: "[[2, 3, 4], [5, 6, 7], [2, 1, 10]"
  }
}
