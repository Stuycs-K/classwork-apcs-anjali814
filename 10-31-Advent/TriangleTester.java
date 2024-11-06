import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
// Part A
  public static int countTrianglesA(String filename) {
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String line = input.nextLine();
        String[] parts = line.split(" ");
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
    boolean isTri = true;
    for (int i = 0; i < sides.length && isTri; i++) {
      if (sides[0] + sides[1] <= sides[2]) {
        return false;
      }
      sides = new int[]{sides[1], sides[2], sides[0]};
    }
    return true;
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
         String[] parts = line.split(" ");

         if (parts.length == 3) {
           int a = Integer.parseInt(parts[0]);
           int b = Integer.parseInt(parts[1]);
           int c = Integer.parseInt(parts[2]);

           column1 = appendToColumn(column1, a);
           column2 = appendToColumn(column2, b);
           column3 = appendToColumn(column3, c);
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


  public static void main(String[] args){
    int[] teststuff = new int[]{5, 10, 25};
    System.out.println(teststuff + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{5, 100, 5};
    System.out.println(teststuff + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{5, 5, 2};
    System.out.println(teststuff + " (should be TRUE): " + isTriangle(teststuff));
    teststuff = new int[]{1, 2, 3};
    System.out.println(teststuff + " (should be FALSE): " + isTriangle(teststuff));
    teststuff = new int[]{3, 2, 3};
    System.out.println(teststuff + " (should be TRUE): " + isTriangle(teststuff));

    String filename = "inputTri.txt";
    int validTriangles = countTrianglesA(filename);
    System.out.println("Valid triangles in Part A: " + validTriangles);
      }

}
