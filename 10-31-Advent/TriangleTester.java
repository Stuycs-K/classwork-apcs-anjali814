public class TriangleTester {

  public static int countTrianglesA(String filename) {
    int count = 0
    try {
      File file = new File(filename);
      while(file.hasNextLine()){
        system.out.println(input.next());
        String[] parts = line.split(" ");
        if (parts.length == 3) {
          int a = Integer.parseInt(parts[0]);
          int b = Integer.parseInt(parts[1]);
          int c = Integer.parseInt(parts[2]);
          if (isTriangle(a, b, c)) {
            count++;
          }
        }
      }
    }

    return count;
  }
  
/*
  public static boolean isTriangle(int[] sides) {
    boolean isTri = true;
    for (int i = 0; i < size.length && isTri; i++) {
      if (size[0] + size[1] >= size[2]) {
        isTri = false;
      }
    }
    return isTri;
  }
  */

  public static void main(String[] args){
    System.out.println()
      }

}
