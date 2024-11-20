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
        String line = input.nextLine().trim();

        if (line.isEmpty()) {
          continue;
        }

        String[] parts = line.split("\\s+");

        if (parts.length != 3) {
          continue;
        }

        try {
          int a = Integer.parseInt(parts[0]);
          int b = Integer.parseInt(parts[1]);
          int c = Integer.parseInt(parts[2]);

          if (a > b) { int temp = a; a = b; b = temp; }
          if (b > c) { int temp = b; b = c; c = temp; }
          if (a > b) { int temp = a; a = b; b = temp; }

          if (a + b > c) {
            count++;
          }
        } catch (NumberFormatException e) {
          System.out.println("Skipping invalid line: " + line);
        }
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
      return 0;
    }
    return count;
  }


/* Part B
   public static int countTrianglesB(String filename) {
     int count = 0;

     try {
       File file = new File(filename);
       Scanner input = new Scanner(file);

       String[] lines = new String[3];
       int lineIndex = 0;

       while(input.hasNextLine()){
         lines[lineIndex] = input.nextLine();
         lineIndex++;

         if (lineIndex == 3) {
           for (int i = 0; i < 3; i++) {
             String[] parts1 = lines[0].split("\\s+");
             String[] parts2 = lines[1].split("\\s+");
             String[] parts3 = lines[2].split("\\s+");

             if (parts1.length == 3 && parts2.length == 3 && parts3.length == 3) {
               int a = Integer.parseInt(parts1[i]);
               int b = Integer.parseInt(parts2[i]);
               int c = Integer.parseInt(parts3[i]);
               if (isTriangle(a, b, c)) {
                 count++;
               }
             }
           }
           lineIndex = 0;
         }
       }
       input.close();
     } catch (FileNotFoundException e) {
       System.out.println("File not found: " + filename);
       return 0;
     }
     return count;
   }
*/

  public static void main(String[] args){
    String filename = "inputTri.txt";
    int validTrianglesA = countTrianglesA(filename);
    System.out.println("Valid triangles in Part A: " + validTrianglesA);

/*    int validTrianglesB = countTrianglesB(filename);
    System.out.println("Valid triangles in Part B: " + validTrianglesB);
    */
  }
}
