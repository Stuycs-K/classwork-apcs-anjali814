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




public static void main (String [] args){
// test for array to string; passed
int[] testArray1 = {1, 2, 3, 4, 5};
  System.out.println("Test Case 1: " + arrayToString(testArray1)); // Expected: [1, 2, 3, 4, 5]


int [] original = {1 ,2 ,3, 4};
int [] copy = returnCopy(original);
System.out.println ("original" + arrayToString (original)); // Expected: [1, 2, 3, 4]
System.out.println("Copy: " + arrayToString(copy)); // Expected: [1, 2, 3, 4]
System.out.println("Arrays are equal: " + arrayToString(original).equals(arrayToString(copy))); // Expected: true
}
