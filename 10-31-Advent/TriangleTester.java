public class TriangleTester {

  public static int countTrianglesA(String filename) {
    int count = 0;
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

  public static boolean isTriangle(int[] sides) {
    boolean isTri = true;
    for (int i = 0; i < sides.length && isTri; i++) {
      if (sides[0] + sides[1] <= sides[2]) {
        isTri = false;
      }
      sides = new int[]{sides[1], sides[2], sides[0]};
    }
    return isTri;
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
      }

}
