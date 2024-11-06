import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class TriangleTester {

// Part A
  public static int countTrianglesA(String filename) {
    int count = 0;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()){
        String line = input.nextLine();
        String[] parts = line.split("\\s+");

        if (parts.length == 3) {
          int a = Integer.parseInt(parts[0]);
          int b = Integer.parseInt(parts[1]);
          int c = Integer.parseInt(parts[2]);

          if (isTriangle(new int[]{a, b, c})) {
            count++;
          }
        }
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
      return 0;
    }
    return count;
  }

  public static boolean isTriangle(int[] sides) {
    return sides[0] + sides[1] > sides[2] &&
    sides[0] + sides[2] > sides[1] &&
    sides[1] + sides[2] > sides[0];
  }


// Part B
   public static int countTrianglesB(String filename) {
     int count = 0;
     int[] column1 = new int[0];
     int[] column2 = new int[0];
     int[] column3 = new int[0];

     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);

       while(input.hasNextLine()){
         String line = input.nextLine();
         String[] parts = line.split("\\s+");

         if (parts.length == 3) {
           int a = Integer.parseInt(parts[0]);
           int b = Integer.parseInt(parts[1]);
           int c = Integer.parseInt(parts[2]);

           column1 = appendToColumn(column1, a);
           column2 = appendToColumn(column2, b);
           column3 = appendToColumn(column3, c);
         }
       }

       for (int i = 0; i < column1.length; i++) {
         int[] sides = new int[]{column1[i], column2[i], column3[i]};
         if (isTriangle(sides)) {
           count++;
         }
       }

       input.close();
     } catch (FileNotFoundException e) {
       System.out.println("File not found: " + filename);
       return 0;
     }
     return count;
   }

   public static int[] appendToColumn(int[] column, int value) {
     int[] newColumn = new int[column.length + 1];
     for (int i = 0; i < column.length; i++) {
       newColumn[i] = column[i];
     }
     newColumn[column.length] = value;
     return newColumn;
   }



  public static void main(String[] args){
    int[] teststuff = new int[]{5, 10, 25};
    System.out.println(Arrays.toString(teststuff) + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{5, 100, 5};
    System.out.println(Arrays.toString(teststuff) + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{5, 5, 2};
    System.out.println(Arrays.toString(teststuff) + " (should be TRUE): " + isTriangle(teststuff));
    teststuff = new int[]{1, 2, 3};
    System.out.println(Arrays.toString(teststuff) + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{3, 2, 3};
    System.out.println(Arrays.toString(teststuff) + " (should be TRUE): " + isTriangle(teststuff));

    String filename = "inputTri.txt";
    int validTrianglesA = countTrianglesA(filename);
    System.out.println("Valid triangles in Part A: " + validTrianglesA);

    int validTrianglesB = countTrianglesB(filename);
    System.out.println("Valid triangles in Part B: " + validTrianglesB);
  }

}
