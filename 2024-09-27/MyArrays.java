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


public static void main (String [] args)
{int[] testArray1 = {1, 2, 3, 4, 5};
  System.out.println("Test Case 1: " + arrayToString(testArray1)); // Expected: [1, 2, 3, 4, 5]

//int [] original = {1 ,2 ,3, 4}
//int [] copy = returnCopy(original);

//System.out.println ("original" + arrayToString (original));
}
}
