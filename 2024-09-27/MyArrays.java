public class MyArrays {
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

public static int[] returnCopy(int[] ary) {
  int[] copyOfArray = new int[ary.length];
  for (int i = 0; i < ary.length; i++) {
    copyOfArray[i] = ary[i];
  }
  return copyOfArray;
}

public static int[] concatArray(int[]ary1,int[]ary2) {
  int[] result = new int[ary1.length + ary2.length];
  for (int i = 0; i < ary1.length; i++) {
    result[i] = ary1[i];
  }
  for (int i = 0; i < ary2.length; i++) {
    result[i] = ary2[i];
  }
  return result;
}



public static void main (String [] args){
// test for array to string; passed
int[] testArray1 = {1, 2, 3, 4, 5};
  System.out.println("Test Case 1: " + arrayToString(testArray1)); // Expected: [1, 2, 3, 4, 5]

// test for copy; passed
int [] original = {1, 2, 3, 4};
int [] copy = returnCopy(original);
System.out.println ("Original: " + arrayToString (original)); // Expected: [1, 2, 3, 4]
System.out.println("Copy: " + arrayToString(copy)); // Expected: [1, 2, 3, 4]
System.out.println("Arrays are equal: " + arrayToString(original).equals(arrayToString(copy))); // Expected: true

// test for concat;
int [] array1 = {1, 2, 3, 4};
int [] array2 = {5, 6, 7, 8};
int[] concatenated = concatArray(array1, array2);
System.out.println("Concatenated: " + arrayToString(concatenated)); // Expected: [1, 2, 3, 4, 5, 6, 7, 8]
}
}
