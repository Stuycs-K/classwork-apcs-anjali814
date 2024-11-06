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

          if (isTriangle(a, b, c)) {
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

  public static boolean isTriangle(int a, int b, int c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
  }


// Part B
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
           String[] parts1 = lines[0].split("\\s+");
           String[] parts2 = lines[1].split("\\s+");
           String[] parts3 = lines[2].split("\\s+");

           if (parts1.length == 3 && parts2.length == 3 && parts3.length == 3) {
             if (isTriangle(Integer.parseInt(parts1[0]), Integer.parseInt(parts2[0]), Integer.parseInt(parts3[0]))) count++;
             if (isTriangle(Integer.parseInt(parts1[1]), Integer.parseInt(parts2[1]), Integer.parseInt(parts3[1]))) count++;
             if (isTriangle(Integer.parseInt(parts1[2]), Integer.parseInt(parts2[2]), Integer.parseInt(parts3[2]))) count++;
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



  public static void main(String[] args){
    String filename = "inputTri.txt";
    int validTrianglesA = countTrianglesA(filename);
    System.out.println("Valid triangles in Part A: " + validTrianglesA);

    int validTrianglesB = countTrianglesB(filename);
    System.out.println("Valid triangles in Part B: " + validTrianglesB);
  }
}
