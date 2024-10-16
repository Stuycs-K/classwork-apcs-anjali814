public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return a.distanceTo(b);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);

    // test cases for point
    System.out.println ("Point 1: " + p1); // Expected: (1.0, 1.0)
    System.out.println ("Point 2: " + p2); // Expected: (-1.0, -1.0)
    System.out.println ("Point 3: " + p3); // Expected: (3.0, 4.0)


    Point cp1 = new Point(p1);
    Point cp2 = new Point(p2);
    Point cp3 = new Point(p3);

    System.out.println ("Copy point 1: " + cp1); // Expected: (1.0, 1.0)
    System.out.println ("Copy point 2: " + cp2); // Expected: (-1.0, -1.0)
    System.out.println ("Copy point 3: " + cp3); // Expected: (3.0, 4.0)


    System.out.println("Distance from p1 to p2 using distance: " + distance(p1,p2));
    System.out.println("Distance from p1 to p2 using Point.distance: " + Point.distance(p1,p2));
    System.out.println("Distance from p1 to p2 using distanceTo: " + p1.distanceTo(p2));


    // Equilateral triangle
    double sideLength = 3.0;
    Point ep1 = new Point(1, 0);
    Point ep2 = new Point(4, 0);
    Point ep3 = new Point(ep1.getX() + (sideLength / 2), (Math.sqrt(3) / 2) * sideLength);

    System.out.println("Point A: " + ep1); // Vertex 1
    System.out.println("Point B: " + ep2); // Vertex 2
    System.out.println("Point C: " + ep3); // Vertex 3

    // Print side lengths
    double ab = ep1.distanceTo(ep2);
    double bc = ep2.distanceTo(ep3);
    double ca = ep3.distanceTo(ep1);

    System.out.println("Length AB:" + ab);
    System.out.println("Length BC:" + bc);
    System.out.println("Length CA:" + ca);
  }
}
